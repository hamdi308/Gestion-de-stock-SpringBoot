package com.hamdi.gestionStock.repository;

import com.hamdi.gestionStock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Integer, Article> {
}
