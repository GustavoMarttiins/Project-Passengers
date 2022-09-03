package com.br.fare.projectpassengers.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_passageiros")
public class PaxInfos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_pax", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "ageSing", nullable = false)
    private int idade;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date", nullable = true)
    private LocalDateTime date;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "tell", nullable = true)
    private Long telefone;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "cep", nullable = false)
    private String cep;


}
