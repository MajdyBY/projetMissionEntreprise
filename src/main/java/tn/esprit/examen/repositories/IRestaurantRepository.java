package tn.esprit.examen.repositories;

import tn.esprit.examen.entities.Restaurant;

import java.util.List;
import java.util.Optional;

public interface IRestaurantRepository {
    List<Restaurant> findAll();

    Optional<Restaurant> findById(Long id);

    Restaurant save(Restaurant restaurant);

    boolean existsById(Long id);

    void deleteById(Long id);
}
