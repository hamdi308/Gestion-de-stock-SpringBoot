package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.LigneCommandeClientDto;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {
    public static List<String> validate(LigneCommandeClientDto ligneCommandeClientDto){
        List<String> errors = new ArrayList<>();
        if(ligneCommandeClientDto==null){
            errors.add("Select articles !");
            errors.add("Enter quantite !");
            errors.add("Please enter the unit Price ! ");
            errors.add("Please enter the Quantity ! ");
            return errors;
        }
        if(ligneCommandeClientDto.getArticle()==null){
            errors.add("Select articles !");
        }
        if(ligneCommandeClientDto.getQuantite()==null){
            errors.add("Enter quantite !");
        }
        if(ligneCommandeClientDto.getPrixUnitaire()==null){
            errors.add("Please enter the unit Price ! ");
        }
        if(ligneCommandeClientDto.getQuantite()==null){
            errors.add("Please enter the Quantity ! ");
        }
        return errors;
    }
}
