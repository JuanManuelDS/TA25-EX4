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

import main.dto.Sala;
import main.services.SalaService;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaService salaService;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaService.listarSalas();
	}
	
	@GetMapping("/salas/{codigo}")
	public Sala buscarSala(@PathVariable(name="codigo")Long codigo){
		return salaService.buscarSala(codigo);
	}
	
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaService.guardarSala(sala);
	}
	
	@PutMapping("/salas/{codigo}")
	public Sala actualizarSala(@PathVariable(name="codigo") Long codigo, @RequestBody Sala sala) {
		Sala salaSeleccionada=salaService.buscarSala(codigo);
		
		salaSeleccionada.setNombre(sala.getNombre());
		salaSeleccionada.setPelicula(sala.getPelicula());
		
		return salaService.actualizarSala(salaSeleccionada);
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name="codigo") Long codigo) {
		salaService.eliminarSala(codigo);
	}
}
