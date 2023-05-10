package com.pedro.Projeto.Java;


import com.pedro.Projeto.Java.entities.Game;
import com.pedro.Projeto.Java.projections.GameMinProjection;

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

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescripition = projection.getShortDescripition();
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
