package tn.esprit.projet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.Matiere;
import tn.esprit.projet.repositories.MatiereRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MatiereService implements  IMatiereService{
    MatiereRepository matiereRepository ;

    @Override
    public List < Matiere > retrieveAllMatieres() {
        return matiereRepository.findAll ();
    }

    @Override
    public Matiere retrieveMatiereById(Long idMatere) {
        return matiereRepository.findById ( idMatere).orElse ( null );
    }

    @Override
    public Matiere addMatiere(Matiere m) {
        return matiereRepository.save ( m );
    }

    @Override
    public Matiere updateMatiere(Matiere m) {
        return  matiereRepository.save ( m );
    }

    @Override
    public void deleteMatiere(Long idMatiere) {
        matiereRepository.deleteById ( idMatiere );

    }
}
