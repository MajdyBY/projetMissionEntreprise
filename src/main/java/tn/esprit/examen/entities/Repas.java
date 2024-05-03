package tn.esprit.examen.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Repas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRepas;
    private String nom;
    private String type;
    private String description;

    @JsonIgnore
    @ManyToOne
    Restaurant restaurant;



}