package cashwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

/*
TS45. Cashwise Login
Summary: Verification of Login
1. Navigate to Cashwise home page
2. Login with valid email and password
3. Verify that app lets you log in

Expectation: Cashwise application should let you log into dashboard
 */
public class CashwiseLogin {

    @Test
    public void loginSuccessfully() throws InterruptedException {
        Driver.getDriver().get("https://cashwise.us");
        Driver.getDriver().findElement(By.xpath("(//button)[1]")).click();
        WebElement emailBox = Driver.getDriver().findElement(By.xpath("(//input[@name='email'])[2]"));
        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("(//button[.='Sign in'])[2]"));

        emailBox.sendKeys("antonio.feil@gmail.com");
        passwordBox.sendKeys("Tester");
        loginButton.click();
        Thread.sleep(2000);

        String expectedURL = "https://cashwise.us/dashboard/infographics";

       Assertions.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl(), "Login to Cashwise failed");

    }
}