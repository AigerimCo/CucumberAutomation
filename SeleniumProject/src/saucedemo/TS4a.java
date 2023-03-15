package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
/*
LoginTS4: Sauce Demo negative login test
Summary: Testing with a empty username and valid password
1. Go to "www.saucedemo.com"
2. Leave username empty.
3. Enter valid password
4.Click
Expected: Error Message: "Epic sadface:
Username is required"
 */
public class TS4a {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        WebElement message = driver.findElement(By.tagName("h3"));
        String actual = message.getText();
        String expected = "Epic sadface: Username is required";
        if(actual.trim().equals(expected)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println(actual);
            System.out.println(expected);
        }

    }
}
