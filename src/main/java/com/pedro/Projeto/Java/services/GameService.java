package com.pedro.Projeto.Java.services;

import com.pedro.Projeto.Java.GameDTO;
import com.pedro.Projeto.Java.GameMinDTO;
import com.pedro.Projeto.Java.GameRepository;
import com.pedro.Projeto.Java.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {


    @Autowired
    private GameRepository  gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)

    public List<GameMinDTO> findAll() {

     List<Game>  result = gameRepository.findAll();
     List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
     return dto;


    }
}
