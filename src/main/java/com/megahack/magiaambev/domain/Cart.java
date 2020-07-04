package com.megahack.magiaambev.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "carrinho")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "store")
    private Store store;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany
    private List<ItemCart> items;

}
