package basePages;

import baseCase.BaseTest;
import org.openqa.selenium.By;

public class YourCartPage extends BaseTest {

    final By checkoutId=By.id("checkout");

    public InformationPage checkoutButton()
    {
        clickElementLocation(checkoutId);
        return new InformationPage();
    }


}
