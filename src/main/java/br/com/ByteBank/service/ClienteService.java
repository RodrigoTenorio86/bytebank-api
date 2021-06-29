package br.com.ByteBank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.ByteBank.dto.ClienteDtoRequest;
import br.com.ByteBank.models.Cliente;
import br.com.ByteBank.repository.ClienteRepository;
import br.com.ByteBank.util.Converter;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteService {

	private final ClienteRepository repository;
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	public Cliente 	findByCpf(String cpf) {
		return repository.findByCpf(cpf).stream()
										.filter(c->c.getCpf().equals(cpf))
										.findAny()
										.orElseThrow(()->new ResponseStatusException(HttpStatus.BAD_REQUEST));
	}
	
	public Cliente save(ClienteDtoRequest clienteDtoRequest) {
		Cliente cliente = Converter.INSTANCE.clienteTo(clienteDtoRequest);
		return repository.save(cliente);
	}
	
	
	public Cliente findById(Long id) {
		return repository.findById(id)
						 .orElseThrow(()->new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cliente not Found."));
	}
	
}
