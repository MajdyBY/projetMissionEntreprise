package tn.esprit.projet.services;

import tn.esprit.projet.entities.Classe;

import java.util.List;

public interface IClassService {
    List < Classe > getAllClasses();
    Classe getClassById(Long id);
    Classe addClass(Classe classe);
    void deleteClass(Long id);
}
