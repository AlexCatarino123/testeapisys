package com.example.apisys.teste.resources;

import java.util.List;
import java.util.Optional;

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

import com.example.apisys.teste.bo.CursoBO;
import com.example.apisys.teste.model.Curso;

@CrossOrigin(origins = "*", allowedHeaders={"Content-Type", "Accept"})
@RestController
@RequestMapping(value = "/cursos", produces = MediaType.APPLICATION_JSON)
public class CursoResource {
	
	@Autowired
	private CursoBO cursoBO;
	
	@GetMapping
	public List<Curso> listar() {
		return cursoBO.listar();
	}
	
	@PostMapping
	public Curso salvar(@RequestBody Curso curso) {
		return cursoBO.salvar(curso);
	}
	
	@PutMapping
	public Curso editar(@RequestBody Curso curso) {
		return cursoBO.editar(curso);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Long id) {
		cursoBO.deletar(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Curso> buscarPorId(@PathVariable("id") Long id) {
		return cursoBO.buscarPorId(id);
	}

}
