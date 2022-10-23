package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Entreprise;
import com.hamdi.gestionStock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class FournisseurDto {
    private Integer id;
    private String name;
    private String secondname;
    private String photo;
    private String mail;
    private AdresseDto adresse;
    private String numTel;
    private List<CommandeFournisseurDto> commandeFournisseurs;
    public FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur==null){
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .name(fournisseur.getName())
                .secondname(fournisseur.getSecondname())
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();
    }
    public Fournisseur toEntity(FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;
            //throw Exception
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setName(fournisseurDto.getName());
        fournisseur.setSecondname(fournisseurDto.getSecondname());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNumTel(fournisseurDto.getNumTel());
        return fournisseur;
    }
}
