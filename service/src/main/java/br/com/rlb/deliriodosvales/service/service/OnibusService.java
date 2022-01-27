package br.com.rlb.deliriodosvales.service.service;

import br.com.rlb.deliriodosvales.service.repository.OnibusRepository;
import br.com.rlb.deliriodosvales.service.service.dto.OnibusDTO;
import br.com.rlb.deliriodosvales.service.service.mapper.OnibusMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class OnibusService {

    private final OnibusRepository repository;

    private final OnibusMapper mapper;

    public List<OnibusDTO> buscarTodos() {
        return mapper.toDto(repository.findAll());
    }

    public OnibusDTO buscarPorId(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public OnibusDTO salvar(OnibusDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
