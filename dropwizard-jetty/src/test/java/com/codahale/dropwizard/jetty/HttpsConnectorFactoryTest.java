package com.codahale.dropwizard.jetty;

import com.codahale.dropwizard.jackson.DiscoverableSubtypeResolver;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class HttpsConnectorFactoryTest {
    @Test
    public void isDiscoverable() throws Exception {
        assertThat(new DiscoverableSubtypeResolver().getDiscoveredSubtypes())
                .contains(HttpsConnectorFactory.class);
    }
}
