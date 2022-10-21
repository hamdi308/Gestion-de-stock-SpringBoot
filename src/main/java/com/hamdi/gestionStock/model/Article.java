package com.hamdi.gestionStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

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
