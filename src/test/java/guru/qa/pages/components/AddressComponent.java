package guru.qa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class AddressComponent {

    public AddressComponent setAdress(String currentAddress) {
        $("#currentAddress").setValue(currentAddress);

        return this;
    }
}
