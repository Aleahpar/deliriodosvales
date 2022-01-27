package br.com.rlb.deliriodosvales.service.repository;

import br.com.rlb.deliriodosvales.service.domain.Passe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasseRepository extends JpaRepository<Passe, Long> {
}
