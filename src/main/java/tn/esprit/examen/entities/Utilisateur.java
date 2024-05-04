package tn.esprit.examen.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur; // Clé primaire
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String emaailUtilisateur;
    @Enumerated(EnumType.STRING)
    private Role role;


}

