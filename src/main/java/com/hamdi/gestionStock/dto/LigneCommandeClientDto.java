package com.hamdi.gestionStock.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
@Builder
public class LigneCommandeClientDto {
    private ArticleDto article;
    private CommandeClientDto commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
