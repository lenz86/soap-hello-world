package com.lenz.soaphelloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * "Hello" SOAP WebService.
 * Go to http://localhost:8080/ to get descriptions for our Hello-method
 * Go to http://localhost:8080/Hello?wsdl to get .wsdl file
 */

@WebService(serviceName = "Hello")
public class HelloWebService {

    @WebMethod(operationName = "hello")
    public String hello(String name) {
        return "Hello " + name;
    }
}
