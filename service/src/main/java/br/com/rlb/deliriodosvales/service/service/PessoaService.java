package br.com.rlb.deliriodosvales.service.service;

import br.com.rlb.deliriodosvales.service.repository.PessoaRepository;
import br.com.rlb.deliriodosvales.service.service.dto.PessoaDTO;
import br.com.rlb.deliriodosvales.service.service.mapper.PessoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PessoaService {

    private final PessoaMapper mapper;

    private final PessoaRepository repositorio;

    public List<PessoaDTO> buscarTodos() {
        return mapper.toDto(repositorio.findAll());
    }

    public PessoaDTO buscarPorId(Long id) {
        return mapper.toDto(repositorio.findById(id).orElseThrow(RuntimeException::new));
    }

    public PessoaDTO salvar(PessoaDTO dto) {
        return mapper.toDto(repositorio.save(mapper.toEntity(dto)));
    }

    public void deletar(Long id) {
        repositorio.deleteById(id);
    }
}