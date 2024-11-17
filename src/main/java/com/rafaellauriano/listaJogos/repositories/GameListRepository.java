package com.rafaellauriano.listaJogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellauriano.listaJogos.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
