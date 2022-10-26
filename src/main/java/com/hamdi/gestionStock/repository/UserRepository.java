package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Integer, User> {
}
