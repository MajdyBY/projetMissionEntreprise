package tn.esprit.examen.controllers;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Rendezvous;
import tn.esprit.examen.services.IRendezvousService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/rendezvous")
public class RendezvousRestController {

    IRendezvousService rendezvousService;

    @PostMapping("{add-rendezvous]")
    public Rendezvous addRendezvous(@RequestParam Date dateRdv, @RequestParam Parent parent, @RequestParam Eleve eleve) {
        return rendezvousService.addRendezvous(dateRdv, parent, eleve);
    }

    @PutMapping("/{update-rendezvous}")
    public Rendezvous updateRendezvous(@PathVariable long id, @RequestParam Date dateRdv, @RequestParam Parent parent, @RequestParam Eleve eleve) {
        return rendezvousService.updateRendezvous(id, dateRdv, parent, eleve);
    }

    @DeleteMapping("/{delete-rendezvous}")
    public void deleteRendezvous(@PathVariable long id) {
        rendezvousService.deleteRendezvous(id);
    }

    @GetMapping("/{get-rendezvous}")
    public Rendezvous getRendezvousById(@PathVariable long id) {
        return rendezvousService.getRendezvousById(id);
    }

    @GetMapping("{get-all-rendezvous}")
    public List<Rendezvous> getAllRendezvous() {
        return rendezvousService.getAllRendezvous();
    }

}

