package com.rafaellauriano.listaJogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellauriano.listaJogos.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
