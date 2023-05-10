package com.pedro.Projeto.Java.services;

import com.pedro.Projeto.Java.*;
import com.pedro.Projeto.Java.entities.Game;
import com.pedro.Projeto.Java.entities.GameList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {


    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        {
            return result.stream().map(x -> new GameListDTO(x)).toList();


        }
    }
}
