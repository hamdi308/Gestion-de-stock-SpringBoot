package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.LigneCommandeClientDto;
import com.hamdi.gestionStock.dto.LigneVenteDto;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {
    public static List<String> validate(LigneVenteDto ligneVenteDto){
        List<String> errors = new ArrayList<>();
        if(ligneVenteDto==null){
            errors.add("No Vente selected !");
            errors.add("Enter quantite !");
            errors.add("Please enter the unit Price ! ");
            return errors;
        }
        if(ligneVenteDto.getVente()==null){
            errors.add("No Vente selected !");
        }
        if(ligneVenteDto.getQuantite()==null){
            errors.add("Enter quantite !");
        }
        if(ligneVenteDto.getPrixUnitaire()==null){
            errors.add("Please enter the unit Price ! ");
        }
        return errors;
    }
}
