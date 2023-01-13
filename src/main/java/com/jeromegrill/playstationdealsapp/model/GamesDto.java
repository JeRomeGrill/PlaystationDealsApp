package com.jeromegrill.playstationdealsapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class GamesDto {
    @JsonIgnore
    private int age_limit;
    @JsonIgnore
    private List<Optional> attributes;
    @JsonIgnore
    private String container_type;
    @JsonIgnore
    private Long content_origin;
    @JsonIgnore
    private boolean dob_required;
    @JsonIgnore
    private Long id;
    @JsonIgnore
    private List<Optional> images;

    private List<GameDto> links;
    @JsonIgnore
    private String long_desc;
    @JsonIgnore
    private List<Optional> metadata;
    @JsonIgnore
    private String name;
    @JsonIgnore
    private List<Optional> promomedia;
    @JsonIgnore
    private boolean restricted;
    @JsonIgnore
    private int revision;
    @JsonIgnore
    private List<Optional> scene_layout;
    @JsonIgnore
    private int size;
    @JsonIgnore
    private List<Optional> sku_links;
    @JsonIgnore
    private String sort_default;
    @JsonIgnore
    private String sort_default_direction;
    @JsonIgnore
    private int start;
    @JsonIgnore
    private List<Optional> template_def;
    @JsonIgnore
    private Long timestamp;
    @JsonIgnore
    private int total_results;
}
