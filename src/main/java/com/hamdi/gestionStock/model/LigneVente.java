package com.hamdi.gestionStock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="LinesVentes")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name="prixunitaire")
    private BigDecimal prixUnitaire;
}
