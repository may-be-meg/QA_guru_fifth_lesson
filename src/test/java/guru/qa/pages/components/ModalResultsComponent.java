package guru.qa.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ModalResultsComponent {

    public ModalResultsComponent checkVisible() {
        $(".modal-header").shouldHave(text("Thanks for submitting the form"));

        return this;
    }

    public ModalResultsComponent checkResults(String key, String value) {
        $(".table-responsive table").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }
}
