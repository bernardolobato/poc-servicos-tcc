package com.bernardolobato.poc.pocservicos.controller;

import com.bernardolobato.poc.pocservicos.controller.form.PessoaForm;
import com.bernardolobato.poc.pocservicos.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping("/")
    public ResponseEntity<?> salvar(@RequestBody PessoaForm pessoaForm) {
        try {
            this.pessoaRepository.save(pessoaForm.converter());
            return ResponseEntity.ok().body(pessoaForm);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }
}
