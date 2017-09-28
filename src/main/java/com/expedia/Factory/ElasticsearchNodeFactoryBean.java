package com.expedia.Factory;

import com.expedia.config.ExpediaElasticsearchConfig;
import javafx.scene.NodeBuilder;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.Node;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by distinktiv on 2017-09-27.
 */
@Component
public class ElasticsearchNodeFactoryBean implements FactoryBean<Node>{ //implements FactoryBean<Node> {

    private Node node;

    @Override
    public Node getObject() throws Exception {
        return getNode();
    }

    @Override
    public Class getObjectType() {
        return Node.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    private Node getNode() {

        Settings.Builder settingsBuilder = Settings.builder();


       /* settingsBuilder.put("node.name", ExpediaElasticsearchConfig);
        settingsBuilder.put("path.data", ElasticSearchConfig.DATA_PATH);
        settingsBuilder.put("http.enabled", false);

        Settings settings = settingsBuilder.build();

        node = NodeBuilder.nodeBuilder()
                .settings(settings)
                .clusterName(ElasticSearchConfig.CLUSTER_NAME)
                .data(true).local(true).node();
        return node;*/
    }

}