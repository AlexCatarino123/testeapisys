package com.example.apisys.teste.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apisys.teste.model.Curso;

public interface CursoDAO extends JpaRepository<Curso, Long> {

}
