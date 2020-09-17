package br.com.digitalhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {

}
