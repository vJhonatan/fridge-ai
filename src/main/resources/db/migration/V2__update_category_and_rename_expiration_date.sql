-- Migration 2: Corrige coluna category e renomeia expiration_date para validate_date

ALTER TABLE tb_food_item
    ALTER COLUMN category TYPE VARCHAR(255);

ALTER TABLE tb_food_item
    RENAME COLUMN expiration_date TO validate_date;