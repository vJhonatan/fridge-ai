package dev.project.FridgeAi.repository;

import dev.project.FridgeAi.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem,Long> {
}
