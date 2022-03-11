package guru.qa5.pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class PictureComponent {
    public void uploadPicture(String value) {
        File file = new File (value);
        $("#uploadPicture").uploadFile(file);
    }
}
