package com.jeromegrill.playstationdealsapp.controller;

import com.jeromegrill.playstationdealsapp.model.GameDto;
import com.jeromegrill.playstationdealsapp.service.PlaystationStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URISyntaxException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/games/")
public class RestController {
    private PlaystationStoreServiceImpl playstationStoreServiceImpl;

    @Autowired
    public RestController(PlaystationStoreServiceImpl playstationStoreServiceImpl) {
        this.playstationStoreServiceImpl = playstationStoreServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<GameDto>> getAllUsers() throws URISyntaxException {
        return ResponseEntity.ok(playstationStoreServiceImpl.findAllGames());
    }
}
