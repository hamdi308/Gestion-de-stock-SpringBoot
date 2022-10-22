package com.hamdi.gestionStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
    private String roleName;
    private UserDto user;
}