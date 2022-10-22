package com.hamdi.gestionStock.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private String name;
    private String description;
    private AdresseDto adresse;
    private String codeFiscal;
    private String photo;
    private String email;
    private String numTel;
    private String siteWeb;
    private List<UserDto> users;
}
