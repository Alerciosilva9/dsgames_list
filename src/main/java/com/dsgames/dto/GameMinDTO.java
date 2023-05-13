package com.dsgames.dto;

import com.dsgames.entities.Game;
import com.dsgames.projections.GameMinProjection;

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
	
	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.year = projection.getYear();
		this.title = projection.getTitle();
		this.img_url = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
		
	}
	
	

}
