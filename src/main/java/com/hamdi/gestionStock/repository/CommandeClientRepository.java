package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
