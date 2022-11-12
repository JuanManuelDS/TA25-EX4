package main.services;

import java.util.List;

import main.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSalas();
	
	public Sala guardarSala(Sala sala);
	
	public Sala buscarSala(Long codigo);
	
	public Sala actualizarSala(Sala sala);
	
	public void eliminarSala(Long codigo);
}
