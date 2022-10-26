package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Article;
import com.hamdi.gestionStock.model.LigneVente;
import com.hamdi.gestionStock.model.MvtStk;
import com.hamdi.gestionStock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {
    private Integer id;
    private Instant dateMvt;
    private BigDecimal quantite;
    private Article article;
    private TypeMvtStk typeMvt;
    public static MvtStkDto fromEntity(MvtStk mvtStk){
        if(mvtStk==null){
            return null;
        }
        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .typeMvt(mvtStk.getTypeMvt())
                .build();
    }
    public static MvtStk toEntity(MvtStkDto mvtStkDto) {
        if (mvtStkDto == null) {
            return null;
            //throw Exception
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        mvtStk.setDateMvt(mvtStkDto.getDateMvt());
        mvtStk.setTypeMvt(mvtStkDto.getTypeMvt());
        return mvtStk;
    }
}
