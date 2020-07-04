package com.megahack.magiaambev.repositories;

import com.megahack.magiaambev.domain.ItemCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCartRepository extends JpaRepository<ItemCart, Integer> {
}
