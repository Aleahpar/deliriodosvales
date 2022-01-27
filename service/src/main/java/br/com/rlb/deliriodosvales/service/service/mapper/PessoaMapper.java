package br.com.rlb.deliriodosvales.service.service.mapper;

import br.com.rlb.deliriodosvales.service.domain.Pessoa;
import br.com.rlb.deliriodosvales.service.service.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {
}
