package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Configuration.pageLoadStrategy;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class HW_3 {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/automation-practice-form";
        Configuration.pageLoadStrategy = "eager";
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    @Test
    void fillFormTest() {
        open("/https://demoqa.com/automation-practice-form");
        $("#userfirstName").setValue("Marina");
        $("#userlastName").setValue("Ivanova");
        $("#userEmail").setValue("123@mail.ru");
        $("#gender").setValue("Female");
        $("#userNumber").setValue("1112223334");
        $(byId("dateOfBirth")).click();
        $("#subjectsInput").setValue("Hundi");
        $("#hobbiesWrapper").setValue("Sport");
        $("[id=uploadPicture]").uploadFromClasspath("cat");
        $("#currentAddress").setValue("123000, Russia, Moscow, Tsvetnoi 1");
        $("#stateCity-wrapper").setValue("NCR").click();
        $("#stateCity-wrapper").setValue("Delhi").click();
        $("#submit").click();

    }
}
