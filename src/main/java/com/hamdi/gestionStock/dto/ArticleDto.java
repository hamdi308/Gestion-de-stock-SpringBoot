package com.hamdi.gestionStock.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private String codeArticle;
    private String designation;
    private BigDecimal prixunitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixunitaireTtc;
    private String photo;
    private CategoryDto category;
}
