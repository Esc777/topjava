package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.util.List;

/**
 * GKislin
 * 06.03.2015.
 */
public interface MealRepository {
    Meal save(Meal Meal, int UserId);

    boolean delete(int id, int UserId);

    Meal get(int id,int UserId);

    List<Meal> getAll(int UserId);

    List<Meal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
