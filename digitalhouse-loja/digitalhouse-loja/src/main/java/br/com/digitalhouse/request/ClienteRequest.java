package br.com.digitalhouse.request;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.digitalhouse.model.Endereco;
import br.com.digitalhouse.model.Telefone;
import lombok.Data;

@Data
public class ClienteRequest {

	private Long id;
	private String nome;	
	private String sobrenome;		
	private List<Telefone> telefones;
	@NotBlank
	private String cpf;		
	@NotBlank
	private String rg;	
	@Email
	private String email;
	private Endereco endereco;
	private String foto;
}
