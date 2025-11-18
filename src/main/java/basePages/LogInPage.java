package basePages;

import baseCase.BaseTest;
import org.openqa.selenium.By;

public class LogInPage extends BaseTest {

    final By username=By.id("user-name");
    final By passowrd=By.id("password");
    final By logInButton=By.name("login-button");


    public LabPage logIn(String user,String pass)
    {
        clickElementLocation(username).sendKeys(user);
        clickElementLocation(passowrd).sendKeys(pass);
        clickElementLocation(logInButton);
        return new LabPage();
    }





}
