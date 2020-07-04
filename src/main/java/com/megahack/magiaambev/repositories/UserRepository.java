package com.megahack.magiaambev.repositories;

import com.megahack.magiaambev.domain.Store;
import com.megahack.magiaambev.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
