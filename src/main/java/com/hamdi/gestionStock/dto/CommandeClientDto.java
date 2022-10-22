package com.hamdi.gestionStock.dto;

import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {
    private String code;
    private Instant dateCommand;
    private ClientDto client;
    private List<LigneCommandeClientDto> ligneCommandeClientList;
}
