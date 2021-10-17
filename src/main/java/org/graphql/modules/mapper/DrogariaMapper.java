package org.graphql.modules.mapper;

import org.graphql.modules.dto.DrogariaDTO;
import org.graphql.modules.model.Drogaria;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DrogariaMapper {

    DrogariaMapper INSTANCE = Mappers.getMapper(DrogariaMapper.class);

    Drogaria toDrogaria(DrogariaDTO drogariaDTO);
}
