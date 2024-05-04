package tn.esprit.examen.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Utilisateur;
import tn.esprit.examen.repositories.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UtilisateurService implements IUtilisateurService{

    public  final UtilisateurRepository utilisateurRepository;
    @Override
    public List<Utilisateur> retrieveallutilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur addUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public Utilisateur UpdateUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public Optional<Utilisateur> retrieveUtilisateur(Long idUtilisateur) {
        return utilisateurRepository.findById(idUtilisateur);
    }

    @Override
    public void RemoveUtilisateur(Long idUtilisateur) {
        utilisateurRepository.deleteById(idUtilisateur);

    }
}
