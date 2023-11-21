package br.edu.atirus.poo.atitusound.servicesimple;

import org.springframework.stereotype.Service;

import br.edu.atirus.poo.atitusound.entities.MusicEntity;
import br.edu.atirus.poo.atitusound.repositories.GenericRepository;
import br.edu.atirus.poo.atitusound.repositories.MusicRepository;
import br.edu.atirus.poo.atitusound.services.MusicService;

@Service
public class MusicServiceimp implements MusicService{
	
	private final MusicRepository repository;
	
	public MusicServiceimp(MusicRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public GenericRepository<MusicEntity> getRepository() {
		return repository;
	}

}
