package com.rafaellauriano.listaJogos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaellauriano.listaJogos.entities.Game;
import com.rafaellauriano.listaJogos.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<Game> findAll(){
		List<Game> result = gameService.findAll();
		return result;
	}
	


}
