package br.com.teste.demoitau.controller.usuario;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.demoitau.model.Usuario;
import br.com.teste.demoitau.service.UsuarioService;

@RestController
public class UsuarioController {

	private static Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios() {
		List<Usuario> listaUsuarios = usuarioService.listaUsuarios();
		return listaUsuarios;
	}

	@PostMapping("/usuario")
	public Usuario criaUsuario(@RequestBody(required = true) Usuario usuario) {
		logger.info("criaUsuario payload: {}", usuario);
		Usuario resultado = usuarioService.criaUsuario(usuario);
		return resultado;
	}

	@PutMapping("/usuario/{id}")
	public Usuario atualizaUsuario(@RequestBody(required = true) Usuario usuario, @PathVariable Long id) {
		logger.info("atualizaUsuario payload: {}, id: {}", usuario, id);
		usuario.setId(id);
		Usuario resultado = usuarioService.atualizaUsuario(usuario);
		return resultado;
	}
}