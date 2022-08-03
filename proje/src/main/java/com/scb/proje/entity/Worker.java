package com.scb.proje.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

}
