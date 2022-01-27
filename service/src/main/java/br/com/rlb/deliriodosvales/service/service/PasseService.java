package br.com.rlb.deliriodosvales.service.service;

import br.com.rlb.deliriodosvales.service.repository.PasseRepository;
import br.com.rlb.deliriodosvales.service.service.dto.PasseDTO;
import br.com.rlb.deliriodosvales.service.service.mapper.PasseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PasseService {

    private final PasseRepository repository;

    private final PasseMapper mapper;

    public List<PasseDTO> buscarTodos() {
        return mapper.toDto(repository.findAll());
    }

    public PasseDTO buscarPorId(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public PasseDTO salvar(PasseDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
