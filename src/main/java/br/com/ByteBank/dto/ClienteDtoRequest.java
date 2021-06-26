package br.com.ByteBank.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDtoRequest {
	private String titular;
	private String cpf;
	private String senha;
}
