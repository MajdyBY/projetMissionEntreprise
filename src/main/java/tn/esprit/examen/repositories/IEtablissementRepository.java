package tn.esprit.examen.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen.entities.Etablissement;

@Repository
public interface IEtablissementRepository extends JpaRepository<Etablissement, Long> {





}
