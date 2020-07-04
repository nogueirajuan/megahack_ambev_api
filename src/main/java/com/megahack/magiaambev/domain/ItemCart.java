package com.megahack.magiaambev.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "item_carrinho")
@Getter
@Setter
@Builder
@ToString
public class ItemCart {
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "carrinho")
    private Cart cart;
    @ManyToOne
    @JoinColumn(name = "produto")
    private Produto produto;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "preco")
    private Double preco;

}
