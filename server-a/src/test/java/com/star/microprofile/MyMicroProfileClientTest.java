package com.star.microprofile;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class MyMicroProfileClientTest {
    @Test
    public void testGreet() throws URISyntaxException {
        URI uri = new URI("http://localhost:7071");
        MyMicroProfileClient myMicroProfileClient =
            RestClientBuilder.newBuilder().baseUri(uri).build(MyMicroProfileClient.class);
        String result = myMicroProfileClient.shutdown();
        System.out.println(result);

    }
}
