package tools;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by matt on 12/06/2017.
 */
public class Helper {

    private static WebElement element = null;

    public static WebElement productCategoryHover(WebDriver driver) {

        WebElement productDropDown = driver.findElement(By.id("menu-item-33"));

        Actions action = new Actions(driver);

        action.moveToElement(productDropDown).perform();

        return element;
    }

    public static WebElement productCategoryAccessories(WebDriver driver){

        WebElement productDropDown =  driver.findElement(By.id("menu-item-34"));

        productDropDown.click();

        return element;

    }

    public static WebElement productCategoryiMac(WebDriver driver){

        WebElement productDropDown = driver.findElement(By.id("menu-item-35"));

        productDropDown.click();

        return element;

    }

    public static WebElement goHome(WebDriver driver) {

        WebElement homeButton = driver.findElement(By.id("menu-item-15"));

        homeButton.click();

        return element;


    }

    public static WebElement goToCheckout(WebDriver driver) {

        WebElement checkoutButton = driver.findElement(By.partialLinkText("Checkout"));

        checkoutButton.click();

        return element;
    }

    public static WebElement getCheckoutText(WebDriver driver){

        WebElement checkoutArea = driver.findElement(By.cssSelector("#post-29 > div"));

        String checkoutText = checkoutArea.getText();

        System.out.println(checkoutText);

        //Assert.assertTrue(checkoutText.matches("Oops, there is nothing in your cart."));
        Assert.assertTrue(checkoutText.matches("Test 1 2 3 Test."));
        return element;
    }
}

