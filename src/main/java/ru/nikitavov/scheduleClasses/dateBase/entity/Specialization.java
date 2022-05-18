package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.util.List;

@Entity
@Table(appliesTo = "Specialization")
public class Specialization {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @OneToMany
    @Column
    List<Group> groups;
}
