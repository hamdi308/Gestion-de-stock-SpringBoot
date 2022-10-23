package com.hamdi.gestionStock.model;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Fournisseurs")
public class Fournisseur extends AbstractEntity{
    @Column(name="name")
    private String name;
    @Column(name="secondname")
    private String secondname;
    @Column(name="photo")
    private String photo;
    @Column(name="mail")
    private String mail;
    @Embedded
    private Adresse adresse;
    @Column(name="numTel")
    private String numTel;
    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;

}
