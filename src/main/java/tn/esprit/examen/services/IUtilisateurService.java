package tn.esprit.examen.services;

import tn.esprit.examen.entities.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface IUtilisateurService {

    List<Utilisateur> retrieveallutilisateur();
    Utilisateur addUtilisateur(Utilisateur u);
    Utilisateur UpdateUtilisateur(Utilisateur u);

    Optional<Utilisateur> retrieveUtilisateur(Long idUtilisateur);
    void RemoveUtilisateur(Long idUtilisateur);
}
