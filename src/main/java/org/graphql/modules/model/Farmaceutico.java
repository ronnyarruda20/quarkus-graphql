package org.graphql.modules.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Farmaceutico extends PanacheEntity implements Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private Byte receitaUsuario;
}
