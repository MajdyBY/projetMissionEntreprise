package tn.esprit.projet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.Classe;
import tn.esprit.projet.repositories.ClassRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ClassService implements IClassService{
    private ClassRepository classRepository;

    @Override
    public List < Classe > getAllClasses() {
        return classRepository.findAll();
    }

    @Override
    public Classe getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    @Override
    public Classe addClass(Classe classe) {
        return classRepository.save ( classe );
    }


    @Override
    public void deleteClass(Long idClass) {
        classRepository.deleteById( idClass);

    }
}
