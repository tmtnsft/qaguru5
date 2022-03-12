package guru.qa5;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();

    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            userAddress = faker.address().fullAddress();
}
