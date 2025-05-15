import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://makbush.ru/");
        $("[id=title-inline-search-input]").setValue("Кофе").pressEnter();
        $("[id=pagetitle]").shouldHave(text("Каталог"));
    }
}
