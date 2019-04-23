package com.learn.contacts.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private String nameContact;

    @Column
    private String groupContact;

    @OneToMany
    Set<Provider> providerSet;
}
