package com.dsgames.dto;

import org.springframework.beans.BeanUtils;

import com.dsgames.entities.Game;

public class GameDTO {
	
	private Long id;
	private String title;
	private String teste;
	private Integer year;
	private Double Score;
	private String genre;
	private String platforms;
	private String img_url;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getTeste() {
		return teste;
	}

	public Integer getYear() {
		return year;
	}

	public Double getScore() {
		return Score;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public String getImg_url() {
		return img_url;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public void setScore(Double score) {
		Score = score;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
	
}
