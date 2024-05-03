package tn.esprit.projet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Matiere implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatiere;

    private String nomMatiere;

    private Long idModule;

    private int coefficient;

    @ManyToMany(mappedBy="matieres", cascade = CascadeType.ALL)
    private Set < Mdls > modules;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="matiere")
    private Set<Cours> cours ;


}
