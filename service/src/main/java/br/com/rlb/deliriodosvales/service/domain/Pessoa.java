package br.com.rlb.deliriodosvales.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "TB_PESSOA")
@Getter
@Setter
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA")
    @SequenceGenerator(name = "SEQ_PESSOA", sequenceName = "SEQ_PESSOA", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @NotNull(message = "Nome não pode ser nulo.")
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @NotNull(message = "Data de Nascimento não pode ser nula.")
    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "CIDADE", length = 50)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "TELEFONE", nullable = false, length = 20)
    private String telefone;

    @Column(name = "EMAIL", nullable = false, length = 200)
    private String email;

    @Column(name = "FOTO", length = 200)
    private String foto;

}
