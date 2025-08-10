package com.airline;

import java.util.HashMap;
import java.util.Map;

public class FlightService {
    private Map<String, Integer> flightAvailability;

    public void setFlightAvailability(Map<String, Integer> flightAvailability) {
        this.flightAvailability = flightAvailability;
    }

    public boolean isAvailable(String flightId) {
        Integer seats = flightAvailability.get(flightId);
        return seats != null && seats > 0;
    }

    public void bookSeat(String flightId) {
        if (isAvailable(flightId)) {
            flightAvailability.put(flightId, flightAvailability.get(flightId) - 1);
        }
    }
}
