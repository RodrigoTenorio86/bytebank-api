package br.com.ByteBank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.ByteBank.api.ClienteApi;
import br.com.ByteBank.dto.ClienteDtoRequest;
import br.com.ByteBank.models.Cliente;
import br.com.ByteBank.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController implements ClienteApi {
	private final ClienteService clienteService;

	@Override
	public ResponseEntity<Cliente> cadastraCliente(@Valid ClienteDtoRequest cliente_) {

		return new ResponseEntity<Cliente>(clienteService.save(cliente_), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<Cliente>> listaCliente() {

		return new ResponseEntity<List<Cliente>>(clienteService.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Cliente> consultaClientePorCpf(String cpf) {

		return new ResponseEntity<Cliente>(clienteService.findByCpf(cpf),HttpStatus.OK);
	}

}
