package com.bestdeals.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by rohitkumar on 14/08/17.
 */

@SpringBootApplication
public class BestDealsConfig {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(BestDealsConfig.class);
        springApplication.run(args);

    }

}
