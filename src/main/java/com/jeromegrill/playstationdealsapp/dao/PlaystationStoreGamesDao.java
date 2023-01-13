package com.jeromegrill.playstationdealsapp.dao;

import com.jeromegrill.playstationdealsapp.model.Game;

import java.util.List;

public interface PlaystationStoreGamesDao {
    public void saveAllGames(Game game);
    public List<String> getAllGamesIds();
    public List<Game> getAllGames();
}
