package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.RolesDto;
import com.hamdi.gestionStock.dto.VentesDto;

import java.util.ArrayList;
import java.util.List;

public class VentesValidator {
    public static List<String> validate(VentesDto ventesDto){
        List<String> errors = new ArrayList<>();
        if(ventesDto==null){
            errors.add("Please enter the Vente Code !");
            errors.add("Enter a Date");
            errors.add("Enter your comment");
            return errors;
        }
        if(ventesDto.getCode()==null){
            errors.add("Please enter the Vente Code !");
        }
        if(ventesDto.getDateVente()==null){
            errors.add("Enter a Date");
        }
        if(ventesDto.getCommentaire()==null) {
            errors.add("Enter your comment");
        }
        return errors;
    }
}
