package dev.project.FridgeAi.controller;

import dev.project.FridgeAi.model.FoodItem;
import dev.project.FridgeAi.service.FoodItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/food-item")
public class FoodItemController {

    private final FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FoodItem> createFoodItem(@RequestBody FoodItem foodItem){
        foodItem = service.createFoodItem(foodItem);
        return ResponseEntity.ok(foodItem);
    }

    @GetMapping
    public ResponseEntity<List<FoodItem>> getAllFoodItems(){
        List<FoodItem> lista = service.getAllFoodItems();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("{id}")
    public Optional<FoodItem> getFoodById(@PathVariable Long id){
        Optional<FoodItem> food = service.getFoodById(id);
        return food;
    }

    @PutMapping("{id}")
    public ResponseEntity<FoodItem> updateFoodItem(@PathVariable Long id, @RequestBody FoodItem foodItem){
        foodItem.setId(id);
        FoodItem newFoodItem = service.updateFoodItem(id,foodItem);
        return ResponseEntity.ok(newFoodItem);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable Long id){
        service.deleteFood(id);
        return ResponseEntity.noContent().build();
    }
}
