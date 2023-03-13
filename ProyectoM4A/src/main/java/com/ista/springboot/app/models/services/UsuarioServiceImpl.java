package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ista.springboot.app.models.dao.IUsuarioDao;
import com.ista.springboot.app.models.entity.Usuario;
import com.ista.springboot.app.models.services.I.IUsuarioService;

@Service

public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDao dao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>)dao.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return dao.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}
	
	//metodos personalizados
	@Override
	@Transactional(readOnly = true)
	public Usuario findByUserPass(String usu_nombreUsuario, String contrasena) {
		// TODO Auto-generated method stub
		return dao.findByUsuNombreUsuarioAndUsuContraUsuario(usu_nombreUsuario, contrasena);
	}

	@Override
	@Transactional(readOnly = true)
	public Boolean existByUser(String usu_nombreUsuario) {
		// TODO Auto-generated method stub
		return dao.existByUsuNombreUsuario(usu_nombreUsuario);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAllUsuAct() {
		// TODO Auto-generated method stub
		return (List<Usuario>)dao.findAllUsuariosAct();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAllUsuInc() {
		// TODO Auto-generated method stub
		return (List<Usuario>)dao.findAllUsuariosInc();
	}

	@Override
	@Transactional 
	public int updateEstado(Long id,Boolean estado) {
		// TODO Auto-generated method stub
		return dao.actualizarEstado(id, estado);
	}
	

}
