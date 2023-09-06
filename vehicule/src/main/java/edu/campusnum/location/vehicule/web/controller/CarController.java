package edu.campusnum.location.vehicule.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String listCars() {
        return "Vehicule 1";
    }

//    @GetMapping("/{id}")
//    public Car showOneCar (@PathVariable int id) {
//    }

}
