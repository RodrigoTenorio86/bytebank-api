package br.com.ByteBank.controller;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.ByteBank.api.TransacaoApi;
import br.com.ByteBank.models.Transacao;
import br.com.ByteBank.service.TransacaoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TransacaoController implements TransacaoApi{
	private final TransacaoService transacaoService; 
	
	
	
	
	@Override
	public ResponseEntity<Void> alteraValorTransacao(Long codigo, @NotNull @Valid BigDecimal valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Transacao> cadastraTransacao(@Valid Transacao transacao, @NotNull @Valid String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> excluiTransacao(Long codigo) {
		transacaoService.delete(codigo);
		return null;
	}

	
	
}
