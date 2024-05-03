package tn.esprit.examen.services;

import tn.esprit.examen.entities.Inscription;

import java.util.Date;
import java.util.List;

public interface IInscriptionService {

    Inscription addInscription(Date dateEntretien, Eleve eleve, String status);

    Inscription updateInscription(long idInscription, Date dateEntretien, Eleve eleve, String status);

    void deleteInscription(long idInscription);

    Inscription getInscriptionById(long idInscription);

    List<Inscription> getAllInscriptions();
}