package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.ArticleDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto){
        List<String> errors = new ArrayList<>();
        if(articleDto==null){
            errors.add("Please enter the code of article! ");
            errors.add("Please enter the code of article! ");
            errors.add("Please enter the designation of article! ");
            errors.add("Please enter the unit price HT of article! ");
            errors.add("Please enter the TVA amount of the article! ");
            errors.add("Please enter the unit price TTC of article! ");
            errors.add("Please choose the category of the article !");
            return errors;
        }
        if(!StringUtils.hasLength(articleDto.getCodeArticle())) {
            errors.add("Please enter the code of article! ");
        }
        if(!StringUtils.hasLength(articleDto.getCodeArticle())) {
            errors.add("Please enter the code of article! ");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())) {
            errors.add("Please enter the designation of article! ");
        }
        if(articleDto.getPrixunitaireHt()==null) {
            errors.add("Please enter the unit price HT of article! ");
        }
        if(articleDto.getTauxTva()==null) {
            errors.add("Please enter the TVA amount of the article! ");
        }
        if(articleDto.getPrixunitaireTtc()==null) {
            errors.add("Please enter the unit price TTC of article! ");
        }
        if(articleDto.getCategory()==null) {
            errors.add("Please choose the category of the article !");
        }
        return errors;
    }
}
