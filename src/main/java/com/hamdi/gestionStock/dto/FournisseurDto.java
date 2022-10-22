package com.hamdi.gestionStock.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class FournisseurDto {
    private String name;
    private String secondname;
    private String photo;
    private String mail;
    private AdresseDto adresse;
    private String numTel;
    private List<CommandeFournisseurDto> commandeFournisseurs;
}
