package br.com.ByteBank.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ByteBank.repository.ContaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContaService {

	private final ContaRepository contaRepository;

	public BigDecimal consultaSaldo(Integer agencia, Long numero, Integer digito) {
		
		return null;
	}
}
