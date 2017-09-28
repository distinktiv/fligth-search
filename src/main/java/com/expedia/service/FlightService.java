package com.expedia.service;

import com.expedia.model.Flight;
import org.joda.time.DateTime;

import java.util.List;

/**
 * Created by distinktiv on 2017-09-27.
 */
public interface FlightService {
    Flight save(Flight flight);
    void delete(Flight fligth);
    List<Flight> findFlightByDepartureBetween(DateTime fiveHoursBefore, DateTime fiveHoursAfter);

}
