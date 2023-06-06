/*
 * Author Name: Philip Meshach
 * Date: 18-01-2023
 * Praise The Lord
 */
package com.niit.ApiGateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator route(RouteLocatorBuilder locatorBuilder) {
        return locatorBuilder.routes().route(p-> p.path("/api/v1/**")
                .uri("http://localhost:8082/"))
                .route(p->p.path("/api/v2/**").uri("http://localhost:8008")).build();
    }
}
