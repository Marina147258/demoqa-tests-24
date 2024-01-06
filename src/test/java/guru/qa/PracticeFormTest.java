package guru.qa;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;
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
        $("#subjectsWrapper").setValue("a");
        $("#subjectsWrapper").$(byText("Arts")).click();
        $("#hobbiesWrapper").$(byText("Sport")).click();
        $("#uploadPicture").uploadFromClasspath("cat");
        $("uploadButton").click();
        $("#currentAddress").setValue("123000, Russia, Moscow, Tsvetnoi 1");
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#stateCity-wrapper").setValue("Delhi").click();
        $("#submit").click();
    }
}
