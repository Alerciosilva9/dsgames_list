package com.dsgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsgames.dto.GameDTO;
import com.dsgames.dto.GameMinDTO;
import com.dsgames.entities.Game;
import com.dsgames.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	

	public List<GameMinDTO> findAll(){
		List<Game> result = repository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
		
	}
	
	public GameDTO findById(Long id) {
		Game result =  repository.findById(id).get();
		return new GameDTO(result);
	}
}
