package tn.esprit.projet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClass;

    private Long idEtablissement;

    private int niveau;

    private int nombreEtudiants;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy")
    private LocalDate anneeUniversitaire;

    private int effectifMax;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set < Mdls > modules;

}
