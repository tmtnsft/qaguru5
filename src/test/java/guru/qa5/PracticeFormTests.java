package guru.qa5;

import guru.qa5.pages.components.CheckPage;
import guru.qa5.pages.RegistrationPage;
import guru.qa5.pages.components.CalendarComponent;
import guru.qa5.pages.components.ClickSubmit;
import guru.qa5.pages.components.PictureComponent;
import org.junit.jupiter.api.Test;

import static guru.qa5.TestData.*;

public class PracticeFormTests extends TestBase{

    RegistrationPage regPage = new RegistrationPage();
    CalendarComponent setCalendar = new CalendarComponent();
    PictureComponent picFunc = new PictureComponent();
    ClickSubmit submit = new ClickSubmit();
    CheckPage checkPage = new CheckPage();

    @Test
    void successTest() {
        regPage
                .openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(userEmail)
                .setGender("Female")
                .typeNumber(userNumber)
                .typeSubject("p")
                .typeSubject("co")
                .typeSubject("a")
                .setHobby("Sports")
                .setHobby("Music")
                .setHobby("Reading")
                .typeAddress(userAddress)
                .selectState("Raj")
                .selectCity("Jai");
        setCalendar.setDate("3rd", "July", "2019");
        picFunc.uploadPicture("src/test/resources/rm.jpeg");
        submit.clickSubmit();
        checkPage
                .checkResultsTable()
                .checkResults(firstName + " " + lastName)
                .checkResults(userEmail)
                .checkResults("Female")
                .checkResults(userNumber)
                .checkResults("03 July,2019")
                .checkResults("Physics, Computer Science, Maths")
                .checkResults("Sports, Music, Reading")
                .checkResults("rm.jpeg")
                .checkResults(userAddress)
                .checkResults("Rajasthan Jaipur");
    }
}
