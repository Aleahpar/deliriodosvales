package br.com.rlb.deliriodosvales.service.repository;

import br.com.rlb.deliriodosvales.service.domain.Onibus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnibusRepository extends JpaRepository<Onibus, Long> {
}
