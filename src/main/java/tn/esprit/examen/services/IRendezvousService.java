package tn.esprit.examen.services;


import tn.esprit.examen.entities.Rendezvous;

import java.util.Date;
import java.util.List;

public interface IRendezvousService {

    Rendezvous addRendezvous(Date dateRdv, Parent parent, Eleve eleve);

    Rendezvous updateRendezvous(long idRdv, Date dateRdv, Parent parent, Eleve eleve);

    void deleteRendezvous(long idRdv);

    Rendezvous getRendezvousById(long idRdv);

    List<Rendezvous> getAllRendezvous();
}