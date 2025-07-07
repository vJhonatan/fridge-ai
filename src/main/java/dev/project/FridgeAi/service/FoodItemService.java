package dev.project.FridgeAi.service;

import dev.project.FridgeAi.model.FoodItem;
import dev.project.FridgeAi.repository.FoodItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {

    private final FoodItemRepository repository;

    public FoodItemService(FoodItemRepository repository) {
        this.repository = repository;
    }

    public FoodItem createFoodItem(FoodItem foodItem){
        return repository.save(foodItem);
    }

    public List<FoodItem> getAllFoodItems() {
        return repository.findAll();
    }

    public Optional<FoodItem> getFoodById(Long id){
        return repository.findById(id);
    }

    public FoodItem updateFoodItem(Long id, FoodItem foodItem){
        return repository.save(foodItem);
    }

    public void deleteFood (Long id){
        repository.deleteById(id);
    }
}
