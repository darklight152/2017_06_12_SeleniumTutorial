import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by matt on 12/06/2017.
 */
public class TestWikipedia {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Program Files//chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.wikipedia.org");

        WebElement searchBox;

        searchBox = driver.findElement(By.id("searchInput"));

        searchBox.click();

        searchBox.sendKeys("Software");

        searchBox.submit();

        driver.quit();


    }

}
