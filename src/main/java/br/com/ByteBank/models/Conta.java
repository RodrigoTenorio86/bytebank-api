package br.com.ByteBank.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Agencia agencia;
	@ManyToOne
	private Cliente cliente;
	@OneToMany
	private List<Transacao>transacoes;
	private Integer numero;
	private Integer digito;
	private BigDecimal saldo;
}
