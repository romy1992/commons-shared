package com.commons.shared.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FNMapper<M, E> {

  E converterModelToEntity(M model);

  M converterEntityToModel(E model);
}
