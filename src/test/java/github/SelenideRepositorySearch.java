package github;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        //открыть главную страницу
        open("https://github.com/");
        //ввести в поле поиска Selenide и нажать поиск
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        //указание на репозиторий
        $$("ul.repo-list li").first().$("a").click();
        //проверка
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
            }
}
