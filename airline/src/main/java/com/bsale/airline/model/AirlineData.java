package com.bsale.airline.model;

public class AirlineData  {
    private Integer code;
    private Flight  flight;

    public AirlineData(Integer code, Flight flight) {
        this.code = code;
        this.flight = flight;
    }

    public Flight getData() {
        return     flight;
    }

    public Integer getCode() {
        return code;
    }

}