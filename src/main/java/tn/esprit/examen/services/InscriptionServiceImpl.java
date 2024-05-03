package tn.esprit.examen.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Inscription;
import tn.esprit.examen.repositories.InscriptionRepository;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class InscriptionServiceImpl implements IInscriptionService{

    InscriptionRepository inscriptionRepo;


    @Override
    public Inscription addInscription(Date dateEntretien, Eleve eleve, String status) {
        Inscription inscription = new Inscription();
        inscription.setDateEntretien(dateEntretien);
        inscription.setEleve(eleve);
        inscription.setStatus(status);
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription updateInscription(long idInscription, Date dateEntretien, Eleve eleve, String status) {
        Inscription existingInscription = inscriptionRepo.findById(idInscription).orElse(null);
        if (existingInscription != null) {
            existingInscription.setDateEntretien(dateEntretien);
            existingInscription.setEleve(eleve);
            existingInscription.setStatus(status);
            return inscriptionRepo.save(existingInscription);
        }
        return null;
    }

    @Override
    public void deleteInscription(long idInscription) {
        inscriptionRepo.deleteById(idInscription);
    }

    @Override
    public Inscription getInscriptionById(long idInscription) {
        return inscriptionRepo.findById(idInscription).orElse(null);
    }

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepo.findAll();
    }
}
