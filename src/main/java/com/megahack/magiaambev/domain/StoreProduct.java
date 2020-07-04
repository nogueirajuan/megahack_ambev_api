package com.megahack.magiaambev.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "store_product")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StoreProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    @JsonBackReference
    private Store store;
    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonBackReference
    private Produto product;

    @Column(name = "preco")
    private Double preco;
    @Column(name = "estoque")
    private Integer estoque;

}
