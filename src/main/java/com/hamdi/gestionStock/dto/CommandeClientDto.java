package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Client;
import com.hamdi.gestionStock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class CommandeClientDto {
    private Integer id;
    private String code;
    private Instant dateCommand;
    private ClientDto client;
    private List<LigneCommandeClientDto> ligneCommandeClientList;
    public static CommandeClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient==null){
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommand(commandeClient.getDateCommand())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .ligneCommandeClientList(commandeClient.getLigneCommandeClientList() != null?commandeClient
                        .getLigneCommandeClientList().stream()
                        .map(LigneCommandeClientDto::fromEntity)
                        .collect(Collectors.toList()) : null)
                .build();
    }
    public static CommandeClient toEntity(CommandeClientDto commandeClientDto) {
        if (commandeClientDto == null) {
            return null;
            //throw Exception
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommand(commandeClientDto.getDateCommand());

        return commandeClient;
    }
}
