/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

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
