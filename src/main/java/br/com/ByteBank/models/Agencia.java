package br.com.ByteBank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_agencia")
public class Agencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
