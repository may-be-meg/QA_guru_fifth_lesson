package guru.qa.pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.*;

public class WebFormPage {

    //Elements
    private CalendarComponent calendarComponent = new CalendarComponent();
    private SubjectsComponent subjectsComponent = new SubjectsComponent();
    private HobbiesComponent hobbiesComponent = new HobbiesComponent();
    private AddressComponent addressComponent = new AddressComponent();
    private StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();
    private UploadPictureComponent uploadPictureComponent = new UploadPictureComponent();
    private ModalResultsComponent modalResultsComponent = new ModalResultsComponent();

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userGender = $("Female"),
            userNumberInput = $("#userNumber");


    //Actions
    public WebFormPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public WebFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public WebFormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public WebFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public WebFormPage setGender(String value) {
        $(byText(value)).click();

        return this;
    }

    public WebFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public WebFormPage setDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public WebFormPage setSubject(String first, String second) {
        subjectsComponent.setSubject(first, second);

        return this;
    }

    public WebFormPage setHobby(String firstHobby, String secondHobby) {
        hobbiesComponent.setHobby(firstHobby, secondHobby);

        return this;
    }

    public WebFormPage setAddress(String currentAddress) {
        addressComponent.setAdress(currentAddress);

        return this;
    }

    public WebFormPage setStateAndCity(String state, String city) {
        stateAndCityComponent.setStateAndCity(state, city);

        return this;
    }

    public WebFormPage uploadPicture(String picture) {
        uploadPictureComponent.uploadPicture(picture);

        return this;
    }

    public WebFormPage clickSubmit() {
        $("#submit").click();

        return this;
    }

    public WebFormPage checkVisible() {
        modalResultsComponent.checkVisible();

        return this;
    }

    public WebFormPage checkResults(String key, String value) {
        modalResultsComponent.checkResults(key, value);

        return this;
    }

}
