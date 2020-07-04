package com.megahack.magiaambev.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localizacao")
@Getter
@Builder
@ToString
public class Location {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "endereco")
    private String endereço;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
}
