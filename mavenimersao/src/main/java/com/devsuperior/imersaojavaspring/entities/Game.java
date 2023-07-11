package com.devsuperior.imersaojavaspring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private Integer year;
    private String platforms;
    private Double score;
    private String imgUrl;

    private String genre;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;


    public Game() {
    }

    public Game(Long id, String title, Integer year, String platforms, Double score, String imgUrl, String genre, String shortDescription, String longDescription) {
        this.id = id; //esse id que não está com this é o argumento que chegou no método
        this.title = title; //o this do objeto recebe o argumento que está nos parenteses
        this.year = year;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.genre = genre;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
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

    public void setTitle(String title){
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platform) {
        this.platforms = platform;
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

    public void setImgUrl(String genre) {
        this.imgUrl = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getShortDescription(){
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription(){
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
