package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Article;
import com.hamdi.gestionStock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {
    private Instant dateMvt;
    private Instant quantite;
    private Article article;
    private TypeMvtStk typeMvt;
}
