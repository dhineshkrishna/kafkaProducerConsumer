package com.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafaProducerApplication.class, args);
	}

}
