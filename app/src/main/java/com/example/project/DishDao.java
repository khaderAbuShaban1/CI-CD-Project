package com.example.project;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DishDao {

    @Insert
    void insert(Dish dish);
    @Update
    void update(Dish dish);
    @Delete
    void delete(Dish dish);
    @Query("SELECT * FROM dishes")
    LiveData<List<Dish>> getAllDishes();
    @Query("SELECT * FROM dishes WHERE category = :category")
    LiveData<List<Dish>> getDishesByCategory(String category);
    @Query("SELECT * FROM dishes WHERE name = :dishName LIMIT 1")
    Dish getDishByName(String dishName);
}
