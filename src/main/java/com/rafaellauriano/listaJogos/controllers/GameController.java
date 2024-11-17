package com.rafaellauriano.listaJogos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaellauriano.listaJogos.dto.GameDTO;
import com.rafaellauriano.listaJogos.dto.GameMinDTO;
import com.rafaellauriano.listaJogos.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	//buscar por id
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	public List<GameMinDTO> findall(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}
