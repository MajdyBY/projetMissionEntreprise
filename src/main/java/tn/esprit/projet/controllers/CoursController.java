package tn.esprit.projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.entities.Cours;
import tn.esprit.projet.services.CoursService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CoursController {

    CoursService coursService ;
    @GetMapping("/retrieve-all-cours")
    public List <Cours> getAllCours() {
        List<Cours> listCours = coursService.retrieveAllCours ();
        return listCours;
    }

    @GetMapping("/retrieve-cours/{idCours}")
    public Cours retrieveCours(@PathVariable ("idCours")Long idCours) {
        return coursService.retrieveCoursById(idCours);
    }

    @PostMapping("/add-cour")
    public Cours addCours(@RequestBody Cours cours) {

        return coursService.addCours(cours);
    }

    @PutMapping("/update-cours")
    public Cours updateCours( @RequestBody Cours cours) {
        Cours  cr = coursService.updateCours ( cours );
        return cr;
    }

    @DeleteMapping("/removeCours/{idCours}")
    public void deleteCours(@PathVariable ("idCours") Long idCours) {

        coursService.deleteCours(idCours);
    }
}
