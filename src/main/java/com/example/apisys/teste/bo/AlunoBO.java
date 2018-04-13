package com.example.apisys.teste.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apisys.teste.dao.AlunoDAO;
import com.example.apisys.teste.model.Aluno;

@Service
public class AlunoBO {
	
	@Autowired
	private AlunoDAO alunoDAO;
	
	public List<Aluno> listar() {
		return alunoDAO.findAll();
	}
	
	public Aluno salvar(Aluno aluno) {
		return alunoDAO.save(aluno);
	}
	
	public Aluno editar(Aluno aluno) {
		return alunoDAO.save(aluno);
	}
	
	public void deletar(Long id) {
		alunoDAO.deleteById(id);
	}

}
