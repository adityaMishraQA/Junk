package baseCase;

import driverManagement.DriverSetup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.List;
import java.util.Properties;

public class BaseTest {

    public static Properties properties=new Properties();
    public static InputStream inputStream;
    public static InputStream inputStream1;
    public static Workbook workbook;
    public static InputStream inputStream2;
    public static Properties properties1=new Properties();


    static {
        try {
            inputStream2 = new FileInputStream(new File("C:\\Users\\91902\\IdeaProjects\\Framework\\src\\test\\java\\testData\\data.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    static {
        try {
            inputStream = new FileInputStream(new File("C:\\Users\\91902\\IdeaProjects\\Framework\\src\\main\\java\\config\\config.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            inputStream1 = new FileInputStream(new File("C:\\Users\\91902\\IdeaProjects\\Framework\\src\\test\\java\\testData\\testData.xlsx"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialiseBrowser() throws IOException {
        properties.load(inputStream);
        properties1.load(inputStream2);

        if (properties.getProperty("browser").equalsIgnoreCase("Chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--disable-features=PasswordLeakDetection");
            DriverSetup.setDriverThreadLocal(new ChromeDriver(options));

        }
        else if (properties.getProperty("browser").equalsIgnoreCase("Edge")) {
            WebDriverManager.firefoxdriver().setup();
            DriverSetup.setDriverThreadLocal(new FirefoxDriver());

        }

        DriverSetup.getDriver().manage().window().maximize();
        DriverSetup.getDriver().get(properties.getProperty("test_url"));

    }

    public WebElement clickElementLocation(By by)
    {
        WebElement element=DriverSetup.getDriver().findElement(by);
        element.click();
        return element;

    }

    public List<WebElement> listOdElementLocation(By by)
    {
        List<WebElement> elements=DriverSetup.getDriver().findElements(by);
        return elements;
    }










}
