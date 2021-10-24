package org.graphql.modules.service;

import org.graphql.modules.model.Estoque;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class EstoqueService {

    public List<Estoque> listaAll(){
        return Estoque.listAll();
    }
}
