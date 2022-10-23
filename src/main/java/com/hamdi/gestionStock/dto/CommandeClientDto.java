package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Client;
import com.hamdi.gestionStock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {
    private Integer id;
    private String code;
    private Instant dateCommand;
    private ClientDto client;
    private List<LigneCommandeClientDto> ligneCommandeClientList;
    public CommandeClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient==null){
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommand(commandeClient.getDateCommand())
                .build();
    }
    public CommandeClient toEntity(CommandeClientDto commandeClientDto) {
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
