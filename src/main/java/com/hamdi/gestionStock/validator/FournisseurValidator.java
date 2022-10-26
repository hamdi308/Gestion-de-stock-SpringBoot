package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.FournisseurDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurDto fournisseurDto){
        List<String> errors = new ArrayList<>();
        if(fournisseurDto==null){
            errors.add("Please enter the supplier name ");
            errors.add("Please enter the supplier name of the client ! ");
            errors.add("Please enter the supplier mail ! ");
            errors.add("Please enter the phone Number of the supplier ! ");
            return errors;
        }
        if(!StringUtils.hasLength(fournisseurDto.getName())){
            errors.add("Please enter the supplier name ");
        }
        if(!StringUtils.hasLength(fournisseurDto.getSecondname())){
            errors.add("Please enter the second name of the supplier ! ");
        }
        if(!StringUtils.hasLength(fournisseurDto.getMail())){
            errors.add("Please enter the supplier mail ! ");
        }
        if(!StringUtils.hasLength(fournisseurDto.getNumTel()) ){
            errors.add("Please enter the phone Number of the supplier ! ");
        }
        return errors;
    }
}
