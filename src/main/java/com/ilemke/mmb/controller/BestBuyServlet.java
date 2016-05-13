package com.ilemke.mmb.controller;


import org.glassfish.jersey.jsonp.JsonProcessingFeature;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlList;
import java.io.IOException;
import java.util.Arrays;

import static javax.ws.rs.core.MediaType.APPLICATION_XML;

/**
 * Created by Isaac on 5/12/2016.
 */
public class BestBuyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Private API key
        String apiKey = "rw6kcy3h9tc66gtnnqvrh7vz";

        // SKU example
        String query = "9999260600050007";
        String url = "http://api.remix.bestbuy.com/v1/products(sku=" +
                query + ")?apiKey=" + apiKey;
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.register(JsonProcessingFeature.class).target(url);

        JsonArray jsonArray = webTarget.request(APPLICATION_XML).get(JsonArray.class);

        for(JsonObject jsonObject : jsonArray.getValuesAs(JsonObject.class)) {
            // Save json data from best buy server

        }
    }
}
