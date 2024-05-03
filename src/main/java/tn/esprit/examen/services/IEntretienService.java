package tn.esprit.examen.services;


import tn.esprit.examen.entities.Entretien;
import tn.esprit.examen.entities.Utilisateur;

import java.util.Date;
import java.util.List;

public interface IEntretienService {

    Entretien addEntretien(long idUser, String status, Date dateEntretien, Utilisateur utilisateur);

    Entretien updateEntretien(long idEntretien, long idUser, String status, Date dateEntretien, Utilisateur utilisateur);

    void deleteEntretien(long idEntretien);

    Entretien getEntretienById(long idEntretien);

    List<Entretien> getAllEntretiens();


}
