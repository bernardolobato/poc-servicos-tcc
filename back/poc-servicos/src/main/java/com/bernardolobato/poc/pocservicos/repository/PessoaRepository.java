package com.bernardolobato.poc.pocservicos.repository;

import com.bernardolobato.poc.pocservicos.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
