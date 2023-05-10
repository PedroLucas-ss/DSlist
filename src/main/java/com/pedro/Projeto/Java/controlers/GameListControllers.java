package com.pedro.Projeto.Java.controlers;

import com.pedro.Projeto.Java.GameDTO;
import com.pedro.Projeto.Java.GameListDTO;
import com.pedro.Projeto.Java.GameMinDTO;
import com.pedro.Projeto.Java.services.GameListService;
import com.pedro.Projeto.Java.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControllers {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){

List<GameListDTO> result = gameListService.findAll();
        return result;

    }
}
