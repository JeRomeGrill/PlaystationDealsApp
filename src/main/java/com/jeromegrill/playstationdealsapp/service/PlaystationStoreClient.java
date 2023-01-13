package com.jeromegrill.playstationdealsapp.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jeromegrill.playstationdealsapp.model.GameDto;
import com.jeromegrill.playstationdealsapp.model.GamesDto;
import org.hibernate.mapping.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class PlaystationStoreClient {

    private RestTemplate restTemplate = new RestTemplate();
    public List<GameDto> getGames() throws URISyntaxException {
        String url = "https://store.playstation.com/store/api/chihiro/00_09_000/container/tr/en/9999/STORE-MSF75508-FULLGAMES?size=13000";
        GamesDto response = restTemplate.getForObject(new URI(url), GamesDto.class);
        return response.getLinks();
    }
}
