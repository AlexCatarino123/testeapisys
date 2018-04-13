package com.example.apisys.teste.bo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apisys.teste.dao.CursoDAO;
import com.example.apisys.teste.model.Curso;

@Service
public class CursoBO {
	
	@Autowired
	private CursoDAO cursoDAO;
	
	public List<Curso> listar() {
		return cursoDAO.findAll();
	}
	
	public Curso salvar(Curso curso) {
		return cursoDAO.save(curso);
	}
	
	public Curso editar(Curso curso) {
		return cursoDAO.save(curso);
	}
	
	public void deletar(Long id) {
		cursoDAO.deleteById(id);
	}
	
	public Optional<Curso> buscarPorId(Long id) {
		return cursoDAO.findById(id);
	}

}
