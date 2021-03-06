package com.github.service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public class GitHubService {
	 
	@Path("/ctofservice")
	public class CtoFService {
		@GET
		@Produces("application/xml")
		public String convertCtoF() {
	 
			Double fahrenheit;
			Double celsius = 36.8;
			fahrenheit = ((celsius * 9) / 5) + 32;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + Fahrenheit;
			return "<ctofservice>" + "<celsius>" + Celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
		}
	}
}
