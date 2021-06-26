package br.com.ByteBank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.ByteBank.api.ClienteApi;
import br.com.ByteBank.models.Cliente;
import br.com.ByteBank.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController implements ClienteApi{
	private final ClienteService clienteService;

	@Override
	public ResponseEntity<Cliente> cadastraCliente(@Valid Cliente cliente_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Cliente>> listaCliente() {
		
		return ResponseEntity.ok( clienteService.findAll());
	}

	@Override
	public ResponseEntity<Cliente> consultaClientePorCpf(String cpf) {
		
		return  ResponseEntity.ok( clienteService.findByCpf(cpf));
	}
	
	
	

}
