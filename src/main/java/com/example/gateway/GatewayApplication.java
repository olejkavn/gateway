package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("path_route", r -> r.path("/get")
//						.uri("http://httpbin.org"))
//				.route("eureka_route", r -> r.path("/dashboard")
//						.filters(f -> f.rewritePath("/dashboard", "/"))
//						.uri("http://eureka:8080"))
//				.route("eureka_route_1", r -> r.path("/eureka/**")
//						.uri("http://eureka:8080"))
//				.route( "level_service_route", r -> r.path("/level-service/")
//						.uri("http://level-service:8080"))
//				//test route
//				.route("config_server_roure", r -> r.path("/config-server/**")
//						.filters(f -> f.rewritePath("/config-server", "/"))
//						.uri("http://config-server:8080"))
//				.build();
//	}
}
