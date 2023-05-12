package com.dsgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsgames.entities.Game;
import com.dsgames.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	GameService service;
	
	@GetMapping
	public List<Game> findall() {
		return service.findAll();
	}
}
