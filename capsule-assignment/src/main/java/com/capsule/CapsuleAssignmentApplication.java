package com.capsule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import co.elastic.clients.elasticsearch.ml.FilterType;

@SpringBootApplication
public class CapsuleAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapsuleAssignmentApplication.class, args);
	}

}
