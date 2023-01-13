package com.jeromegrill.playstationdealsapp.controller;

import com.jeromegrill.playstationdealsapp.service.PlaystationStoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {
    PlaystationStoreService playstationStoreService;

    public ViewController(PlaystationStoreService playstationStoreService) {
        this.playstationStoreService = playstationStoreService;
    }

    @GetMapping("/saveAll")
    public String addAllGamesInDb () {
        playstationStoreService.saveAllGamesInDb();
        return "main";
    }

}
