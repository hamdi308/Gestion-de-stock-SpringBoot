package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Integer, Category> {
}
