package com.jeromegrill.playstationdealsapp.service;

import com.jeromegrill.playstationdealsapp.dao.PlaystationStoreGamesDao;
import com.jeromegrill.playstationdealsapp.model.Game;
import com.jeromegrill.playstationdealsapp.model.GameDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.URISyntaxException;
import java.util.List;

@Service
public class PlaystationStoreServiceImpl implements PlaystationStoreService {
    private PlaystationStoreClient playstationStoreClient;
    private PlaystationStoreGamesDao playstationStoreGamesDao;

    @Autowired
    public PlaystationStoreServiceImpl(PlaystationStoreClient playstationStoreClient, PlaystationStoreGamesDao playstationStoreGamesDao) {
        this.playstationStoreClient = playstationStoreClient;
        this.playstationStoreGamesDao = playstationStoreGamesDao;
    }

    public List<GameDto> findAllGames() {
        try {
            return playstationStoreClient.getGames();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public void saveAllGamesInDb() {
        List<GameDto> allGames = findAllGames();
        playstationStoreGamesDao.getAllGamesIds();
        for (GameDto gameDto : allGames) {
            Game game = new Game(gameDto);
            playstationStoreGamesDao.saveAllGames(game);
        }
    }

    @Override
    public List<Game> getAllGames() {
        return playstationStoreGamesDao.getAllGames();
    }

}
