package br.com.ByteBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ByteBank.models.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}
