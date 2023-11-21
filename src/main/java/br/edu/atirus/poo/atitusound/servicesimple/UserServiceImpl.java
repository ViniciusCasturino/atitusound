package br.edu.atirus.poo.atitusound.servicesimple;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.edu.atirus.poo.atitusound.entities.UserEntity;
import br.edu.atirus.poo.atitusound.repositories.GenericRepository;
import br.edu.atirus.poo.atitusound.repositories.UserRepository;
import br.edu.atirus.poo.atitusound.services.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	
	
	
	private final UserRepository repository;
	private final PasswordEncoder passwordEncoder;
	
	
	
	public UserServiceImpl(UserRepository repository, PasswordEncoder passwordEncoder) {
		super();
		this.repository = repository;
		this.passwordEncoder = passwordEncoder;
	}



	@Override
	public GenericRepository<UserEntity> getRepository() {
		return repository;
	}



	@Override
	public void validate(UserEntity entity) throws Exception {
		UserService.super.validate(entity);
		if (entity.getUsername()== null || entity.getUsername().isEmpty())
			throw new Exception("campo username inválido!");
		
		if(entity.getUuid()== null) {
			if(repository.existsByUsername(entity.getUsername()))
				throw new Exception("Ja existe usuario com este username");
			
		}else {
			if(repository.existsByUsernameAndUuidNot(entity.getUsername(), entity.getUuid()))
				throw new Exception("Ja existe usuario com este username");
			
		}
		
		entity.setPassword(passwordEncoder.encode(entity.getPassword()));
			
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		var user = repository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("usuario não encontrado com este UserName"));

		return user;
	}

	
}










