package main.services;

import java.util.List;

import main.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPeliculas();
	
	public Pelicula buscarPelicula(Long codigo);
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(Long codigo);
}
