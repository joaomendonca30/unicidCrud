package com.unicid.crud.controller;

import com.unicid.crud.model.Aluno;
import com.unicid.crud.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "http://localhost:63342")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {

        System.out.println("chegou -> "+ aluno);
        Aluno alunoSalvo = alunoRepository.save(aluno);
        return ResponseEntity.ok(alunoSalvo);
    }
}