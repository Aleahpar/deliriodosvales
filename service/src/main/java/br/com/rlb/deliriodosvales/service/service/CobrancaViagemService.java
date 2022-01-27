package br.com.rlb.deliriodosvales.service.service;

import br.com.rlb.deliriodosvales.service.repository.CobrancaViagemRepository;
import br.com.rlb.deliriodosvales.service.service.dto.CobrancaViagemDTO;
import br.com.rlb.deliriodosvales.service.service.mapper.CobrancaViagemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CobrancaViagemService {

    private final CobrancaViagemRepository repository;

    private final CobrancaViagemMapper mapper;

    public List<CobrancaViagemDTO> buscarTodos() {
        return mapper.toDto(repository.findAll());
    }

    public CobrancaViagemDTO buscarPorId(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public CobrancaViagemDTO salvar(CobrancaViagemDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
