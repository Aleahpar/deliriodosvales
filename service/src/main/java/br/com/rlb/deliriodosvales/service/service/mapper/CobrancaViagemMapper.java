package br.com.rlb.deliriodosvales.service.service.mapper;

import br.com.rlb.deliriodosvales.service.domain.CobrancaViagem;
import br.com.rlb.deliriodosvales.service.service.dto.CobrancaViagemDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CobrancaViagemMapper extends EntityMapper<CobrancaViagemDTO, CobrancaViagem> {

    @Mapping(source = "idOnibus", target = "onibus.id")
    @Mapping(source = "idPasse", target = "passe.id")
    CobrancaViagem toEntity(CobrancaViagemDTO dto);

    @InheritInverseConfiguration
    CobrancaViagemDTO toDto(CobrancaViagem entity);
}
