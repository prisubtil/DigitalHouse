package br.com.digitalhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.digitalhouse.dto.ImagemDTO;
import br.com.digitalhouse.mapper.ImagemMapper;
import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Imagem;
import br.com.digitalhouse.repository.ClienteRepository;
import br.com.digitalhouse.repository.ImagemRepository;
import br.com.digitalhouse.request.ImagemRequest;

@Service
public class ImagemService {

	@Autowired
	private ImagemRepository repository;
	@Autowired
	private ImagemMapper mapper;
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ImagemDTO salvar(ImagemRequest imagemRequest, Long id) {
		Imagem imagem = mapper.requestToModel(imagemRequest);
		
		Cliente cliente = clienteRepository.findById(id).get();
		
		MultipartFile arquivo = imagemRequest.getImagem();
		imagem.setCliente(cliente);
		//imagem.setDescricao(imagemRequest.getDescricao());
		imagem.setContentType(arquivo.getContentType());
		imagem.setTamanho(arquivo.getSize());
		imagem.setNomeArquivo(arquivo.getOriginalFilename());
	    
	    return mapper.modelToDTO( repository.save(imagem) );	
	}
}
