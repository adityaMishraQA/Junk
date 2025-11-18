package testCases;

import baseCase.BaseTest;
import basePages.*;
import driverManagement.DriverSetup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class OverviewPageTest extends BaseTest {
    LogInPage logInPage;
    LabPage labPage;
    YourCartPage yourCartPage;
    InformationPage informationPage;
    OverviewPage overviewPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialiseBrowser();
    }

    @Test
    public void finalOverview() throws InterruptedException {
        logInPage=new LogInPage();
        labPage=logInPage.logIn(properties1.getProperty("username1"),properties1.getProperty("password"));
        labPage.printingItemName();
        labPage.addCartFeature("Sauce Labs Bolt T-Shirt");
        labPage.addCartFeature("Sauce Labs Fleece Jacket");
        yourCartPage=labPage.clickOnCart();
        informationPage=yourCartPage.checkoutButton();
        overviewPage=informationPage.informationDetails();
        overviewPage.finalCheckout();
    }

    @AfterMethod
    public void end()
    {
        DriverSetup.getDriver().close();
    }


}
