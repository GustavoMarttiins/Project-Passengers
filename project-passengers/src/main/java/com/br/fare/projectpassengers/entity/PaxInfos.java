package com.br.fare.projectpassengers.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaxInfos {

    private String nome;
    private int idade;
    private String email;
    private String cpf;
    private Long telefone;
    private String endereco;
    private String cep;


}
