package org.graphql.modules.service;

import org.graphql.modules.dto.DrogariaDTO;
import org.graphql.modules.mapper.DrogariaMapper;
import org.graphql.modules.model.Drogaria;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class DrogariaService {


    public List<Drogaria> listaAll(){
        return Drogaria.listAll();
    }

    @Transactional
    public String addValue(DrogariaDTO drogariaDTO) {
        Drogaria drogaria = DrogariaMapper.INSTANCE.toDrogaria(drogariaDTO);
        Drogaria.persist(drogaria);
        return "Salvo Com Sucesso";
    }
}
