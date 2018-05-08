package com.jwt.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/hello")
public class HelloWorldService {
	// GET method returns a string
	@GET
	@Path("/text")
    public String sayHello() {
        return "Hello World";
    }
	
	// GET method returns a json-like string
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/test")
	public String sayHelloTest() {
        return "{\"results\": \"Hello World\"}";
    }
	
	// GET method returns json using Jersey's jackson implementation (requires dependency in pom.xml and init-param in web.xml) automatically with @produces annotation
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting getGreetingJSON() {
		Greeting hello = new Greeting();
		return hello;
	}
	
	// GET method returns json with a custom greeting using path param
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting getGreetingName(@PathParam("name") String name) {
		Greeting hello = new Greeting(name);
		return hello;
	}
	
	// POST method accepts user json object and automatically converts to a java object (Greeting) using jackson with the @consumes annotation
	@POST
	@Path("/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createGreeting(Greeting userGreeting) {
		String result = "Greeting created " + userGreeting;
		System.out.println("Greeting contains results: " + userGreeting.getResults());
		return Response.status(201).entity(result).build();
	}
}
