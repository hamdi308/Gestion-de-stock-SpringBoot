package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.CategoryDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {
    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<>();
        if(categoryDto==null || !StringUtils.hasLength(categoryDto.getCode())) {
             errors.add("Please enter the code of category! ");
        }
        return errors;
    }
}
