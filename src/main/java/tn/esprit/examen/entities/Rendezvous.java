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
public class Rendezvous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRdv;
    Date dateRdv;
    Parent parent;
    Eleve eleve;

    @ManyToOne
    Parent parent;

    @ManyToOne
    Eleve eleve;

}