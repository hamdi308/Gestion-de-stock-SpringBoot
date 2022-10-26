package com.hamdi.gestionStock.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="CommandesClient")
public class CommandeClient extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "datecommand")
    private Instant dateCommand;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @ManyToOne()
    @JoinColumn(name="idClient")
    private Client client;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClientList;
}
