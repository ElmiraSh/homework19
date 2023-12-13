import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.open;
public class OpenPage extends BaseTest{
    @Test
    void openPage(){
        open(baseUrl);
        $(".b-hero-title").shouldHave(text(" БЮДЖЕТНАЯ КЛИНИНГОВАЯ КОМПАНИЯ В КАЗАНИ "));
    }
}
