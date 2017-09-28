package com.expedia.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;

/**
 * Created by distinktiv on 2017-09-27.
 */
@Configuration
@EnableElasticsearchRepositories
public class ExpediaElasticsearchConfig {
/*

    @Value("${elasticsearch.port}")
    private int elasticPort;

    @Value("${elasticsearch.host}")
    private String elasticHost;

    @Value("${elasticsearch.clustername}")
    private String elasticClusterName;

    @Bean
    public Client client() throws Exception{

        Settings elasticSettings = Settings.settingsBuilder()
                .put("cluster.name", elasticClusterName)
                .build();

        return TransportClient.builder()
                .settings(elasticSettings)
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName(elasticHost), elasticPort));
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchTemplate(client());
    }*/
}
