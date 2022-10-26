package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Integer,Ventes> {
}
