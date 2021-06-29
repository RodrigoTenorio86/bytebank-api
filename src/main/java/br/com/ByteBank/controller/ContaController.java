package br.com.ByteBank.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.ByteBank.api.ContaApi;
import br.com.ByteBank.service.ContaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContaController implements ContaApi{

	private final ContaService contaService;

	@Override
	public ResponseEntity<BigDecimal> consultaSaldo(Integer agencia, Long numero, Integer digito) {
		
		return new ResponseEntity<BigDecimal>(contaService.consultaSaldo(agencia,numero,digito), HttpStatus.OK);
	}
	
	
	
	
}
