package org.graphql.modules.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MedicamentoDTO {
    private String nome;
    private String bula;
    private Integer quantidade;
    private Byte receitaUsuario;
    private EstoqueDTO estoque;
}
