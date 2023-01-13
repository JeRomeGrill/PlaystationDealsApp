package com.jeromegrill.playstationdealsapp.service;

import com.jeromegrill.playstationdealsapp.model.Game;
import com.jeromegrill.playstationdealsapp.model.GameDto;

import java.util.List;

public interface PlaystationStoreService {

    public List<GameDto> findAllGames();
    public void saveAllGamesInDb();
    public List<Game> getAllGames();
}
