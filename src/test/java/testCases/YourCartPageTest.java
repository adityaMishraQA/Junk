package testCases;

import baseCase.BaseTest;
import basePages.LabPage;
import basePages.LogInPage;
import basePages.YourCartPage;
import driverManagement.DriverSetup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class YourCartPageTest extends BaseTest {
    LogInPage logInPage;
    LabPage labPage;
    YourCartPage yourCartPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialiseBrowser();
        logInPage=new LogInPage();
        labPage=logInPage.logIn(properties1.getProperty("username1"),properties1.getProperty("password"));
        yourCartPage=labPage.clickOnCart();
    }

    @Test
    public void checkoutButtonTest() {
        yourCartPage.checkoutButton();
    }

    @AfterMethod
    public void end()
    {
        DriverSetup.getDriver().close();
    }
}
