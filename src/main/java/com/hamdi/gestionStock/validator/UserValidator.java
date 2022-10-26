package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.UserDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class UserValidator {
    public static List<String> validate(UserDto userDto){
        List<String> errors = new ArrayList<>();
        if(userDto==null){
            errors.add("Please enter your valid Name ! ");
            errors.add("Please enter your valid SecondName ! ");
            errors.add("Please enter your valid Password ! ");
            errors.add("Please enter your mail ! ");
            errors.add("Please enter your Birth date ! ");
            errors.add("Please enter your valid Address ! ");
            errors.add("Please enter your postal code of residence ! ");
            errors.add("Please enter your origin state ! ");
            return errors;
        }
        if(!StringUtils.hasLength(userDto.getName())){
            errors.add("Please enter your valid Name ! ");
        }
        if(!StringUtils.hasLength(userDto.getSecondName())){
            errors.add("Please enter your valid Second Name ! ");
        }
        if(!StringUtils.hasLength(userDto.getPassword())){
            errors.add("Please enter your Password ! ");
        }
        if(userDto.getEmail()==null){
            errors.add("Please enter your mail ! ");
        }
        if(userDto.getDateOfBirth()==null){
            errors.add("Please enter your Birth date ! ");
        }
        if(!StringUtils.hasLength(userDto.getAdresse().getAdresse1())){
            errors.add("Please enter your first Adresse ! ");
        }
        if(!StringUtils.hasLength(userDto.getAdresse().getCodePostal())){
            errors.add("Please enter your postal code of residence ! ");
        }
        if(!StringUtils.hasLength(userDto.getAdresse().getPays())){
            errors.add("Please enter your origin state ! ");
        }
        return errors;
    }
}
