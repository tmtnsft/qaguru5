package guru.qa5.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckPage {
    SelenideElement
            tableResults = $("#example-modal-sizes-title-lg"),
            regResults = $(".table-responsive");

    public CheckPage checkResultsTable() {
        tableResults.shouldBe(Condition.visible);
        return this;
    }

    public CheckPage checkResults(String value) {
        regResults.shouldHave(text(value));
        return this;
    }
}

