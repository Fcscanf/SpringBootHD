package com.fcant.areaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * AreaServiceApplication
 * 这里用到的注解全部使用@SpringCloudApplication来替代
 * 1.@SpringBootApplication
 * 2.@EnableDiscoveryClient
 * 3.@EnableCircuitBreaker
 *
 * encoding:UTF-8
 * @author Fcant 9:28 2019/12/9
 */
@SpringCloudApplication
public class AreaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AreaServiceApplication.class, args);
	}

}
