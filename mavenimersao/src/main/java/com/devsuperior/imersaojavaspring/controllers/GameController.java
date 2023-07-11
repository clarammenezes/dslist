package com.devsuperior.imersaojavaspring.controllers;

import com.devsuperior.imersaojavaspring.dto.GameMinDTO;
import com.devsuperior.imersaojavaspring.entities.Game;
import com.devsuperior.imersaojavaspring.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    //porta de entrada do backend para disponibilizar a API
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
