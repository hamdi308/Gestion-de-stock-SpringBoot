package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
