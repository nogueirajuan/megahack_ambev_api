package com.megahack.magiaambev.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "lojas")
@Getter
@Builder
@ToString
public class Store {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @ManyToOne
    @JoinColumn(name = "localizacao")
    private Location location;

    //private List<Contato> contatos;
}
