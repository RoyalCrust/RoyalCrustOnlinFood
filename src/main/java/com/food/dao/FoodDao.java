package com.food.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.food.model.Food;


public interface FoodDao extends JpaRepository<Food,String> {

}
