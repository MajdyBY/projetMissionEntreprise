package tn.esprit.examen.services;
import tn.esprit.examen.entities.Restaurant;

import java.util.List;

public interface IRestaurantService {
    String consulterMenu(Long idRepas);

    void commanderRepas(Long idRepas);

    void annulerCommande(Long idRepas);

    List<Restaurant> getAllRestaurants();
    Restaurant getRestaurantById(Long id);
    Restaurant createRestaurant(Restaurant restaurant);
    Restaurant updateRestaurant(Long id, Restaurant restaurant);
    void deleteRestaurant(Long id);
}
