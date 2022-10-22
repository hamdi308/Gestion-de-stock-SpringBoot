package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Article;
import com.hamdi.gestionStock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {
    private Article article;
    private CommandeFournisseur commandeFournisseur;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
