package com.eva.eindopdracht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
public class Candidate extends Human {
    @Column(name = "group")
    private String group;
    @Column(name = "expertise")
    private String expertise;

    public Candidate(String firstName, String lastName, LocalDate dob, String group, String expertise) {
        super(firstName, lastName, dob);
        this.group = group;
        this.expertise = expertise;
    }

    public Candidate() {
        super();
    }
}
