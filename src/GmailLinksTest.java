import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GmailLinksTest {

    @Test
    public void testFindLinks(){
        //Initialize the browser driver
        WebDriver driver = new FirefoxDriver();
        driver.get("www.gmail.com");
        //Get all the links displayed on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //Verify there are 4 links displayed on the page
        assertEquals(4, links.size());
    }

}