package com.expedia.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by distinktiv on 2017-09-27.
 */
@Data
@Configuration
public class ExpediaElasticsearchConfig {

    @Value("${elasticsearch.node.name}")
    private int esNodeName;

    @Value("${elasticsearch.node.path}")
    private String esDataPath;

}
