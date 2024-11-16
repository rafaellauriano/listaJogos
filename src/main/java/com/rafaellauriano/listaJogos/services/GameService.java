package com.rafaellauriano.listaJogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaellauriano.listaJogos.entities.Game;
import com.rafaellauriano.listaJogos.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;//injetando uma instância do Game repository dentro do service
	
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}


}
