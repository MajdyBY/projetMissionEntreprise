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
public class Mdls implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModule;

    private String nommodule;

    private int coefficient;

    @ManyToMany(mappedBy="modules", cascade = CascadeType.ALL)
    private Set < Classe > classes;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Matiere> matieres;

}
