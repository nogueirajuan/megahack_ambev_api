package com.megahack.magiaambev.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contato")
@Getter
@Builder
@ToString
public class Contact {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "tel")
    private String tel;
}