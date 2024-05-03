package tn.esprit.projet.services;

import tn.esprit.projet.entities.Cours;

import java.util.List;

public interface ICoursService {

    List < Cours > retrieveAllCours();
    Cours retrieveCoursById(Long idCours);
    Cours addCours(Cours cours);
    Cours updateCours( Cours cours);
    void deleteCours(Long idCours);
}
