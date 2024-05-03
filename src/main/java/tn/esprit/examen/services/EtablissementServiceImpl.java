package tn.esprit.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Etablissement;
import tn.esprit.examen.repositories.IEtablissementRepository;
import tn.esprit.examen.services.EtablissementService;

import java.util.List;
import java.util.Optional;

@Service
public class EtablissementServiceImpl implements EtablissementService {

    @Autowired
    private IEtablissementRepository etablissementRepository;

    @Override
    public void definirNiveaux(Long idEtablissement, int niveaux) {
        Etablissement etablissement = etablissementRepository.findById(idEtablissement).orElse(null);
        if (etablissement != null) {
            etablissement.setNiveaux(niveaux);
            etablissementRepository.save(etablissement);
        }
    }

    @Override
    public void definirCapacite(Long idEtablissement, int capacite) {
        Etablissement etablissement = etablissementRepository.findById(idEtablissement).orElse(null);
        if (etablissement != null) {
            etablissement.setCapacite(capacite);
            etablissementRepository.save(etablissement);
        }
    }

    @Override
    public void gererEntretiens(Long idEtablissement) {

    }

    @Override
    public void gererInscriptions(Long idEtablissement) {

    }

    @Override
    public void gererRestauration(Long idEtablissement) {

    }

    @Override
    public void gererClubsActivites(Long idEtablissement) {

    }

    @Override
    public List<Etablissement> getAllEtablissements() {

        return etablissementRepository.findAll();
    }

    @Override
    public Etablissement getEtablissementById(Long id) {
        Optional<Etablissement> etablissement = etablissementRepository.findById(id);
        return etablissement.orElse(null);
    }

    @Override
    public Etablissement createEtablissement(Etablissement etablissement) {
        return etablissementRepository.save(etablissement);
    }

    @Override
    public Etablissement updateEtablissement(Long id, Etablissement etablissement) {
        Optional<Etablissement> existingEtablissement = etablissementRepository.findById(id);
        if (existingEtablissement.isPresent()) {
            Etablissement oldEtablissement = existingEtablissement.get();

            oldEtablissement.setNom(etablissement.getNom());
            oldEtablissement.setAdresse(etablissement.getAdresse());


            return etablissementRepository.save(oldEtablissement);
        } else {
            return null;
        }
    }


    @Override
    public void deleteEtablissement(Long id) {

        etablissementRepository.deleteById(id);
    }
}
