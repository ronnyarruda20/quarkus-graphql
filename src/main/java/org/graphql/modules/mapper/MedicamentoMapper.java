package org.graphql.modules.mapper;

import org.graphql.modules.dto.MedicamentoDTO;
import org.graphql.modules.model.Medicamento;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MedicamentoMapper {

    MedicamentoMapper INSTANCE = Mappers.getMapper(MedicamentoMapper.class);

    Medicamento toMedicamento(MedicamentoDTO medicamentoDTO);
}
