package br.com.digitalhouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="fotos")
public class Imagem {

	@Id
	@Column(name = "cliente_id")
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Cliente cliente;
	
	private String nomeArquivo;
	private String descricao;
	private String contentType;
	private Long tamanho;
}
