package com.fcant.springbootexpand;

import com.fcant.springbootexpand.property.ValueProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootExpandApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootExpandApplication.class);

	public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootExpandApplication.class, args);
        LOGGER.info("@Value: {}", run.getBean(ValueProperty.class).getCheck_code());
    }

}
