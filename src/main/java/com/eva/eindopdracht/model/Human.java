package com.eva.eindopdracht.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Human {

    @Id
    @SequenceGenerator(name = "human_sequence", sequenceName = "human_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "human_sequence")
    @Column(name = "id", updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public Human(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Human [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
    }

}
