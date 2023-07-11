package com.devsuperior.imersaojavaspring.services;

import com.devsuperior.imersaojavaspring.dto.GameMinDTO;
import com.devsuperior.imersaojavaspring.entities.Game;
import com.devsuperior.imersaojavaspring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository; //injetando uma instancia do GameRepository dentro do GameService

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
