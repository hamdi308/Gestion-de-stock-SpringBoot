package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.LigneVenteDto;
import com.hamdi.gestionStock.dto.MvtStkDto;

import java.util.ArrayList;
import java.util.List;

public class MvtStkValidator {
    public static List<String> validate(MvtStkDto mvtStkDto){
        List<String> errors = new ArrayList<>();
        if(mvtStkDto==null){
            errors.add("Select type !");
            errors.add("No Articles selected !");
            errors.add("Please enter the quantity ! ");
            errors.add("Please Select a Date ! ");
            return errors;
        }
        if(mvtStkDto.getTypeMvt()==null){
            errors.add("Select type !");
        }
        if(mvtStkDto.getArticle()==null){
            errors.add("No Articles selected !");
        }
        if(mvtStkDto.getQuantite()==null){
            errors.add("Please enter the quantity ! ");
        }
        if(mvtStkDto.getDateMvt()==null){
            errors.add("Please Select a Date ! ");
        }
        return errors;
    }
}
