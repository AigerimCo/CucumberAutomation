package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 LoginTS4: Sauce Demo negative login test
 Summary: Testing with valid username and empty password
 1.Go to "www.saucedemo.com"
 2.Enter valid username
 3.Leave password empty
 4. Click
 Expected: Error Message: "Epic sadface: Password is required"Automation
 */

public class TS4 {
    public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.get("https://saucedemo.com");

      WebElement username = driver.findElement(By.id("user-name"));
      username.sendKeys("standard_user");


      WebElement login = driver.findElement(By.id("login-button"));
      login.click();

      WebElement message = driver.findElement(By.tagName("h3"));
      String actual = message.getText();
      String expected = "Epic sadface: Password is required";
      if(actual.trim().equals(expected)) {
          System.out.println("PASSED");
      }else{
          System.out.println("FAILED");
          System.out.println(actual);
          System.out.println(expected);
      }



    }
}
