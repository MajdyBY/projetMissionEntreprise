package tn.esprit.projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.entities.Matiere;
import tn.esprit.projet.services.IMatiereService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/matiere")
public class MatiereController {
    IMatiereService matiereService ;

    @GetMapping("/retrieve-all-matieres")
    public List <Matiere> getAllMatieres() {
        List<Matiere> listMatiere = matiereService.retrieveAllMatieres ();
        return listMatiere;
    }

    @GetMapping("/retrieve-matiere/{id}")
    public Matiere getMatiereById(@PathVariable("idMatiere") Long idMatiere) {

        return matiereService.retrieveMatiereById(idMatiere);
    }

    @PostMapping("/add-matiere")
    public Matiere addMatiere(@RequestBody Matiere m) {
        Matiere matiere = matiereService.addMatiere ( m );
        return matiere;
    }

    @PutMapping("/update-matiere")
    public Matiere updateMatiere(@RequestBody Matiere m) {
        Matiere matiere =  matiereService.updateMatiere ( m );
        return matiere;
    }

    @DeleteMapping("/removeMatiere/{idMatiere}")
    public void deleteMatiere(@PathVariable("idMatiere") Long idMatiere) {

        matiereService.deleteMatiere(idMatiere);
    }
}
