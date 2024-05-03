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
public class Classe implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClasse;

    private int idEtablissement;
    private int idNiveau;
    private int nombreEtudiant;
    private String anneeScolaire;
    private String effectifMax;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="classe")
    private Set<Utilisateur> Utilisateurs;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etablissement> etablissements;
}