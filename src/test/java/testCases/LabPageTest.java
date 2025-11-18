package testCases;

import baseCase.BaseTest;
import basePages.LabPage;
import basePages.LogInPage;
import driverManagement.DriverSetup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LabPageTest extends BaseTest {
    LogInPage logInPage;
    LabPage labPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialiseBrowser();
        logInPage=new LogInPage();
        labPage=logInPage.logIn(properties1.getProperty("username1"),properties1.getProperty("password"));
    }

    @Test
    public void addCartFeatureTest() {
        labPage.addCartFeature("sauce-labs-bolt-t-shirt");
        labPage.clickOnCart();


    }

    @AfterMethod
    public void end()
    {
        DriverSetup.getDriver().close();
    }



}
