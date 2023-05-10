package com.bsale.airline.controller;

import com.bsale.airline.model.AirlineData;
import com.bsale.airline.model.Flight;
import com.bsale.airline.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping //(path="api")
public  class  FlightController {

  @Autowired
   private IFlightService  serviceFlight;

    @GetMapping("/flights/{id}")
    public Optional<Flight> findById(@PathVariable("id") Integer id) {
        return  serviceFlight.findById(id);
    }

    @GetMapping("/flights/{id}/passengers" )
    public AirlineData  data( @PathVariable("id") Integer  Id ) {
        Flight flight = serviceFlight.buscarVuelo(Id);
        return new AirlineData(200,  flight);
    }

}
