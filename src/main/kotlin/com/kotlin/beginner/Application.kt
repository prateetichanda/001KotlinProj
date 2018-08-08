package com.kotlin.beginner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.context.annotation.Bean
import org.springframework.web.filter.CorsFilter
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.cors.CorsConfiguration
import java.util.Collections
import java.util.Arrays
import org.springframework.http.HttpMethod
import java.util.stream.Collectors

@EnableAutoConfiguration
@SpringBootApplication
@CrossOrigin
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
	println("Hello to Kotlin")
}

/*@Bean
	public fun corsfilter():CorsFilter
{
	 var source: UrlBasedCorsConfigurationSource = UrlBasedCorsConfigurationSource();
        var config: CorsConfiguration = CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Collections.singletonList("*"));
        config.setAllowedHeaders(Collections.singletonList("*"));
        config.setAllowedMethods(Arrays.stream(HttpMethod.values().map(HttpMethod::name).collect(Collectors.toList())));
        source.registerCorsConfiguration("/**", config);
        return CorsFilter(source);
}*/