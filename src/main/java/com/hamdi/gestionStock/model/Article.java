package com.hamdi.gestionStock.model;

import com.hamdi.gestionStock.dto.CategoryDto;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Articles")
public class Article extends AbstractEntity{
    @Column(name="codeArticle")
    private String codeArticle;
    @Column(name="designation")
    private String designation;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @OneToMany(mappedBy = "article")
    private List<LigneVente> ligneVentes;
    @OneToMany(mappedBy = "article")
    private List<LigneCommandeClient> ligneCommandeClients;
    @OneToMany(mappedBy = "article")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
    @OneToMany(mappedBy = "article")
    private List<MvtStk> mvtStks;
    @Column(name="prixunitaireht")
    private BigDecimal prixunitaireHt;
    @Column(name="tauxtva")
    private BigDecimal tauxTva;
    @Column(name="prixunitairettc")
    private BigDecimal prixunitaireTtc;
    @Column(name="photo")
    private String photo;
    @ManyToOne
    @JoinColumn(name="idCategory")
    private Category category;
}
