package tn.esprit.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Etablissement;
import tn.esprit.examen.services.EtablissementService;

import java.util.List;

@RestController
@RequestMapping("/etablissements")
public class EtablissementController {

    @Autowired
    private EtablissementService etablissementService;

    @GetMapping
    public List<Etablissement> getAllEtablissements() {

        return etablissementService.getAllEtablissements();
    }

    @GetMapping("/{id}")
    public Etablissement getEtablissementById(@PathVariable Long id) {
        return etablissementService.getEtablissementById(id);
    }

    @PostMapping
    public Etablissement createEtablissement(@RequestBody Etablissement etablissement) {
        return etablissementService.createEtablissement(etablissement);
    }

    @PutMapping("/{id}")
    public Etablissement updateEtablissement(@PathVariable Long id, @RequestBody Etablissement etablissement) {
        return etablissementService.updateEtablissement(id, etablissement);
    }

    @DeleteMapping("/{id}")
    public void deleteEtablissement(@PathVariable Long id) {

        etablissementService.deleteEtablissement(id);
    }
}
