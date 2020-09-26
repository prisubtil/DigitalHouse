package br.com.digitalhouse.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.exception.ClienteNaoEncontradodException;
import br.com.digitalhouse.exception.EntidadeNaoEncontradaException;
import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.repository.CidadeRepository;
import br.com.digitalhouse.repository.ClienteRepository;
import br.com.digitalhouse.repository.EstadoRepository;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;

	@Transactional
	public void salvar(Cliente cliente) {
		
		estadoRepository.save(cliente.getEndereco().getCidade().getEstado());
	    cidadeRepository.save(cliente.getEndereco().getCidade());
    
	    cliente.getTelefones().stream().
		forEach(telefone -> telefone.setCliente(cliente));	
			
				
		repository.save(cliente);		
	}

	@Transactional
	public void atualizar(Cliente cliente) {
		
	    cliente.getTelefones().stream().
		forEach(telefone -> telefone.setCliente(cliente));	
				
		repository.save(cliente);		
	}
	
	public Optional<Cliente> buscar(Long id) {
		return repository.findById(id);
	}

	@Transactional
	public void excluir(Long id) {
		
		try {
			repository.deleteById(id);
			repository.flush();
		
		} catch (EmptyResultDataAccessException e) {
			throw new ClienteNaoEncontradodException(id);
		};			
	}

	public List<Telefone> buscarTelefones(Long id) {
		return repository.buscarTelefonesPorId(id);
	}

	public List<Cliente> listar() {
		return repository.findAll();	
	}

	
}
