package br.com.ByteBank.api;



import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/contas")
public interface ContaApi {

	 @GetMapping(value = "/{agencia}/{numero}/{digito}/saldo")
	 ResponseEntity<BigDecimal> consultaSaldo( @PathVariable("agencia") Integer agencia, @PathVariable("numero") Long numero, @PathVariable("digito") Integer digito);


}
