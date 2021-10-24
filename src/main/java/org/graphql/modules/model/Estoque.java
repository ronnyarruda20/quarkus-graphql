package org.graphql.modules.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Estoque extends PanacheEntity {
    private Integer quantidade;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "estoque_id")
    private List<Medicamento> medicamentos;
}
