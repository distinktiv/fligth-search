package com.expedia.repository;

import com.expedia.model.Flight;
import org.joda.time.DateTime;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by distinktiv on 2017-09-27.
 */
public interface FlightRepository extends ElasticsearchRepository<Flight, String> {

    List<Flight> findFlightByDepartureBetween(DateTime fiveHoursBefore, DateTime fiveHoursAfter);
}
