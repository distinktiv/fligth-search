package com.expedia.service;

import com.expedia.model.Flight;
import com.expedia.repository.FlightRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by distinktiv on 2017-09-27.
 */
public class FlightServiceImpl implements FlightService{


    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void delete(Flight flight) {
         flightRepository.delete(flight);
    }

    @Override
    public List<Flight> findFlightByDepartureBetween(DateTime fiveHoursBefore, DateTime fiveHoursAfter) {
        return flightRepository.findFlightByDepartureBetween(fiveHoursBefore,fiveHoursAfter);
    }
}
