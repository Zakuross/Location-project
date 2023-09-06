package edu.campusnum.location.vehicule.dao;

import edu.campusnum.location.vehicule.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends JpaRepository<Car, Integer> {
    List<Car> findAll();
}
