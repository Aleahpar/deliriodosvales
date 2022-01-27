package br.com.rlb.deliriodosvales.service.service.mapper;

import br.com.rlb.deliriodosvales.service.domain.Onibus;
import br.com.rlb.deliriodosvales.service.service.dto.OnibusDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OnibusMapper extends EntityMapper<OnibusDTO, Onibus> {
}
