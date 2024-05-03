package tn.esprit.examen.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idInscription;
    Date dateEntretien;

    Eleve eleve;
    String status;

    @ManyToOne
    Eleve eleve;
}
