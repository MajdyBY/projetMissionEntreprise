package tn.esprit.projet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCours;

    private Long idMatiere;

    private Long idClasse;

    private Long idUtilisateur;

    private Long idEtablissement;
    private  String nomCours ;
    private String modepasse ;

    @ManyToOne
    Matiere matiere;
}
