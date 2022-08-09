package com.example.davaleba.entity;

import javax.persistence.Entity;
import javax.persistence.*;
@Entity
@Table(schema = "core")
public class Users {
    @Id
    Integer id;

    @Column(name="name")
    public String name;


}
