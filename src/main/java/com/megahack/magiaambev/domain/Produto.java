package com.megahack.magiaambev.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "foto")
    private String foto;
    @Column(name = "descricao")
    private String descricao;
}
