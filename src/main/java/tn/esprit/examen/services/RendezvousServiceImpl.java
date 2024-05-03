package tn.esprit.examen.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Rendezvous;
import tn.esprit.examen.repositories.RendezvousRepository;

import java.util.Date;
import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class RendezvousServiceImpl implements IRendezvousService{

    RendezvousRepository rendezvousRepo;

    @Override
    public Rendezvous addRendezvous(Date dateRdv, Parent parent, Eleve eleve) {
        Rendezvous rendezvous = new Rendezvous();
        rendezvous.setDateRdv(dateRdv);
        rendezvous.setParent(parent);
        rendezvous.setEleve(eleve);
        return rendezvousRepo.save(rendezvous);
    }

    @Override
    public Rendezvous updateRendezvous(long idRdv, Date dateRdv, Parent parent, Eleve eleve) {
        Rendezvous existingRendezvous = rendezvousRepo.findById(idRdv).orElse(null);
        if (existingRendezvous != null) {
            existingRendezvous.setDateRdv(dateRdv);
            existingRendezvous.setParent(parent);
            existingRendezvous.setEleve(eleve);
            return rendezvousRepo.save(existingRendezvous);
        }
        return null;
    }

    @Override
    public void deleteRendezvous(long idRdv) {
        rendezvousRepo.deleteById(idRdv);
    }

    @Override
    public Rendezvous getRendezvousById(long idRdv) {
        return rendezvousRepo.findById(idRdv).orElse(null);
    }

    @Override
    public List<Rendezvous> getAllRendezvous() {
        return rendezvousRepo.findAll();
    }
}

