package tn.esprit.projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.entities.Classe;
import tn.esprit.projet.services.IClassService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class ClassController {
    @Autowired
    IClassService classService ;
// http://localhost:8089/edtech/projet/getAllClasses
    @GetMapping("/retrieve-all-classes")
    public List < Classe > getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public Classe getClassById(@PathVariable Long id) {
        Classe classe = classService.getClassById(id);
        return classe;
    }
//http://localhost:8087/edtech/swagger-ui/index.html#/
    @PostMapping("/add-classe")
    @ResponseBody
    public Classe addClass(@RequestBody Classe clas) {
        Classe classe = classService.addClass (clas);
        return classe;
    }

    @DeleteMapping("/removeClasse/{idClass}")
    public void deleteClass(@PathVariable ("idClass") Long idClass) {
        classService.deleteClass(idClass);

    }



}
