package tn.esprit.examen.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen.entities.Rendezvous;

@Repository
public interface RendezvousRepository extends JpaRepository<Rendezvous, Long> {
}

