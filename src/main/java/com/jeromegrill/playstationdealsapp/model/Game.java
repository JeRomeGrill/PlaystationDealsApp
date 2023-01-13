package com.jeromegrill.playstationdealsapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Game {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long primaryId;
    private String id;
    private String name;

    private String release_date;
    private String url;

    public Game(GameDto gameDto) {
        this.id = gameDto.getId();
        this.name = gameDto.getName();
        this.release_date = gameDto.getRelease_date();
        this.url = gameDto.getUrl();
    }
    public Game() {

    }
}
