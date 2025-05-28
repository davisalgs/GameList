package com.davisalgs.dslist.repositories;

import com.davisalgs.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}
