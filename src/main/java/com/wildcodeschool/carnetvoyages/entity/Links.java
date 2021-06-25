package com.wildcodeschool.carnetvoyages.entity;

import javax.persistence.*;

@Entity
public class Links {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String link;
    @ManyToOne
    @JoinColumn(name = "stage_id")
    private Stage stage;

}
