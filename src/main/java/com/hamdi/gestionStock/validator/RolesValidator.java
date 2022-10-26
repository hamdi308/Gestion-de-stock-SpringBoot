package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.MvtStkDto;
import com.hamdi.gestionStock.dto.RolesDto;

import java.util.ArrayList;
import java.util.List;

public class RolesValidator {
    public static List<String> validate(RolesDto rolesDto){
        List<String> errors = new ArrayList<>();
        if(rolesDto==null){
            errors.add("Select a Role !");
            errors.add("Enter a User");
            return errors;
        }
        if(rolesDto.getRoleName()==null){
            errors.add("Select a Role !");
        }
        if(rolesDto.getUser()==null){
            errors.add("Enter a User");
        }
        return errors;
    }
}
