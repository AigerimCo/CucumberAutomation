package handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class TS32SocialMedia {

    /*
    TS32: Sauce Demo social media button
Summary: Sauce Demo social media button verification

Steps:
1. Navigate to https://www.saucedemo.com/
2. Login to software using standard user
3. Locate Twitter, Facebook and LinkedIn buttons
4. Click on each of them and verify that it lands on correct page

Expectation:
Each button should take to right page
Twitter button should take to twitter.com
Facebook button should take to facebook.com
LinkedIn should take linkedin.com
     */


        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://saucedemo.com");
            List<WebElement> loginButtons = driver.findElements(By.tagName("input"));
            loginButtons.get(0).sendKeys("standard_user");
            loginButtons.get(1).sendKeys("secret_sauce");
            loginButtons.get(2).click();

            WebElement twitter = driver.findElement(By.linkText("Twitter"));
            WebElement facebook = driver.findElement(By.linkText("Facebook"));
            WebElement linkedIn = driver.findElement(By.linkText("LinkedIn"));

            twitter.click();
            String mainPageID = driver.getWindowHandle();

            Set<String> handles = driver.getWindowHandles();
            for (String id : handles) {
                if (!id.equals(mainPageID)) {
                    driver.switchTo().window(id);
                    break;
                }
            }

            String url = driver.getCurrentUrl();
            if (url.contains("twitter.com")) {
                System.out.println("Twitter button PASSED");
            } else {
                System.out.println("Twitter button FAILED");
            }
            driver.close();
            driver.switchTo().window(mainPageID);

            System.out.println(driver.getTitle());


            facebook.click();

            Set<String> handles2 = driver.getWindowHandles();
            for (String id : handles2) {
                if (!id.equals(mainPageID)) {
                    driver.switchTo().window(id);
                    break;
                }
            }

            String facebookURL = driver.getCurrentUrl();
            if (facebookURL.contains("facebook.com")) {
                System.out.println("Facebook button PASSED");
            } else {
                System.out.println("Facebook button FAILED");
            }
            driver.close();
            driver.switchTo().window(mainPageID);

            linkedIn.click();

            Set<String> handles3 = driver.getWindowHandles();
            for (String id : handles3) {
                if (!id.equals(mainPageID)) {
                    driver.switchTo().window(id);
                    break;
                }
            }

            String linkedInURL = driver.getCurrentUrl();
            if (linkedInURL.contains("linkedin.com")) {
                System.out.println("LinkedIn button PASSED");
            } else {
                System.out.println("LinkedIn button FAILED");
            }
            driver.close();
            driver.switchTo().window(mainPageID);
            driver.quit();
        }
    }
