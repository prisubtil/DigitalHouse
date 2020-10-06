package br.com.digitalhouse.dto;

import lombok.Data;

@Data
public class ImagemDTO {
	
	private String nomeArquivo;
	private String descricao;
	private String contentType;
	private Long tamanho;
}
