package guru.qa5;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import guru.qa5.pages.CheckPage;
import guru.qa5.pages.RegistrationPage;
import guru.qa5.pages.components.CalendarComponent;
import guru.qa5.pages.components.ClickSubmit;
import guru.qa5.pages.components.PictureComponent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

    RegistrationPage regPage = new RegistrationPage();
    CalendarComponent setCalendar = new CalendarComponent();
    PictureComponent picFunc = new PictureComponent();
    ClickSubmit submit = new ClickSubmit();
    CheckPage checkPage = new CheckPage();

    @BeforeAll
    static void BrowserSize() {
        Configuration.browserSize = "1920x3072";
    }

    @Test
    void successTest() {
        regPage
                .openPage()
                .typeFirstName("Daria")
                .typeLastName("E")
                .typeEmail("td@mail.com")
                .setGender("Female")
                .typeNumber("9113214457")
                .typeSubject("p")
                .typeSubject("co")
                .typeSubject("a")
                .setHobby("Sports")
                .setHobby("Music")
                .setHobby("Reading")
                .typeAddress("Saint-Petersburg")
                .selectState("Raj")
                .selectCity("Jai");
        setCalendar.setDate("3rd", "July", "2019");
        picFunc.uploadPicture("src/test/resources/rm.jpeg");
        submit.clickSubmit();
        checkPage
                .checkResultsTable()
                .checkResults("Daria E")
                .checkResults("td@mail.com")
                .checkResults("Female")
                .checkResults("9113214457")
                .checkResults("03 July,2019")
                .checkResults("Physics, Computer Science, Maths")
                .checkResults("Sports, Music, Reading")
                .checkResults("rm.jpeg")
                .checkResults("Rajasthan Jaipur");
    }
}
