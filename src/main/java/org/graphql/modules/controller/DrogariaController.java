package org.graphql.modules.controller;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.graphql.modules.dto.DrogariaDTO;
import org.graphql.modules.model.Drogaria;
import org.graphql.modules.service.DrogariaService;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class DrogariaController {

    @Inject
    DrogariaService drogariaService;

    @Query("allDrogaria")
    @Description("Get all Drogarias registred")
   public List<Drogaria> listAll(){
      return drogariaService.listaAll();
    }

    @Mutation("saveDrogaria")
    @Description("Register New Drogaria")
    public String save(DrogariaDTO drogariaDTO){
        return drogariaService.addValue(drogariaDTO);
    }
}
