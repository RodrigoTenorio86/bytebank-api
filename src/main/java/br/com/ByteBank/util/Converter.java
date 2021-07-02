package br.com.ByteBank.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

import br.com.ByteBank.dto.ClienteDtoRequest;
import br.com.ByteBank.models.Cliente;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface Converter {
	Converter INSTANCE = Mappers.getMapper(Converter.class);
	
	@Mapping(source = "titular", target = "titular")
	@Mapping(source = "cpf" , target = "cpf")
	@Mapping(source = "senha", target = "senha")
	Cliente clienteTo(ClienteDtoRequest clienteDtoRequest );
}
