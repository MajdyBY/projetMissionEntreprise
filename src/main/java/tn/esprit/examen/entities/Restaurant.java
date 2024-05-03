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
public class Restaurant implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRepas;
    private Date date;
    private String heure;
    private String menu;

    @JsonIgnore
    @ManyToOne
    Etablissement etablissement;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="restaurant")
    private Set<Repas> repass;



}
