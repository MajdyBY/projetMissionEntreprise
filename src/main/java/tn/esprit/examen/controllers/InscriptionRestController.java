package tn.esprit.examen.controllers;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Inscription;
import tn.esprit.examen.services.IInscriptionService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/inscription")
public class InscriptionRestController {

    IInscriptionService inscriptionService;

    @PostMapping("/{add-inscription}")
    public Inscription addInscription(@RequestParam Date dateEntretien, @RequestParam Eleve eleve, @RequestParam String status) {
        return inscriptionService.addInscription(dateEntretien, eleve, status);
    }

    @PutMapping("/{update-inscription}")
    public Inscription updateInscription(@PathVariable long id, @RequestParam Date dateEntretien, @RequestParam Eleve eleve, @RequestParam String status) {
        return inscriptionService.updateInscription(id, dateEntretien, eleve, status);
    }

    @DeleteMapping("/{delete-inscription}")
    public void deleteInscription(@PathVariable long id) {
        inscriptionService.deleteInscription(id);
    }

    @GetMapping("/{get-inscription}")
    public Inscription getInscriptionById(@PathVariable long id) {
        return inscriptionService.getInscriptionById(id);
    }

    @GetMapping("/{get-all-inscription}")
    public List<Inscription> getAllInscriptions() {
        return inscriptionService.getAllInscriptions();
    }

}
