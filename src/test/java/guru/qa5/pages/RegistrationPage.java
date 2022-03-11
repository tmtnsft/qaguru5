package guru.qa5.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            genderFemale = $("[for='gender-radio-2']"),
            genderMale = $("[for='gender-radio-1']"),
            genderOther = $("[for='gender-radio-3']"),
            phoneNum = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            doSports = $("[for='hobbies-checkbox-1']"),
            doReading = $("[for='hobbies-checkbox-2']"),
            doMusic = $("[for='hobbies-checkbox-3']"),
            currAddress = $("#currentAddress"),
            stateSelect = $("#react-select-3-input"),
            citySelect = $("#react-select-4-input");
      //      regResults = $(".table-responsive");

    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationPage typeFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public RegistrationPage typeEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        if (value == "Female") {
            genderFemale.click();
        } else if (value == "Male") {
            genderMale.click();
        } else if (value == "Other") {
            genderOther.click();
        }
        return this;
    }

    public RegistrationPage typeNumber(String value) {
        phoneNum.setValue(value);
        return this;
    }

    public RegistrationPage typeSubject(String value) {
        subjectInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String value) {
        if (value == "Sports") {
            doSports.click();
        } else if (value == "Reading") {
            doReading.click();
        } else if (value == "Music") {
            doMusic.click();
        }
        return this;
    }

    public RegistrationPage typeAddress (String value) {
        currAddress.setValue(value);
        return this;
    }

    public RegistrationPage selectState (String value) {
        stateSelect.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage selectCity (String value) {
        citySelect.setValue(value).pressEnter();
        return this;
    }
}
