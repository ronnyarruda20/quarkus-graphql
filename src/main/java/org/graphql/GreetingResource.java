package org.graphql;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@GraphQLApi
public class GreetingResource {

    @Query("allFilms")
    @Description("Get all Films from a galaxy far far away")
    public String hello() {
        return "Hello RESTEasy";
    }
}