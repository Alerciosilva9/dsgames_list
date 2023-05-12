package com.dsgames.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dsgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
