package alertAndPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
1. Navigate to https://opensource-demo.orangehrmlive.com
2. Enter username 'Admin'
3. Enter password 'admin123'
4. Click Login
5. Verify successful login

 */
public class TS25 {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

       WebElement username = driver.findElement(By.name("username"));
       username.sendKeys("Admin");

       WebElement password = driver.findElement(By.name("password"));
       password.sendKeys("admin123");

       WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
       loginButton.click();



    }
}