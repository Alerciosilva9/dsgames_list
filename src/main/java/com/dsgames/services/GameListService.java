package com.dsgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsgames.dto.GameDTO;
import com.dsgames.dto.GameListDTO;
import com.dsgames.dto.GameMinDTO;
import com.dsgames.entities.Game;
import com.dsgames.entities.GameList;
import com.dsgames.repositories.GameListRepository;
import com.dsgames.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository repository;
	

	public List<GameListDTO> findAll(){
		List<GameList> result = repository.findAll();
		return result.stream().map(GameListDTO::new).toList();
		
	}
	
}
