package br.com.ByteBank.api;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.ByteBank.models.Transacao;

@RequestMapping(value = "/transacoes",produces = { "application/json" }, consumes = { "application/json" })
public interface TransacaoApi {

	  @PutMapping(value = "/{codigo}")
	  ResponseEntity<Void> alteraValorTransacao( @PathVariable("codigo") Long codigo,@NotNull @Valid @RequestParam(value = "valor", required = true) BigDecimal valor);

	  @PostMapping
	  ResponseEntity<Transacao> cadastraTransacao( @Valid @RequestBody Transacao transacao,
			                                       @NotNull  @Valid @RequestParam(value = "tipo", required = true) String tipo);
	  
	  @DeleteMapping(value = "/{codigo}")
	  ResponseEntity<Void> excluiTransacao( @PathVariable("codigo") Long codigo);  

}
