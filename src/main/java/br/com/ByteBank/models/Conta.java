package br.com.ByteBank.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name = "tbl_conta")
@Entity
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Agencia agencia;
	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy = "conta")
	private List<Transacao>transacoes;
	private Integer numero;
	private Integer digito;
	private BigDecimal saldo;
}
