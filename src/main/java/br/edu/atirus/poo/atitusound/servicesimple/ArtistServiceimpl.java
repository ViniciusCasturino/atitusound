package br.edu.atirus.poo.atitusound.servicesimple;

import org.springframework.stereotype.Service;

import br.edu.atirus.poo.atitusound.entities.ArtistEntity;
import br.edu.atirus.poo.atitusound.repositories.ArtistRepository;
import br.edu.atirus.poo.atitusound.repositories.GenericRepository;
import br.edu.atirus.poo.atitusound.services.ArtistService;

@Service
public class ArtistServiceimpl implements ArtistService{
	
	private final ArtistRepository repository;
	public ArtistServiceimpl(ArtistRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public GenericRepository<ArtistEntity> getRepository() {
		return repository;
	}


}











