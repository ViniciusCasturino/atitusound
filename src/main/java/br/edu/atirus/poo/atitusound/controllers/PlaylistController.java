package br.edu.atirus.poo.atitusound.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atirus.poo.atitusound.dtos.playlistDTO;
import br.edu.atirus.poo.atitusound.entities.PlaylistEntity;
import br.edu.atirus.poo.atitusound.services.GenericService;
import br.edu.atirus.poo.atitusound.services.PlaylistService;

@RestController
@RequestMapping("/playlists")
public class PlaylistController extends GenericController<PlaylistEntity, playlistDTO> {
	
	private final PlaylistService service;
	

	public PlaylistController(PlaylistService service) {
		super();
		this.service = service;
	}

	@Override
	protected GenericService<PlaylistEntity> getService() {
		return service;
	}

	@Override
	protected PlaylistEntity convertDTO2Entity(playlistDTO dto) {
		PlaylistEntity playlist = new PlaylistEntity();
		playlist.setName(dto.getName());
		playlist.setPublic_share(dto.getPublic_share());
		return playlist;
	}
	

}
