package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.MvtStk;
import com.hamdi.gestionStock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
    private Integer id;
    private String roleName;
    private UserDto user;
    public static RolesDto fromEntity(Roles roles){
        if(roles==null){
            return null;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .user(UserDto.fromEntity(roles.getUser()))
                .build();
    }
    public static Roles toEntity(RolesDto rolesDto) {
        if (rolesDto == null) {
            return null;
            //throw Exception
        }
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRoleName(rolesDto.getRoleName());

        return roles;
    }
}
