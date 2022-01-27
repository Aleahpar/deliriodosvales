package br.com.rlb.deliriodosvales.service.repository;

import br.com.rlb.deliriodosvales.service.domain.CobrancaViagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobrancaViagemRepository extends JpaRepository<CobrancaViagem, Long> {
}
