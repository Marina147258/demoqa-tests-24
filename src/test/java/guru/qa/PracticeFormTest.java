package guru.qa;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
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
        $("#firstName").setValue("Marina");
        $("#lastName").setValue("Ivanova");
        $("#userEmail").setValue("123@mail.ru");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("1112223334");
        $(byId("dateOfBirth")).click();
        $("#react-datepicker__month-select").$(byText("September")).click();
        $("#react-datepicker__year-select").$(byText("1990")).click();
        $("#react-datepicker__data-select").$(byText("17")).click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#hobbiesWrapper").$(byText("Sport")).click();
        $("#uploadPicture").uploadFromClasspath("cat");
        $("uploadButton").click();
        $("#currentAddress").setValue("123000, Russia, Moscow, Tsvetnoi 1");
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#stateCity-wrapper").setValue("Delhi").click();
        $("#submit").click();

        //проверки
        $(".modal-dialog").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Marina Ivanova"));
        $(".table-responsive").shouldHave(text("123@mail.ru"));
        $(".table-responsive").shouldHave(text("Female"));
        $(".table-responsive").shouldHave(text("1112223334"));
        $(".table-responsive").shouldHave(text("15 September,1990"));
        $(".table-responsive").shouldHave(text("Arts"));
        $(".table-responsive").shouldHave(text("Sport"));
        $(".table-responsive").shouldHave(text("cat"));
        $(".table-responsive").shouldHave(text("123000, Russia, Moscow, Tsvetnoi 1"));
        $(".table-responsive").shouldHave(text("NCR"));
        $(".table-responsive").shouldHave(text("Delhi"));
    }


}
