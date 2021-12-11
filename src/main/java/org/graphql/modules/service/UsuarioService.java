package org.graphql.modules.service;

import org.graphql.modules.model.Medicamento;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Inject
    private MedicamentoService medicamentoService;

    public List<Medicamento> consultaMedicamento(){
       return this.medicamentoService.listaAll();
    }
}
