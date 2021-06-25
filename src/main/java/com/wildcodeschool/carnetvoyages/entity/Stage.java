package com.wildcodeschool.carnetvoyages.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private LocalDate dateOfTravelStage;
    private String resumeTravel;
    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Destination destination;

    @OneToMany(mappedBy = "stage", orphanRemoval = true)
    private List<Links> linkList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDateOfTravelStage() {
        return dateOfTravelStage;
    }

    public void setDateOfTravelStage(LocalDate dateOfTravelStage) {
        this.dateOfTravelStage = dateOfTravelStage;
    }

    public String getResumeTravel() {
        return resumeTravel;
    }

    public void setResumeTravel(String resumeTravel) {
        this.resumeTravel = resumeTravel;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public List<Links> getLinkList() {
        return linkList;
    }

    public void setLinkList(List<Links> linkList) {
        this.linkList = linkList;
    }
}
