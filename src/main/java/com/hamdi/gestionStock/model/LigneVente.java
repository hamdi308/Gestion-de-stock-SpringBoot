package com.hamdi.gestionStock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="LinesVentes")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @Column(name="prixunitaire")
    private BigDecimal prixUnitaire;
}
