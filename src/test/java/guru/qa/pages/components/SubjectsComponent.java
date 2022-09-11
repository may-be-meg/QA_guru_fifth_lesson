package guru.qa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class SubjectsComponent {

    public SubjectsComponent setSubject(String first, String second) {
        $("#subjectsInput").setValue(first).pressEnter();
        $("#subjectsInput").setValue(second).pressEnter();

        return this;
    }
}