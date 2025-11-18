package basePages;

import baseCase.BaseTest;
import org.openqa.selenium.By;

public class InformationPage extends BaseTest {
    final By firstNameId=By.id("first-name");
    final By lastNameId=By.id("last-name");
    final By zipId=By.id("postal-code");
    final By continuteButton=By.id("continue");

    public OverviewPage informationDetails()
    {
        clickElementLocation(firstNameId).sendKeys(properties1.getProperty("first_name"));
        clickElementLocation(lastNameId).sendKeys(properties1.getProperty("last_name"));
        clickElementLocation(zipId).sendKeys(properties1.getProperty("zip_code"));
        clickElementLocation(continuteButton);


        return new OverviewPage();

    }


}
