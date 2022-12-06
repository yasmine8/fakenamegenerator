package com.yasmine.fakenamegenerator;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Controller {
    @GetMapping("/")
    public String index() {
        return faker();
    }

    public String faker(){
        Faker faker = new Faker(new Locale("fr"));

        String a1 = faker.address().streetAddressNumber(); // Miss Samanta Schmidt
        String a2 = faker.address().streetName(); // Emory
        String a3 = faker.address().secondaryAddress();
        String email = faker.internet().emailAddress();// Barton

        return faker.address().streetAddress()+" "+a3;
    }
}
