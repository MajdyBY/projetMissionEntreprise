package tn.esprit.examen.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Entretien;
import tn.esprit.examen.entities.Utilisateur;
import tn.esprit.examen.repositories.EntretienRepository;

import java.util.Date;
import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class EntretienServiceImpl implements IEntretienService{

    EntretienRepository entretienRepo;


    @Override
    public Entretien addEntretien(long idUser, String status, Date dateEntretien, Utilisateur utilisateur) {
        Entretien entretien = new Entretien();
        entretien.setIdUser(idUser);
        entretien.setStatus(status);
        entretien.setDateEntretien(dateEntretien);
        entretien.setUtilisateur(utilisateur);
        return entretienRepo.save(entretien);
    }

    @Override
    public Entretien updateEntretien(long idEntretien, long idUser, String status, Date dateEntretien, Utilisateur utilisateur) {
        Entretien existingEntretien = entretienRepo.findById(idEntretien).orElse(null);
        if (existingEntretien != null) {
            existingEntretien.setIdUser(idUser);
            existingEntretien.setStatus(status);
            existingEntretien.setDateEntretien(dateEntretien);
            existingEntretien.setUtilisateur(utilisateur);
            return entretienRepo.save(existingEntretien);
        }
        return null;
    }

    @Override
    public void deleteEntretien(long idEntretien) {
        entretienRepo.deleteById(idEntretien);
    }

    @Override
    public Entretien getEntretienById(long idEntretien) {
        return entretienRepo.findById(idEntretien).orElse(null);
    }

    @Override
    public List<Entretien> getAllEntretiens() {
        return entretienRepo.findAll();
    }


}

