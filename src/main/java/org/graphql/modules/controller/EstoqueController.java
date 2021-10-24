package org.graphql.modules.controller;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.graphql.modules.model.Estoque;
import org.graphql.modules.service.EstoqueService;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class EstoqueController {

    @Inject
    EstoqueService service;

    @Query("allEstoque")
    @Description("Get all Estoque registred")
    public List<Estoque> listAll(){
        return service.listaAll();
    }
}
