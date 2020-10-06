package br.com.digitalhouse.controller;

import java.nio.file.Path;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.dto.ImagemDTO;
import br.com.digitalhouse.request.ImagemRequest;
import br.com.digitalhouse.service.ImagemService;

@CrossOrigin
@RestController
@RequestMapping("/imagem")
public class ImagemController {

	@Autowired
	private ImagemService service;
	
	@PostMapping("/{id}")
	public ImagemDTO salvarFoto(@Valid ImagemRequest imagem, @PathVariable Long id) {
		
		String nomeArquivo = UUID.randomUUID().toString() 
				+ "_" + imagem.getImagem().getOriginalFilename();
		
		Path arquivoFoto = Path.of("C:/fotos", nomeArquivo);
		
		try {
			imagem.getImagem().transferTo(arquivoFoto);
			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return service.salvar(imagem, id);
	}
}
