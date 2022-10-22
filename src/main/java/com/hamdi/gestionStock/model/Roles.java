package com.hamdi.gestionStock.model;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Roles")
public class Roles extends AbstractEntity{
    @Column(name = "rolename")
    private String roleName;
    @ManyToOne
    @JoinColumn(name="iduser")
    private User user;
}
