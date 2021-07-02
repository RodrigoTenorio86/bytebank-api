package br.com.ByteBank.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name="tbl_transacao")
@Entity
public class Transacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private TipoTransacao tipo;
	private BigDecimal valor;
	@Builder.Default
	private LocalDateTime dataTransacao= LocalDateTime.now();
	@ManyToOne(cascade= {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
	private Conta conta;
}
