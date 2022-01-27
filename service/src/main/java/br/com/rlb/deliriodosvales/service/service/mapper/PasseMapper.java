package br.com.rlb.deliriodosvales.service.service.mapper;

import br.com.rlb.deliriodosvales.service.domain.Passe;
import br.com.rlb.deliriodosvales.service.service.dto.PasseDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PasseMapper extends EntityMapper<PasseDTO, Passe> {

    @Mapping(source = "idPessoa", target = "pessoa.id")
    Passe toEntity(PasseDTO dto);

    @InheritInverseConfiguration
    PasseDTO toDto(Passe entity);
}
