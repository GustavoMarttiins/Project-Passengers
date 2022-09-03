package com.br.fare.projectpassengers.service;

import com.br.fare.projectpassengers.entity.Usuario;
import com.br.fare.projectpassengers.repository.UsuarioRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UsuarioService {

    private UsuarioRepository repository;

    private ObjectMapper objectMapper;

    private Usuario usuario;

    public Usuario cadastrarUsuario(Usuario usuario) {

        return repository.save(usuario);
    }
}
