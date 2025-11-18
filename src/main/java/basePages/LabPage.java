package basePages;

import baseCase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LabPage extends BaseTest {
    final By addTocart=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private static final String xpathAddToCArt="//div[text()='%s']/ancestor::div[2]/child::div[2]/button[text()='Add to cart']";
    final By cartIcon=By.xpath("//a[@data-test=\"shopping-cart-link\"]");
    final By elementsXpath=By.xpath("//div[@class=\"inventory_item_name \"]");


    public void printingItemName()
    {
        List<WebElement> elements1=listOdElementLocation(elementsXpath);
        for(WebElement i:elements1)
        {
            System.out.println(i.getText());
        }

    }
    public void addCartFeature()
    {

        clickElementLocation(addTocart);

    }

    public void addCartFeature(String itemName)
    {
        String finalXpath=String.format(xpathAddToCArt,itemName);
        By add=By.xpath(finalXpath);
        clickElementLocation(add);
    }

    public YourCartPage clickOnCart()
    {
        clickElementLocation(cartIcon);
        return new YourCartPage();
    }


}
