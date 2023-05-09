package com.pedro.Projeto.Java;


import com.pedro.Projeto.Java.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescripition;

    public GameMinDTO(){

    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
       title = entity.getTitle();
       year = entity.getYear();
       imgUrl = entity.getImgUrl();
       shortDescripition = entity.getShortDescripition();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescripition() {
        return shortDescripition;
    }
}
