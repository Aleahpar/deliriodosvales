package br.com.rlb.deliriodosvales.service.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PessoaDTO {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String cidade;
    private String estado;
    private String telefone;
    private String foto;
    private String email;

}
