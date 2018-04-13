package com.example.apisys.teste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apisys.teste.model.Aluno;

public interface AlunoDAO extends JpaRepository<Aluno, Long> {

}
