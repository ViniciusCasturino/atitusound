package br.edu.atirus.poo.atitusound.dtos;

import java.time.Duration;


public class MusicDTO {
	
	private String name;
	
	private String url;

	private Duration duration;
	
	private DTOOnlyUuid artist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public DTOOnlyUuid getArtist() {
		return artist;
	}

	public void setArtist(DTOOnlyUuid artist) {
		this.artist = artist;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
