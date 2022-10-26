package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<Integer, MvtStk> {
}
