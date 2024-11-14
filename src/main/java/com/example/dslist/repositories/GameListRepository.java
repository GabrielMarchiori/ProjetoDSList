package com.example.dslist.repositories;

import com.example.dslist.entidades.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {


}
