import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tools.Helper;
/**
 * Created by matt on 12/06/2017.
 */
public class TestToolsQA {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Program Files//chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Go to the demo page

        driver.get("http://store.demoqa.com/");

        // Hover on the Product Category

        Helper.productCategoryHover(driver);

        // Go to the Accessories Page

        Helper.productCategoryAccessories(driver);

        // Return to the home page

        Helper.goHome(driver);

        // Go to the iMacs page

        Helper.productCategoryHover(driver);
        Helper.productCategoryiMac(driver);

        // Return to the home page

        Helper.goHome(driver);

        // Go to Checkout Page with empty cart

        Helper.goToCheckout(driver);

        Helper.getCheckoutText(driver);



    }

}
