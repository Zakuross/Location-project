package edu.campusnum.location.vehicule.dao;

import edu.campusnum.location.vehicule.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> findAll();
}
