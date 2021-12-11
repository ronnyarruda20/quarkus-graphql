package org.graphql.modules.service;

import org.graphql.modules.dto.MedicamentoDTO;
import org.graphql.modules.mapper.MedicamentoMapper;
import org.graphql.modules.model.Medicamento;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class MedicamentoService {

    public List<Medicamento> listaAll(){
        return Medicamento.listAll();
    }

    @Transactional
    public String save(MedicamentoDTO medicametoDto) {
        Medicamento medicamento = MedicamentoMapper.INSTANCE.toMedicamento(medicametoDto);
        Medicamento.persist(medicamento);
        return "Salvo Com Sucesso";
    }
}
