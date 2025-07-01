package dev.project.FridgeAi.model;

import dev.project.FridgeAi.enums.CategoryEnum;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "tb_food_item")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private CategoryEnum category;

    private Integer quantity;

    private LocalDate validateDate;

}
