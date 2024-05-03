package tn.esprit.projet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.Cours;
import tn.esprit.projet.repositories.CoursRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CoursService  implements ICoursService{
    CoursRepository coursRepository;
    @Override
    public List < Cours > retrieveAllCours() {
        return coursRepository.findAll();    }

    @Override
    public Cours retrieveCoursById(Long idCours) {
        return coursRepository.findById(idCours).orElse(null);
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);    }

    @Override
    public Cours updateCours(Cours cours) {

            return coursRepository.save(cours);

    }

    @Override
    public void deleteCours(Long idCours) {
        coursRepository.deleteById(idCours);

    }
}
