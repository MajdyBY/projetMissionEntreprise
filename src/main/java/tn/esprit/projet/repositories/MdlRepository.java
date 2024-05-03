package tn.esprit.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet.entities.Mdls;

@Repository

public interface MdlRepository extends JpaRepository< Mdls,Long> {
}
