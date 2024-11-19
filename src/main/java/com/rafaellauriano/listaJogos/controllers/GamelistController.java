package com.rafaellauriano.listaJogos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaellauriano.listaJogos.dto.GameListDTO;
import com.rafaellauriano.listaJogos.dto.GameMinDTO;
import com.rafaellauriano.listaJogos.services.GameListService;
import com.rafaellauriano.listaJogos.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GamelistController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findall(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}

}
