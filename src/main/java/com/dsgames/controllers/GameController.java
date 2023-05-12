package com.dsgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dsgames.dto.GameDTO;
import com.dsgames.dto.GameMinDTO;
import com.dsgames.entities.Game;
import com.dsgames.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	GameService service;
	
	@GetMapping
	public List<GameMinDTO> findall() {
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findOne(@PathVariable Long id) {
		GameDTO result = service.findById(id);
		return result;
	}
}
