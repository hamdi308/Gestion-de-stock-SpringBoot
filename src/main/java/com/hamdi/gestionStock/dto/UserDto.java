package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Roles;
import com.hamdi.gestionStock.model.User;
import lombok.Builder;
import lombok.Data;
import java.util.List;

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
    public UserDto fromEntity(User user){
        if(user==null){
            return null;
        }
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .secondName(user.getSecondName())
                .email(user.getEmail())
                .dateOfBirth(user.getDateOfBirth())
                .photo(user.getPhoto())
                .build();
    }
    public User toEntity(UserDto userDto) {
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
