package basePages;

import baseCase.BaseTest;
import org.openqa.selenium.By;

public class OverviewPage extends BaseTest {
    final By finishId=By.id("finish");

    public CompletedOrderPage finalCheckout()
    {
        clickElementLocation(finishId);
        return new CompletedOrderPage();
    }
}
