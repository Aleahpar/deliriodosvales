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

@Entity
@Table(name = "TB_PASSE")
@Getter
@Setter
public class Passe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PASSE")
    @SequenceGenerator(name = "SEQ_PASSE", sequenceName = "SEQ_PASSE", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODIGO_RFID", nullable = false, unique = true)
    private Long codigoRFID;

    @Column(name = "SALDO", nullable = false)
    private Double saldo;

    @Column(name = "ATIVO", nullable = false)
    private Boolean ativo = false;

    @Column(name = "CATEGORIA_ESTUDANTIL", nullable = false)
    private Boolean categoriaEstudantil = false;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PESSOA", nullable = false, unique = true)
    private Pessoa pessoa;

}
