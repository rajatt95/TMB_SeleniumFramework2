package com.learning.rough;

import com.github.javafaker.Faker;

public class JavaFakerAPI {
    public static void main(String[] args) {

        Faker faker = new Faker();
        for (int i = 0; i < 2; i++) {
            System.out.println("---------------------");
            System.out.println("faker.address().cityName() = " + faker.address().cityName());
            System.out.println("faker.superhero().name() = " + faker.superhero().name());
            System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
            System.out.println("faker.animal().name() = " + faker.animal().name());
            System.out.println("faker.number().randomNumber() = " + faker.number().randomNumber());
            faker.number().numberBetween(5,500);
        }

    }
}
