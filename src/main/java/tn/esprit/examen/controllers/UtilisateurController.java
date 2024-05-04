package tn.esprit.examen.controllers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Utilisateur;
import tn.esprit.examen.services.UtilisateurService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {

    public final UtilisateurService utilisateurService;


    @GetMapping("/AllEtudiants")
    public List<Utilisateur> getUtilisateurs()
    {

        List<Utilisateur> lists =  utilisateurService.retrieveallutilisateur();
        return lists;
    }
    // http://localhost:8081/etudiant/add-etudiant
    @PostMapping("/add-Utilisateur")
    public Utilisateur addEtudiant(@RequestBody Utilisateur u) {
        Utilisateur utilisateur = utilisateurService.addUtilisateur(u);
        return utilisateur;
    }


    @GetMapping("/retrieve-utilisateur/{utilisateur-id}")
    public Optional<Utilisateur> retrieveEtudiant(@PathVariable("utilisateur-id") Long utilisateurId) {
        return utilisateurService.retrieveUtilisateur(utilisateurId);
    }
    // http://localhost:8089/foyer/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-utilisateur/{utilisateur-id}")
    public void removeEtudiant(@PathVariable("utilisateur-id}") Long utilisateurId) {
        utilisateurService.RemoveUtilisateur(utilisateurId);
    }
    // http://localhost:8089/foyer/etudiant/update-etudiant
    @PutMapping("/update-utilisateur")
    public Utilisateur updateEtudiant(@RequestBody Utilisateur u) {
        Utilisateur utilisateur= utilisateurService.UpdateUtilisateur(u);
        return utilisateur;
    }













}
