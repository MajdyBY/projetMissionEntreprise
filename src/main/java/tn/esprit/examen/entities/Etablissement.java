package tn.esprit.examen.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtablissement;
    private String nom;
    private String adresse;
    private String type;
    private int niveaux;
    private int nombreClasses;
    private int capacite;


    @JsonIgnore
    @ManyToMany(mappedBy="etablissements", cascade = CascadeType.ALL)
    private Set<Classe> classes;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etablissement")
    private Set<Restaurant> restaurants;


}
