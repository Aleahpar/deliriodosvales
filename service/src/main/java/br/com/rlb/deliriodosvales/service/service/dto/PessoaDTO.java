package br.com.rlb.deliriodosvales.service.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PessoaDTO {

    private Long id;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;

}
