package com.hamdi.gestionStock.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Users")
public class User extends AbstractEntity{
    @Column(name="name")
    private String name;
    @Column(name="secondname")
    private String secondName;
    @Column(name="email")
    private String email;
    @Column(name="birthdate")
    private String dateOfBirth;
    @Column(name="password")
    private String password;
    @Embedded
    private Adresse adresse;
    @Column(name="photo")
    private String photo;
    @ManyToOne
    @JoinColumn(name = "identerprise")
    private Entreprise entreprise;
    @OneToMany(mappedBy = "user")
    private List<Roles> roles;
}
