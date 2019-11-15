package asen.restswagger.configuration;


import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableElasticsearchRepositories
//@ConfigurationProperties( prefix = "es")
public class ElasticSearchConfiguration {

    private List<String> hosts = new ArrayList<>();

    @Value("${es.port}")
    private int port;

    @Value("${es.clustername}")
    private String clusterName;

    @Value("${es.xpack.ssl.key}")
    private String sslKey;

    @Value("${es.xpack.ssl.certificate_authorities}")
    String certificateAuthorities;
    @Value("${es.xpack.ssl.certificate}")
    private String certificate;

    @Value("${es.xpack.security.user}")
    private String elasticCredentials;

    @Value("${es.search-alias-name}")
    private String searchAliasName;

    public List<String> getHosts() {
        return hosts;
    }

    @Bean
    public TransportClient client() throws UnknownHostException {

        Settings elasticSearchSettings = Settings.builder().put("cluster.name", clusterName).build();
        TransportClient tc = new PreBuiltTransportClient(elasticSearchSettings);

        for (String host : hosts) {

            tc.addTransportAddress(new TransportAddress(InetAddress.getByName(host), port));
        }
        return tc;
    }

    public String getSearchAliasName() {
        return searchAliasName;
    }

    public void setSearchAliasName(String searchAliasName) {
        this.searchAliasName = searchAliasName;
    }
}
