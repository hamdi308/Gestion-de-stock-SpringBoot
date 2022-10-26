package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Roles;
import com.hamdi.gestionStock.model.User;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UserDto {
    private Integer id;
    private String name;
    private String secondName;
    private String email;
    private String dateOfBirth;
    private String password;
    private AdresseDto adresse;
    private String photo;
    private EntrepriseDto entreprise;
    private List<RolesDto> roles;
    public static UserDto fromEntity(User user){
        if(user==null){
            return null;
        }
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .secondName(user.getSecondName())
                .email(user.getEmail())
                .password(user.getPassword())
                .adresse(AdresseDto.fromEntity(user.getAdresse()))
                .dateOfBirth(user.getDateOfBirth())
                .adresse(AdresseDto.fromEntity(user.getAdresse()))
                .entreprise(EntrepriseDto.fromEntity(user.getEntreprise()))
                .photo(user.getPhoto())
                .entreprise(EntrepriseDto.fromEntity(user.getEntreprise()))
                .roles(user.getRoles() != null?user.getRoles().stream().map(RolesDto::fromEntity).collect(Collectors.toList()) : null)
                .build();
    }
    public static User toEntity(UserDto userDto) {
        if (userDto == null) {
            return null;
            //throw Exception
        }
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getSecondName());
        user.setSecondName(userDto.getSecondName());
        user.setEmail(userDto.getEmail());
        user.setDateOfBirth(userDto.getDateOfBirth());
        user.setPhoto(userDto.getPhoto());
        return user;
    }
}
