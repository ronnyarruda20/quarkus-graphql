package org.graphql.modules.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Medicamento extends PanacheEntity {
    private String nome;
    private String bula;
    private Integer quantidade;
    private Byte receitaUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estoque_id", foreignKey = @ForeignKey(name = "fk_estoque_id"))
    private Estoque estoque;
}
