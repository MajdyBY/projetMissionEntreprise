package tn.esprit.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet.entities.Matiere;

@Repository

public interface MatiereRepository extends JpaRepository < Matiere,Long> {
}
