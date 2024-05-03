package tn.esprit.examen.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen.entities.Repas;


@Repository

public interface IRepasRepository extends JpaRepository<Repas, Long> {
}
