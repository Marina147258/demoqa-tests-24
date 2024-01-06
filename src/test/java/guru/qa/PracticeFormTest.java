package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
            }
    @Test
    void fillPracticeForm() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#userfirstName").setValue("Marina");
        $("#userlastName").setValue("Ivanova");
        $("#userEmail").setValue("123@mail.ru");
        $("#gender").setValue("Female");
        $("#userNumber").setValue("1112223334");
        $(byId("dateOfBirth")).click();
        $("#subjectsInput").setValue("Hundi");
        $("#hobbiesWrapper").setValue("Sport");
        $("#uploadPicture").uploadFromClasspath("cat.jpeg");
        $("#currentAddress").setValue("123000, Russia, Moscow, Tsvetnoi 1");
        $("#stateCity-wrapper").setValue("NCR").click();
        $("#stateCity-wrapper").setValue("Delhi").click();
        $("#submit").click();
    }
}
