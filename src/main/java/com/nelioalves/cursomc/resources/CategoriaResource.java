package com.nelioalves.cursomc.resources;

//import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.dto.CategoriaDTO;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias") //o parametro do 'value' eh o nome do endpoit que eu quero criar, essa classe serah um controlador REST e
										// responderah pelo endpoint /categorias
public class CategoriaResource {
//	
//	@Autowired
//	private CategoriaService service;		//acessando o servico
//	
//	//para esse metodo java ser uma funcao REST, eu tenho que associar ela com algum dos verbos do http
//	@RequestMapping(value="/{id}", method=RequestMethod.GET)
//	public ResponseEntity<Categoria> find(@PathVariable Integer id) {
//		
//		Categoria obj = service.find(id);
//		return ResponseEntity.ok().body(obj);
//		
//	} // fim do GET
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public ResponseEntity<Void> insert(@Valid @RequestBody CategoriaDTO objDto) {	// a notacao @RequestBody faz o json ser convertido para um objeto Java automaticamente
//		Categoria obj = service.fromDTO(objDto);
//		obj = service.insert(obj);	//a operacao save do repository me retorna um objeto, por isso o 'obj = '
//		//aqui o novo objeto jah foi inserido no banco e jah possui um id, agora eu uso esse id na URI de resposta
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();	//construindo a URI
//		return ResponseEntity.created(uri).build();	// retornando a resposta HTTP
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT) 
//	public ResponseEntity<Void> update(@Valid @RequestBody CategoriaDTO objDto, @PathVariable Integer id) {
//		Categoria obj = service.fromDTO(objDto);
//		obj.setId(id);  // por garantia
//		obj = service.update(obj);
//		return ResponseEntity.noContent().build();
//	}
//	
//	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
//	public ResponseEntity<Void> delete(@PathVariable Integer id) {
//		service.delete(id);
//		return ResponseEntity.noContent().build();
//	}
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public ResponseEntity<List<CategoriaDTO>> findAll() {
//		List<Categoria> list = service.findAll();
//		//stream().map() = percorre todos os elemetnos da lista e aplica uma operacao em cada um deles
//		List<CategoriaDTO> listDto = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());	//'obj -> new' = operador de funcao anonima
//		return ResponseEntity.ok().body(listDto);
//	}
//	
//	@RequestMapping(value = "/page", method=RequestMethod.GET)
//	public ResponseEntity<Page<CategoriaDTO>> findPage(
//			@RequestParam(value = "page", defaultValue = "0") Integer page, 
//			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage, 
//			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy, 
//			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {
//		Page<Categoria> list = service.findPage(page, linesPerPage, orderBy, direction);
//		Page<CategoriaDTO> listDto = list.map(obj -> new CategoriaDTO(obj));	//'obj -> new' = operador de funcao anonima
//		return ResponseEntity.ok().body(listDto);
//	}
	
	@RequestMapping(value = "/page", method=RequestMethod.GET)
	public String find() {
		return "Api oi";
	}
}
