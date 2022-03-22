package com.springgs.consumingrestfulwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestfulWebServiceApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestfulWebServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestfulWebServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://mocki.io/v1/c57316d7-d2a2-4502-9b80-ca3fe20a89e0", Quote.class);
        assert quote != null;
        log.info(quote.toString());
    }
}
