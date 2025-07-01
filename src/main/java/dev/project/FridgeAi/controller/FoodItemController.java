package dev.project.FridgeAi.controller;

import dev.project.FridgeAi.model.FoodItem;
import dev.project.FridgeAi.service.FoodItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
