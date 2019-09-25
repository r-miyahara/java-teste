package br.com.teste.demoitau.repository.usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.demoitau.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
}
