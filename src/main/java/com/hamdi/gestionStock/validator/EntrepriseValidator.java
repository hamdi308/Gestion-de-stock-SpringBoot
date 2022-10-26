package com.hamdi.gestionStock.validator;

import com.hamdi.gestionStock.dto.EntrepriseDto;
import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {
    public static List<String> validate(EntrepriseDto entrepriseDto){
        List<String> errors =new ArrayList<String>();
        if(entrepriseDto==null){
            errors.add("Enter Valid Entreprise Name !");
            errors.add("Enter an Description of Entreprise!");
            errors.add("Enter Adresse of the Entreprise !");
            errors.add("Enter the Fiscal Code of the Entreprise !");
            errors.add("Enter the mail of the Entreprise !");
            errors.add("Enter Logo of the Entreprise !");
            errors.add("Enter the phone number of the Entreprise !");
            errors.add("Enter the URL of of the Entreprise site web!");

            return errors;
        }
        if(entrepriseDto.getName()==null){
            errors.add("Enter Valid Entreprise Name !");
        }
        if(entrepriseDto.getDescription()==null){
            errors.add("Enter an Description of Entreprise!");
        }
        if(entrepriseDto.getAdresse()==null){
            errors.add("Enter Adresse of the Entreprise !");
        }
        if(entrepriseDto.getCodeFiscal()==null){
            errors.add("Enter the Fiscal Code of the Entreprise !");
        }
        if(entrepriseDto.getEmail()==null){
            errors.add("Enter the mail of the Entreprise !");
        }
        if(entrepriseDto.getPhoto()==null){
            errors.add("Enter Logo of the Entreprise !");
        }
        if(entrepriseDto.getNumTel()==null){
            errors.add("Enter the phone number of the Entreprise !");
        }
        if(entrepriseDto.getSiteWeb()==null){
            errors.add("Enter the URL of of the Entreprise site web!");
        }
        return errors;
    }
}
