package uploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TS20: Bank account login

Summary: Bank account login - positive
Steps:
1. Navigate to https://demo.guru99.com/
2. Click on Bank Project in the menu bar
3. Use your login credentials to login to Bank Project
4. Verify that you are successfully logged in to the platform

 */
public class TS20 {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.guru99.com");

            WebElement bank = driver.findElement(By.linkText("Bank Project"));
            bank.click();

            WebElement username = driver.findElement(By.name("uid"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.name("btnLogin"));

            username.sendKeys("mngr478861");
            password.sendKeys("ahAquge");
            loginButton.click();

            System.out.println(driver.getTitle());

            System.out.println(driver.getTitle());
            String expectedTitle = "GTPL Bank Manager HomePage";

            if (driver.getTitle().equals(expectedTitle)) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED");

            }

    }
}
