package br.edu.atirus.poo.atitusound.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.atirus.poo.atitusound.entities.UserEntity;


public interface UserService extends GenericService<UserEntity> , UserDetailsService {

}
