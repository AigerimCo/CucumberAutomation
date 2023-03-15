package sauceDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.Driver;
import utilities.Flow;
import utilities.Window;

/*
TASK:
1.Navigate to https://saucedemo.com/
2. Login with Standard user
3. Scroll down to bottom of the page using Utility Flow
4. Click on Twitter
5. Switch to second window using Window Utility class
6. Verify the title "Twitter";

 */
public class SauceTwitter {

    @Test
    public void twitterButton(){
        Driver.getDriver().get("https://saucedemo.com");
        Driver.getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
        Driver.getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
        Driver.getDriver().findElement(By.id("login-button")).click();
        Flow.scrollDown(800);
        Driver.getDriver().findElement(By.linkText("Twitter")).click();

        Window.switchToSecondWindow();
        Flow.wait(3000);
        String title = Driver.getDriver().getTitle();
        String expectedTitle = "Sauce Labs (@saucelabs) / Twitter";
        Assertions.assertEquals(expectedTitle, title, "Twitter title verification");
        Flow.wait(2000);

        Driver.getDriver().close();
        Window.switchToMainWindow();
        System.out.println(Driver.getDriver().getTitle());
    }


    @Test
    public void multipleWindow(){
        Driver.getDriver().get("https://saucedemo.com");
        Driver.getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
        Driver.getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
        Driver.getDriver().findElement(By.id("login-button")).click();
        Flow.scrollDown(800);
        Driver.getDriver().findElement(By.linkText("Twitter")).click();
        Driver.getDriver().findElement(By.linkText("LinkedIn")).click();
        Driver.getDriver().findElement(By.linkText("Facebook")).click();

        Flow.wait(2000);
        Window.switchToWindow("Sauce Labs | Facebook");
        System.out.println(Driver.getDriver().getCurrentUrl());

    }

}