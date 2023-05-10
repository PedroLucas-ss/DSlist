package com.pedro.Projeto.Java;

import com.pedro.Projeto.Java.entities.Game;
import com.pedro.Projeto.Java.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {



}
