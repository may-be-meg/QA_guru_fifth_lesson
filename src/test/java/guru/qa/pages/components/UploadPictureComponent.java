package guru.qa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class UploadPictureComponent {

    public UploadPictureComponent uploadPicture(String picture) {
        $("#uploadPicture").uploadFromClasspath(picture);

        return this;
    }
}
