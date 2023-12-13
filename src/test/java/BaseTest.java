import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import qa.guru.owner.config.ConfigForHw;

public class BaseTest {
    @BeforeAll
    static void beforeAll(){
        ConfigForHw config = ConfigFactory.create(ConfigForHw.class, System.getProperties());
        Configuration.baseUrl = "https://apa-service.ru/";
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.version();
        Configuration.remote = config.remoteUrl();
        Configuration.pageLoadStrategy = "eager";
    }
}
