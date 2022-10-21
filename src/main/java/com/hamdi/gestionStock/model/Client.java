package com.hamdi.gestionStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Clents")
public class Client extends AbstractEntity{
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
    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
}
