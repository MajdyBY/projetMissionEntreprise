package tn.esprit.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet.entities.Cours;
@Repository
public interface CoursRepository extends JpaRepository < Cours, Long> {
}
