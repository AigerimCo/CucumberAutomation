package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

/*
TS: Iframe Hover over
Steps:
1. Navigate to https://courses.letskodeit.com/practice
2. Scroll down 0, 500px
3. Switch into frame
4. Locate all the links inside the frame
- How to locate all links on page?
- tag name "a", xpath ("//a")
5. Hover over on each link pausing 0.5 seconds
 */
public class FrameHover {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/User/Desktop/newframe.html");

        driver.switchTo().frame("test");

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,800).perform();

        driver.switchTo().frame("courses-iframe");

        List<WebElement>links = driver.findElements(By.tagName("a"));

        Actions actions1 = new Actions(driver);
        for(WebElement link: links){
            actions1.moveToElement(link).perform();
            Thread.sleep(500);
        }

    }
}
