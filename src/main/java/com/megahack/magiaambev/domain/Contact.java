package com.megahack.magiaambev.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contato")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "tel")
    private String tel;
}