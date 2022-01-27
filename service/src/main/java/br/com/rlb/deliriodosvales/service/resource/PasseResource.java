package br.com.rlb.deliriodosvales.service.resource;

import br.com.rlb.deliriodosvales.service.service.PasseService;
import br.com.rlb.deliriodosvales.service.service.dto.PasseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/passes")
@RequiredArgsConstructor
public class PasseResource {

    private final PasseService service;

    @GetMapping
    public ResponseEntity<List<PasseDTO>> buscarTodos() {
        List<PasseDTO> dtoList = service.buscarTodos();
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PasseDTO> buscarPorId(@PathVariable("id") Long id) {
        PasseDTO dto = service.buscarPorId(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PasseDTO> salvar(@Valid @RequestBody PasseDTO param) {
        PasseDTO dto = service.salvar(param);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PasseDTO> alterar(@Valid @RequestBody PasseDTO param) {
        PasseDTO dto = service.salvar(param);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
