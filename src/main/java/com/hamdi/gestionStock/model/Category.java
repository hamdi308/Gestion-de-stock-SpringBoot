package com.hamdi.gestionStock.model;

import lombok.*;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name="Categorys")
public class Category extends AbstractEntity{
    @Column(name="code")
    private String code;
    @Column(name="designation")
    private String designation;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;

}
