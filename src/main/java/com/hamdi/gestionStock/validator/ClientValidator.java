package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.ClientDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class ClientValidator {
    public static List<String> validate(ClientDto clientDto){
        List<String> errors = new ArrayList<>();
        if(clientDto==null){
            errors.add("Please enter the client name ");
            errors.add("Please enter the second name of the client ! ");
            errors.add("Please enter the client mail ! ");
            errors.add("Please enter the phone Number of the client ! ");
            return errors;
        }
        if(!StringUtils.hasLength(clientDto.getName())){
            errors.add("Please enter the client name ");
        }
        if(!StringUtils.hasLength(clientDto.getSecondname())){
            errors.add("Please enter the second name of the client ! ");
        }
        if(!StringUtils.hasLength(clientDto.getMail())){
            errors.add("Please enter the client mail ! ");
        }
        if(!StringUtils.hasLength(clientDto.getNumTel()) ){
            errors.add("Please enter the phone Number of the client ! ");
        }
        return errors;
    }

}
