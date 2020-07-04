package com.megahack.magiaambev.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
@Getter
@Builder
@ToString
public class Produto {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "foto")
    private String foto;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco")
    private Double preco;
    @Column(name = "estoque")
    private Integer estoque;
}
