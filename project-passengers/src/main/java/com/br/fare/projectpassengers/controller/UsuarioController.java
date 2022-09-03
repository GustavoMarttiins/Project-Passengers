package com.br.fare.projectpassengers.controller;

import com.br.fare.projectpassengers.entity.Usuario;
import com.br.fare.projectpassengers.repository.UsuarioRepository;
import com.br.fare.projectpassengers.service.UsuarioService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/usuario")
@Slf4j
public class UsuarioController {

    private Usuario usuario;
    private UsuarioService service;
    private ObjectMapper objectMapper;
    private UsuarioRepository repository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) throws JsonProcessingException {
        service.cadastrarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
    }
}
