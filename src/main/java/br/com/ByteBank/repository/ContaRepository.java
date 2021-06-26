package br.com.ByteBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ByteBank.models.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
