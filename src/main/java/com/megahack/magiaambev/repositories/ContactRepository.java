package com.megahack.magiaambev.repositories;

import com.megahack.magiaambev.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
