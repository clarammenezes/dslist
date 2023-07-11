package com.devsuperior.imersaojavaspring.repositories;

import com.devsuperior.imersaojavaspring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{

}
