package com.example.apisys.teste.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.example.apisys.enums.Status;

@Entity
@SequenceGenerator(name = "ALUN_SEQ", sequenceName = "ALUNO_SEQ", initialValue = 1, allocationSize = 1)
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALUN_SEQ")
	private Long id;

	private String nome;

	@OneToOne
	private Curso curso;

	private Integer matricula;

	private Integer semestre;

	@Enumerated(EnumType.STRING)
	private Status status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
