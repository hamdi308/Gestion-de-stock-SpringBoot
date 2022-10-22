package com.hamdi.gestionStock.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class UserDto {
    private String name;
    private String secondName;
    private String email;
    private String dateOfBirth;
    private String password;
    private AdresseDto adresse;
    private String photo;
    private EntrepriseDto entreprise;
    private List<RolesDto> roles;
}
