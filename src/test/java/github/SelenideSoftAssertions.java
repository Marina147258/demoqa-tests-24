package github;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertions {
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.holdBrowserOpen = true;
    }
    @Test
        void shouldFindSelenideRepositoryAtTheTop() {
        //открываем страницу Selenide
        open("/selenide/selenide");
        // открываем Wiki
        $("#Wiki").click();
        //проверяем раздел Soft assertions
        $("#wiki-pages-box").$(byText("Soft assertions")).click();
        //проверка кода для JUnit5
        $("wiki-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}"));
    }
}