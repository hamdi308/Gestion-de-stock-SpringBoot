package com.hamdi.gestionStock.model;

import com.hamdi.gestionStock.dto.CategoryDto;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
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
