package testCases;

import baseCase.BaseTest;
import basePages.InformationPage;
import basePages.LabPage;
import basePages.LogInPage;
import basePages.YourCartPage;
import driverManagement.DriverSetup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class InformationPageTest extends BaseTest {
    LogInPage logInPage;
    LabPage labPage;
    YourCartPage yourCartPage;
    InformationPage informationPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialiseBrowser();
        logInPage=new LogInPage();
        labPage=logInPage.logIn(properties1.getProperty("username1"),properties1.getProperty("password"));
        yourCartPage=labPage.clickOnCart();
        informationPage=yourCartPage.checkoutButton();
    }

    @Test
    public void informationDetailsTest()  {
        informationPage.informationDetails();



    }

    @AfterMethod
    public void end()
    {
        DriverSetup.getDriver().close();
    }
}
