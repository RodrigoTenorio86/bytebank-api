package br.com.ByteBank.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.ByteBank.repository.TransacaoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TransacaoService {

	private final TransacaoRepository transacaoRepository;

	public void delete(Long codigo) {
		verifyIfTransactionExists(codigo);
		transacaoRepository.deleteById(codigo);		
	} 
	
	private void verifyIfTransactionExists(Long id) throws ResponseStatusException{
		transacaoRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not found for ID  " + id));
	}
}
