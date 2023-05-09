package com.pedro.Projeto.Java;

import com.pedro.Projeto.Java.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {



}
