package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Pelicula;
import main.services.PeliculaService;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaService peliculaService;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarAlmacenes(){
		return peliculaService.listarPeliculas();
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula buscarAlmacen (@PathVariable(name="codigo") Long codigo) {
		return peliculaService.buscarPelicula(codigo);
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarAlmacen(@RequestBody Pelicula pelicula) {
		return peliculaService.guardarPelicula(pelicula);
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarAlmacen(@PathVariable(name="codigo") Long codigo, @RequestBody Pelicula pelicula) {
		
		Pelicula peliculaSeleccionada = peliculaService.buscarPelicula(codigo);
		
		peliculaSeleccionada.setNombre(pelicula.getNombre());
		peliculaSeleccionada.setCalificacion_edad(pelicula.getCalificacion_edad());
		
		return peliculaService.actualizarPelicula(peliculaSeleccionada);
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarAlmacen(@PathVariable(name="codigo")Long codigo) {
		peliculaService.eliminarPelicula(codigo);
	}
}
