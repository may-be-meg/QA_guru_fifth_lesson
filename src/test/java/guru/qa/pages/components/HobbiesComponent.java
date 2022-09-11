package guru.qa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HobbiesComponent {

    public HobbiesComponent setHobby(String firstHobby, String secondHobby) {
        $(byText(firstHobby)).click();
        $(byText(secondHobby)).click();

        return this;
    }
}
