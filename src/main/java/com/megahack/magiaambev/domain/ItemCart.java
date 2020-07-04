package com.megahack.magiaambev.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "item_carrinho")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ItemCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
