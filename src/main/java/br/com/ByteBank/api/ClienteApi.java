package br.com.ByteBank.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ByteBank.dto.ClienteDtoRequest;
import br.com.ByteBank.models.Cliente;

@RequestMapping(value = "/clientes",  produces = { "application/json" }, consumes = { "application/json" })
public interface ClienteApi {

	@PostMapping()
	ResponseEntity<Cliente> cadastraCliente(@Valid @RequestBody ClienteDtoRequest cliente_);

	@GetMapping()
	ResponseEntity<List<Cliente>> listaCliente();

	@GetMapping(value = "/cpf/{cpf}")
	ResponseEntity<Cliente> consultaClientePorCpf(@PathVariable("cpf") String cpf);

}
