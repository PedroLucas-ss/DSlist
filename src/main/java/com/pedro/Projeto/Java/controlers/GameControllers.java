package com.pedro.Projeto.Java.controlers;

import com.pedro.Projeto.Java.GameDTO;
import com.pedro.Projeto.Java.GameMinDTO;
import com.pedro.Projeto.Java.GameRepository;
import com.pedro.Projeto.Java.entities.Game;
import com.pedro.Projeto.Java.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameControllers {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){

        GameDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping
    public List<GameMinDTO> findAll(){

List<GameMinDTO> result = gameService.findAll();
        return result;

    }
}
