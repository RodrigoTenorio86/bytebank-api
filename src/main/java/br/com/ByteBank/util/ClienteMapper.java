package br.com.ByteBank.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.ByteBank.dto.ClienteDtoRequest;
import br.com.ByteBank.models.Cliente;

@Mapper
public interface ClienteMapper {
	ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
	

	Cliente clienteTo(ClienteDtoRequest clienteDtoRequest );
}
