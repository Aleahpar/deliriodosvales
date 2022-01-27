package br.com.rlb.deliriodosvales.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "TB_COBRANCA_VIAGEM")
@Getter
@Setter
public class CobrancaViagem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_COBRANCA_VIAGEM")
    @SequenceGenerator(name = "SEQ_COBRANCA_VIAGEM", sequenceName = "SEQ_COBRANCA_VIAGEM", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PASSE", nullable = false, unique = true)
    private Passe passe;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ONIBUS", nullable = false, unique = true)
    private Onibus onibus;

    @Column(name = "DATA_HORA", nullable = false)
    private Time dataHora;

    @Column(name = "VALOR", nullable = false)
    private Double valor;

}
