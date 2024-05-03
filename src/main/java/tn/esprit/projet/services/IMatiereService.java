package tn.esprit.projet.services;

import tn.esprit.projet.entities.Matiere;

import java.util.List;

public interface IMatiereService {

    List < Matiere > retrieveAllMatieres();
    Matiere retrieveMatiereById(Long idMatere);
    Matiere addMatiere(Matiere m);
    Matiere updateMatiere( Matiere m);
    void deleteMatiere(Long idMatiere);
}
