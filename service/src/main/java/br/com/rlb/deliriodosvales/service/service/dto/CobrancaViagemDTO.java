package br.com.rlb.deliriodosvales.service.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
public class CobrancaViagemDTO {

    private Long id;
    private Long idPasse;
    private Long idOnibus;
    private Time dataHora;
    private Double valor;
}
