package br.com.teste.demoitau.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.demoitau.model.Usuario;
import br.com.teste.demoitau.repository.usuario.UsuarioRepository;
import br.com.teste.demoitau.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private static Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);

	@Autowired
	private UsuarioRepository usuarioRepository;  

	@Override
	public List<Usuario> listaUsuarios() {
		logger.info("listando usuarios...");
		Iterable<Usuario> findAll = usuarioRepository.findAll();
		List<Usuario> resultado = new ArrayList<>();
		findAll.forEach(usuario -> {
			resultado.add(usuario);
		});
		return resultado;
	}

	@Override
	public Usuario criaUsuario(Usuario usuario) {
		logger.info("criando usuario...");
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		return usuarioSalvo;
	}

	@Override
	public Usuario atualizaUsuario(Usuario usuario) {
		logger.info("atualizando usuario {}", usuario);
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		return usuarioSalvo;
	}
}
