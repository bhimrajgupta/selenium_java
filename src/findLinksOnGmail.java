import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class findLinksOnGmail {

    @Test
    public void testFindLinks(){
        //Selenium 3.x needs geckodriver to interact with firefox
        System.setProperty("webdriver.gecko.driver",
                "C:\\ZBhims\\SCodes\\Up\\selenium_java\\libraries\\geckodriver.exe");

        //Initialize the browser driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://accounts.google.com/");

        //Get all the links displayed on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        //Verify there are 4 links displayed on the page
        assertEquals(4, links.size());

        //Print target for each links
        for (WebElement link : links){
            System.out.println(link.getAttribute("href"));
        }

        //Browser close
        driver.quit();
    }

}