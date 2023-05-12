package com.dsgames.dto;

import com.dsgames.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String img_url;
	private String shortDescription;
	
	
	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImg_url() {
		return img_url;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public GameMinDTO() {
		
	}
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.year = entity.getYear();
		this.title = entity.getTitle();
		this.img_url = entity.getImageUrl();
		this.shortDescription = entity.getShortDescription();
		
	}
	
	

}
