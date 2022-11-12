package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ISalaDAO;
import main.dto.Sala;

@Service
public class SalaService implements ISalaService{

	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSalas() {
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala buscarSala(Long codigo) {
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long codigo) {
		// TODO Auto-generated method stub
		iSalaDAO.deleteById(codigo);
	}
}
