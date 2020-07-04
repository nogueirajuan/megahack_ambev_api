package com.megahack.magiaambev.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lojas")
@Getter
@Builder
@ToString(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @ManyToOne
    @JoinColumn(name = "localizacao")
    private Location location;

    @OneToMany(mappedBy = "store")
    private List<StoreProduct> storeProduct;
}
