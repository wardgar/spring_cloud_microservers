package com.github.warger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {
  //private static final Logger logger = LoggerFactory.getLogger(ApiGatewayApplication.class);
/*  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    return builder.routes()
            .route(p -> p
                    .path("/service*//**")
                   // .filters(f -> f.addRequestHeader("Hello", "World"))
                    .uri("lb://SERVICE-FEIGN"))
            .build();
  }*/


  public static void main(String[] args) {
    SpringApplication.run(ApiGatewayApplication.class, args);
  }

}
