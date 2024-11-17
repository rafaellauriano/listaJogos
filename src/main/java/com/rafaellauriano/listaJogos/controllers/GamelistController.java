package com.rafaellauriano.listaJogos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaellauriano.listaJogos.dto.GameListDTO;
import com.rafaellauriano.listaJogos.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GamelistController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findall(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

}
