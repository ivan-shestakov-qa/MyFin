import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

abstract public class BaseTest {
    public void setUp(){
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
    }
    @Before
    public void init(){
        setUp();
    }
    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
