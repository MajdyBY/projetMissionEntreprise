package tn.esprit.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen.entities.Utilisateur;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
