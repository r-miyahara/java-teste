package br.com.teste.demoitau.service;

import java.util.List;

import br.com.teste.demoitau.model.Usuario;

public interface UsuarioService {

	List<Usuario> listaUsuarios();

	Usuario criaUsuario(Usuario usuario);

	Usuario atualizaUsuario(Usuario usuario);
}
