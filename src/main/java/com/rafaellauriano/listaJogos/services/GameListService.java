package com.rafaellauriano.listaJogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaellauriano.listaJogos.dto.GameListDTO;
import com.rafaellauriano.listaJogos.entities.GameList;
import com.rafaellauriano.listaJogos.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;//injetando uma instância do Game repository dentro do service
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();//pega cada objeto da lista original, e da um new nele para virar um gameListDTO 
	}
	
}
