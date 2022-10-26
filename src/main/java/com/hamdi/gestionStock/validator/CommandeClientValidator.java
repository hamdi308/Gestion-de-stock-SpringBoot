package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.CommandeClientDto;
import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {
    public static List<String> validate(CommandeClientDto commandeClientDto){
        List<String> errors =new ArrayList<String>();
        if(commandeClientDto==null){
            errors.add("Enter valid code !");
            errors.add("Enter Valid date !");
            errors.add("Select clients !");
            return errors;
        }
        if(commandeClientDto.getCode()==null){
            errors.add("Enter valid code !");
        }
        if(commandeClientDto.getDateCommand()==null){
            errors.add("Enter Valid date !");
        }
        if(commandeClientDto.getClient()==null){
            errors.add("Select clients !");
        }
        return errors;
    }
}
