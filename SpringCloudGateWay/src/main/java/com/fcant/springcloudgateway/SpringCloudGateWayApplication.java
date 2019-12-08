package com.fcant.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * SpringCloudGateWayApplication
 *
 * encoding:UTF-8
 * @author Fcant 21:50 2019/12/8
 */
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGateWayApplication.class, args);
	}

}
