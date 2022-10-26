package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.CommandeFournisseurDto;
import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {
    public static List<String> validate(CommandeFournisseurDto commandeFournisseurDto){
        List<String> errors =new ArrayList<String>();
        if(commandeFournisseurDto==null){
            errors.add("Enter Valid Code !");
            errors.add("Enter Valid date !");
            errors.add("Select suplier !");
            return errors;
        }
        if(commandeFournisseurDto.getCode()==null){
            errors.add("Enter Valid Code !");
        }
        if(commandeFournisseurDto.getDateCommande()==null){
            errors.add("Enter Valid date !");
        }
        if(commandeFournisseurDto.getFournisseur()==null){
            errors.add("Select suplier !");
        }
        return errors;
    }
}
