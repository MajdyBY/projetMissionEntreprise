package tn.esprit.examen.controllers;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Entretien;
import tn.esprit.examen.entities.Utilisateur;
import tn.esprit.examen.services.IEntretienService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/entretien")
public class EntretienRestController {

    IEntretienService entretienService;


    @PostMapping("{add-entretien]")
    public Entretien addEntretien(@RequestParam long idUser, @RequestParam String status, @RequestParam Date dateEntretien, @RequestParam Utilisateur utilisateur) {
        return entretienService.addEntretien(idUser, status, dateEntretien, utilisateur);
    }

    @PutMapping("/{update-entretien}")
    public Entretien updateEntretien(@PathVariable long id, @RequestParam long idUser, @RequestParam String status, @RequestParam Date dateEntretien, @RequestParam Utilisateur utilisateur) {
        return entretienService.updateEntretien(id, idUser, status, dateEntretien, utilisateur);
    }

    @DeleteMapping("/{delete-entretien}")
    public void deleteEntretien(@PathVariable long id) {
        entretienService.deleteEntretien(id);
    }

    @GetMapping("/{get-entretien}")
    public Entretien getEntretienById(@PathVariable long id) {
        return entretienService.getEntretienById(id);
    }

    @GetMapping("/{get-all-entretien}")
    public List<Entretien> getAllEntretiens() {
        return entretienService.getAllEntretiens();
    }
}

