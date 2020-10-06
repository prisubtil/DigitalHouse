package br.com.digitalhouse.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import br.com.digitalhouse.validation.FileSize;
import lombok.Data;

@Data
public class ImagemRequest {

	@NotNull
	@FileSize(max = "1000KB")
	private MultipartFile imagem;
	
	@NotBlank
	private String descricao;
}
