import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class CurrensiesTests extends BaseTest{
    private static final String BASEURL = "https://myfin.by/currency/grodno";

    @Test
    public void checkCourse() throws InterruptedException {
        open(BASEURL);
        step("выбор - банк продает"
                ,()->$x("//div[@class='simple-converter-tabs__btn simple-converter-tabs__btn--grow ']").click());
        step("ввод суммы$"
                ,()->$x("//input[@id='conv_best_sell_usd']").setValue("170"));

//        Thread.sleep(5000);

    }
}
