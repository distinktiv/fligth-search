package com.expedia.Factory;

import org.springframework.stereotype.Component;

/**
 * Created by distinktiv on 2017-09-27.
 */
@Component
public class ElasticsearchNodeFactoryBean { //implements FactoryBean<Node> {

   /* private Node node;

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

        ImmutableSettings.Builder settingsBuilder =
                ImmutableSettings.settingsBuilder();

        settingsBuilder.put("node.name", ElasticSearchConfig.NODE_NAME);
        settingsBuilder.put("path.data", ElasticSearchConfig.DATA_PATH);
        settingsBuilder.put("http.enabled", false);

        Settings settings = settingsBuilder.build();

        node = NodeBuilder.nodeBuilder()
                .settings(settings)
                .clusterName(ElasticSearchConfig.CLUSTER_NAME)
                .data(true).local(true).node();
        return node;
    }
    */
}