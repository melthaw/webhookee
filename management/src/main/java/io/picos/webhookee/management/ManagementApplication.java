package io.picos.webhookee.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.web.support.ErrorPageFilter;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
@Import({ManagementWebMvcConfigurer.class})
@EnableAsync
@ComponentScan({"io.picos.webhookee.management.rest.controller", "io.picos.webhookee.management.rest.support.impl"})
public class ManagementApplication extends SpringBootServletInitializer {

    @Override
    protected WebApplicationContext run(SpringApplication application) {
        application.getSources().remove(ErrorPageFilter.class);
        return super.run(application);
    }

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{ManagementApplication.class}, args);
    }

}