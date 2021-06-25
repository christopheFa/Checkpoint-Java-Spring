package com.wildcodeschool.carnetvoyages.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateStartTravel;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateEndTravel;
    @OneToMany(mappedBy = "destination", orphanRemoval = true)
    private List<Stage> stageList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateStartTravel() {
        return dateStartTravel;
    }

    public void setDateStartTravel(LocalDate dateStartTravel) {
        this.dateStartTravel = dateStartTravel;
    }

    public LocalDate getDateEndTravel() {
        return dateEndTravel;
    }

    public void setDateEndTravel(LocalDate dateEndTravel) {
        this.dateEndTravel = dateEndTravel;
    }

    public List<Stage> getStageList() {
        return stageList;
    }

    public void setStageList(List<Stage> stageList) {
        this.stageList = stageList;
    }
}
