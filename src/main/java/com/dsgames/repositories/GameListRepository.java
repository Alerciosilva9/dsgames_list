package com.dsgames.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dsgames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
