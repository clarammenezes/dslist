package com.devsuperior.imersaojavaspring.dto;

import com.devsuperior.imersaojavaspring.entities.Game;

public class GameMinDTO {
    //customizar a saída de dados da API
    private Long id;
    private String title;
    private Integer year;

    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
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

    public String getShortDescription() {
        return shortDescription;
    }
}
