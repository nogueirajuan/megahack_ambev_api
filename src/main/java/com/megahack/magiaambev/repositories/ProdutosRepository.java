package com.megahack.magiaambev.repositories;

import com.megahack.magiaambev.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Integer> {
}
