package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Integer, Fournisseur> {
}
