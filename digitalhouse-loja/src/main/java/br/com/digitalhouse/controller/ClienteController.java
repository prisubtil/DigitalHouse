package br.com.digitalhouse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.service.ClienteService;

@CrossOrigin
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody Cliente cliente) {	
		
		try {
			service.salvar(cliente);
			return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
		}catch(Exception ex) {
			return ResponseEntity.badRequest().body(ex.getMessage());
		}		
	}
	
	
	@GetMapping
	public List<Cliente> listar(){
		return service.listar();
	}
//	
//	@GetMapping("/sobrenome/{sobrenome}")
//	public List<Cliente> retornar(@PathVariable String sobrenome){
//		
//		return repository.findBySobrenome(sobrenome);
//	}
//	
////	@GetMapping("/nome/{nome}")
////	public List<Cliente> trazerPeloNome(@PathVariable String nome){
////		return repository.buscarPorNome(nome);
////	}
//	
////	@GetMapping("/nome/{nome}")
////	public List<Cliente> trazerPeloNome(@PathVariable String nome){
////		return repository.findByNome(nome);
////	}
//	
////	@GetMapping("/date")
////	public List<Cliente> trazerMaiores(){
////	
////	    LocalDate data = LocalDate.now().plusYears(-18);
////	    return repository.buscarMaiores(data);
////	}
//	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
		
		Optional<Cliente> cliente = service.buscar(id);
		
		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		
		return ResponseEntity.notFound().build();
	
	}
	
	
	@GetMapping("/{id}/telefones")
	public List<Telefone> buscarTelefones(@PathVariable Long id) {
		return service.buscarTelefones(id);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		
			service.excluir(id);	
			
			
	
			
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.CONFLICT).build();
//		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> atualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
		
		Cliente clienteAtual = service.buscar(id).orElse(null);
		
		if (clienteAtual != null) {
			BeanUtils.copyProperties(cliente, clienteAtual, "id");
			
			service.atualizar(clienteAtual);
			return ResponseEntity.ok(clienteAtual);
		}	
			
		return ResponseEntity.notFound().build();
	}

	
}
