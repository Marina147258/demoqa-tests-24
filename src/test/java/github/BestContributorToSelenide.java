package github;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BestContributorToSelenide {
    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(byText("Contributors"));

    }
}
