package tn.esprit.examen.services;
import tn.esprit.examen.entities.Etablissement;

import java.util.List;

public interface EtablissementService {

    void definirNiveaux(Long idEtablissement, int niveaux);
    void definirCapacite(Long idEtablissement, int capacite);
    void gererEntretiens(Long idEtablissement);
    void gererInscriptions(Long idEtablissement);
    void gererRestauration(Long idEtablissement);
    void gererClubsActivites(Long idEtablissement);

    List<Etablissement> getAllEtablissements();

    Etablissement getEtablissementById(Long id);

    Etablissement createEtablissement(Etablissement etablissement);

    Etablissement updateEtablissement(Long id, Etablissement etablissement);

    void deleteEtablissement(Long id);
}
