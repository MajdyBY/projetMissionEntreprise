package tn.esprit.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet.entities.Classe;

@Repository

public interface ClassRepository extends JpaRepository< Classe, Long> {

}
