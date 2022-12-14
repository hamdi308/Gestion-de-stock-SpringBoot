package com.hamdi.gestionStock.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Ventes")
public class Ventes extends AbstractEntity{
    @Column(name="code")
    private String code;
    @Column(name="datevente")
    private Instant dateVente;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @Column(name="commentaire")
    private String commentaire;
}
