package br.com.digitalhouse.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.digitalhouse.model.Loja;
import br.com.digitalhouse.repository.LojaRepository;

@CrossOrigin
@RestController
@RequestMapping("/loja")
public class LojaController {
	
	@Autowired
	private LojaRepository repository;
	
	//POST - Insert, GET - Select, PUT - Update, DELETE - Delete
	@PostMapping
	public void salvar(@RequestBody Loja loja) {
		repository.save(loja);
	}
	
	@GetMapping
	public List<Loja> listar(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Loja buscar(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@RequestBody Loja loja, @PathVariable Long id) {
		Loja lo = repository.findById(id).get();
		
		lo.setNome(loja.getNome());
		lo.setTelefone(loja.getTelefone());
		lo.setCpf(loja.getCpf());
		lo.setSobrenome(loja.getSobrenome());
		lo.setDataNasc(loja.getDataNasc());
		lo.setEmail(loja.getEmail());
		lo.setRg(loja.getRg());
		
		
		repository.save(lo);
	}

}
