package org.kamil.schedule.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lecture {


    @Id
    private Long id;

    private String code;

    private String name;

    @ManyToOne
    private Account teacher;

    @ManyToOne
    private Account student;


}
