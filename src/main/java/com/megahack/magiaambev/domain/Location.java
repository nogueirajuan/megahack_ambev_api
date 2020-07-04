package com.megahack.magiaambev.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "localizacao")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
