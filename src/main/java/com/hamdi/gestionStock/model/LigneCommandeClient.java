package com.hamdi.gestionStock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="LignesCommandesClient")
public class LigneCommandeClient extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name="idcommandeclient")
    private CommandeClient commandeClient;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name="prixunitaire")
    private BigDecimal prixUnitaire;
}
