package driverManagement;

import org.openqa.selenium.WebDriver;

public final class DriverSetup {

    private DriverSetup()
    {
        // no need of object of this class
    }
    public static ThreadLocal<WebDriver> driverThreadLocal=new ThreadLocal<>();

    public static void setDriverThreadLocal(WebDriver driver)
    {
        driverThreadLocal.set(driver);
    }

    public static WebDriver getDriver()
    {
        return driverThreadLocal.get();
    }
}
