package com.hamdi.gestionStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hamdi.gestionStock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {
    private Integer id;
    private String name;
    private String secondname;
    private String photo;
    private String mail;
    private AdresseDto adresse;
    private String numTel;
    @JsonIgnore
    private List<CommandeClientDto> commandeClientList;
    public ClientDto fromEntity(Client client){
        if(client==null){
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .name(client.getName())
                .secondname(client.getSecondname())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .photo(client.getPhoto())
                .build();
    }
    public Client toEntity(ClientDto clientDto) {
        if (clientDto == null) {
            return null;
            //throw Exception
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setName(clientDto.getName());
        client.setSecondname(clientDto.getSecondname());
        client.setMail(clientDto.getMail());
        client.setNumTel(clientDto.getNumTel());
        client.setPhoto(clientDto.getPhoto());
        return client;
    }
}
