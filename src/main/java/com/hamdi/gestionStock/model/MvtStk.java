package com.hamdi.gestionStock.model;

import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="MovementsStock")
public class MvtStk extends AbstractEntity{
    @Column(name="datemvt")
    private Instant dateMvt;
    @Column(name="quantite")
    private BigDecimal quantite;
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;
    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;
}
