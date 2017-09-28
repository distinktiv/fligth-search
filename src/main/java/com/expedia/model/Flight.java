package com.expedia.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * Created by distinktiv on 2017-09-27.
 */
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "expedia", type = "flights")
@ToString
public class Flight {

    @Id
    private String Id;
    private String flight;
    private DateTime departure;
}
