package com.jeromegrill.playstationdealsapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;
import java.util.Optional;
@Data
public class GameDto {
    @JsonIgnore
    private String bucket;
    @JsonIgnore
    private String container_type;
    @JsonIgnore
    private String content_type;
    @JsonIgnore
    private List<Optional> default_sku;
    @JsonIgnore
    private List<Optional> gameContentTypesList;
    @JsonIgnore
    private String game_contentType;
    private String id;
    @JsonIgnore
    private List<Optional> images;
    private String name;
    @JsonIgnore
    private String parent_name;
    private List<String> playable_platform;
    @JsonIgnore
    private String provider_name;
    private String release_date;
    @JsonIgnore
    private boolean restricted;
    @JsonIgnore
    private int revision;
    @JsonIgnore
    private String short_name;
    @JsonIgnore
    private Long timestamp;
    @JsonIgnore
    private String top_category;
    private String url;




}
