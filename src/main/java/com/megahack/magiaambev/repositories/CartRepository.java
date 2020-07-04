package com.megahack.magiaambev.repositories;

import com.megahack.magiaambev.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
