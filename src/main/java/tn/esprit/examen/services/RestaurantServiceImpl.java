package tn.esprit.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Repas;
import tn.esprit.examen.entities.Restaurant;
import tn.esprit.examen.repositories.IRepasRepository;
import tn.esprit.examen.repositories.IRestaurantRepository;
import tn.esprit.examen.services.IRestaurantService;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements IRestaurantService {

    @Autowired
    private IRestaurantRepository restaurantRepository;

    @Autowired
    private IRepasRepository repasRepository;

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        Optional<Restaurant> restaurant = restaurantRepository.findById(id);
        return restaurant.orElse(null);
    }

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant updateRestaurant(Long id, Restaurant restaurant) {
        if (restaurantRepository.existsById(id)) {
            restaurant.setId(id);
            return restaurantRepository.save(restaurant);
        } else {
            return null;
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

    @Override
    public String consulterMenu(Long idRepas) {
        return null;
    }

    @Override
    public void commanderRepas(Long idRepas) {

        Repas repas = repasRepository.findById(idRepas).orElse(null);
        if (repas != null) {

        }
    }

    @Override
    public void annulerCommande(Long idRepas) {

        Repas repas = repasRepository.findById(idRepas).orElse(null);
        if (repas != null) {

        }
    }
}
