package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Adresse;
import com.hamdi.gestionStock.model.Client;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class AdresseDto {
    private Integer id;
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostal;
    private String pays;
    public static AdresseDto fromEntity(Adresse adresse){
       if(adresse==null){
           return null;
       }
       return AdresseDto.builder()
               .adresse1(adresse.getAdresse1())
               .adresse2(adresse.getAdresse2())
               .codePostal(adresse.getCodePostal())
               .ville(adresse.getVille())
               .pays(adresse.getPays())
               .build();
    }
    public static Adresse toEntity(AdresseDto adresseDto) {
        if (adresseDto == null) {
            return null;
            //throw Exception
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());
        adresse.setCodePostal(adresseDto.getCodePostal());
        return adresse;
    }
}
