package br.com.rlb.deliriodosvales.service.resource;

import br.com.rlb.deliriodosvales.service.service.CobrancaViagemService;
import br.com.rlb.deliriodosvales.service.service.dto.CobrancaViagemDTO;
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
import javax.websocket.server.PathParam;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/cobrancas-viagem")
@RestController
public class CobrancaViagemResource {

    private final CobrancaViagemService service;

    @GetMapping
    public ResponseEntity<List<CobrancaViagemDTO>> buscarTodos() {
        List<CobrancaViagemDTO> dtoList = service.buscarTodos();
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CobrancaViagemDTO> buscarPorId(@PathParam("id") Long id) {
        CobrancaViagemDTO dto = service.buscarPorId(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CobrancaViagemDTO> salvar(@Valid @RequestBody CobrancaViagemDTO param) {
        CobrancaViagemDTO dto = service.salvar(param);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CobrancaViagemDTO> alterar(@Valid @RequestBody CobrancaViagemDTO param) {
        CobrancaViagemDTO dto = service.salvar(param);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
