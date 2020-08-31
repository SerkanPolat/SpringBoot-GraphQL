package com.sp.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * {@link com.coxautodev.graphql.tools.GraphQLQueryResolver}
 *  {@link com.coxautodev.graphql.tools.GraphQLMutationResolver}
 */

@SpringBootApplication
@EnableJpaRepositories
public class GraphQLApplication {
    public static void main(String[] args){
        SpringApplication.run(GraphQLApplication.class,args);
    }
}
