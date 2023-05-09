package com.pedro.Projeto.Java.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_game")

public class Game {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition =  "TEXT")
    private String shortDescripition;

    @Column(columnDefinition =  "TEXT")
    private String longDescription;


    public Game(Long id, String title, Integer year, String genre, String platform,Double score, String imgUrl, String shortDescripition, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescripition = shortDescripition;
        this.longDescription = longDescription;
    }

    public Game() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescripition() {
        return shortDescripition;
    }

    public void setShortDescripition(String shortDescripition) {
        this.shortDescripition = shortDescripition;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;
        return Objects.equals(getId(), game.getId()) && Objects.equals(getTitle(), game.getTitle()) && Objects.equals(getYear(), game.getYear()) && Objects.equals(getGenre(), game.getGenre()) && Objects.equals(getPlatform(), game.getPlatform()) && Objects.equals(getImgUrl(), game.getImgUrl()) && Objects.equals(getShortDescripition(), game.getShortDescripition()) && Objects.equals(getLongDescription(), game.getLongDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getYear(), getGenre(), getPlatform(), getImgUrl(), getShortDescripition(), getLongDescription());
    }
}

