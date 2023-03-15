package handling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class TS29 {
    /*
  TS29: Blaze Demo automation

Summary: Header menu verification

Steps:
1. Navigate https://www.blazedemo.com/
2. Verify the header menu list

Expectation:
There must be 2 valid links
   */
    public static void main(String[] args) throws InterruptedException {

  WebDriver driver = new ChromeDriver();
  driver.get("https://www.blazedemo.com/");

        List<WebElement> headerButtons = driver.findElements(By.className("brand"));
        System.out.println(headerButtons.size());

        headerButtons.get(0).click();
        String str = driver.getCurrentUrl();
        System.out.println(str);
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        headerButtons.get(1).click();
        Thread.sleep(1000);
        String str1 = driver.getCurrentUrl();
        System.out.println(str1);
        driver.navigate().back();
    }
}
