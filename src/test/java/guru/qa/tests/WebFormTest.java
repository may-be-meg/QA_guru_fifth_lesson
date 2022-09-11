package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.WebFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WebFormTest {
    WebFormPage webFormPage = new WebFormPage();

    @BeforeAll
    static void configuration() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        webFormPage.openPage()
                .setFirstName("Пользователь")
                .setLastName("Тестовый")
                .setUserEmail("test@test.com")
                .setGender("Female")
                .setUserNumber("8999999999")
                .setDate("26", "September", "1993")
                .setSubject("Arts", "Social Studies")
                .setHobby("Reading", "Music")
                .setAddress("Улица Тестовая")
                .setStateAndCity("NCR", "Noida")
                .uploadPicture("Screenshot_53.png")
                .clickSubmit();

        webFormPage.checkVisible()
                .checkResults("Student Name", "Пользователь " + "Тестовый")
                .checkResults("Student Email", "test@test.com")
                .checkResults("Gender", "Female")
                .checkResults("Mobile", "8999999999")
                .checkResults("Date of Birth", "26 September,1993")
                .checkResults("Subjects", "Arts, Social Studies")
                .checkResults("Hobbies", "Reading, Music")
                .checkResults("Picture", "Screenshot_53.png")
                .checkResults("Address", "Улица Тестовая")
                .checkResults("State and City", "NCR Noida");
    }
}
