package com.jeromegrill.playstationdealsapp.dao;

import com.jeromegrill.playstationdealsapp.model.Game;
import com.jeromegrill.playstationdealsapp.service.PlaystationStoreClient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlaystationStoreGamesDaoImpl implements PlaystationStoreGamesDao {
    @PersistenceContext
    private EntityManager entityManager;
    private List<String> allGamesList;

    private PlaystationStoreClient playstationStoreClient;
@Autowired
    public PlaystationStoreGamesDaoImpl(PlaystationStoreClient playstationStoreClient) {
        this.playstationStoreClient = playstationStoreClient;
    }

    @Override
    public void saveAllGames(Game game) {
        if (!this.allGamesList.contains(game.getId())) {
            entityManager.persist(game);
            System.out.println("All games were added successfully");
        }
        else {
            System.out.println(game.getName()+" is already in DataBase");
        }
    }

    @Override
    public List<String> getAllGamesIds() {
    this.allGamesList = entityManager.createQuery("select id from Game ").getResultList();
        return this.allGamesList;
    }

    @Override
    public List<Game> getAllGames() {
        return entityManager.createQuery("from Game ").getResultList();
    }
}
