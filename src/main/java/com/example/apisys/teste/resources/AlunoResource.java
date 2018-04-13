package com.example.apisys.teste.resources;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apisys.teste.bo.AlunoBO;
import com.example.apisys.teste.model.Aluno;

@CrossOrigin(origins = "*", allowedHeaders={"Content-Type", "Accept"})
@RestController
@RequestMapping(value = "/alunos", produces = MediaType.APPLICATION_JSON)
public class AlunoResource {
	
	@Autowired
	private AlunoBO alunoBO;
	
	@GetMapping
	public List<Aluno> listar() {
		return alunoBO.listar();
	}
	
	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return alunoBO.salvar(aluno);
	}
	
	@PutMapping
	public Aluno editar(@RequestBody Aluno aluno) {
		return alunoBO.editar(aluno);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Long id) {
		alunoBO.deletar(id);
	}

}
