package tn.esprit.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
