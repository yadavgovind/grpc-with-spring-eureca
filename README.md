

## Overview

Example project to demostraing spring-boot integration with gRpc. Additonal to a gRpc client and server it has a traditional Spring MVC rest client using very similar payload. The performance of the two technologies can be compared usin the included JMeter file.

## Test URLs

Description | URL 
--- | --- 
 http://localhost:8080/test_grpc?compact=true  
 http://localhost:8080/test_grpc
 http://localhost:8080/test_rest/compact
 http://localhost:8080/test_rest
 
## How to measure performance  
 - The jmeter directory contains the jmeter test definition
 - use the compact endpoints
 - To eliminate "noise" turn off logging by commenting out the appropriate lines in application.yaml both for the server and the client 
 
