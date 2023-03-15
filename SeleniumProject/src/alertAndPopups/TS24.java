package alertAndPopups;

/*
TS24: Orange HR login
Summary: Forgot password verification

Steps:
1. Navigate to https://opensource-demo.orangehrmlive.com
2. Click on Forgot your password link
3. Enter any usernam (test data)
4. Click Reset Password
5. Verify successful link sent with message "Reset Password link sent successfully"

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS24 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        // //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p

        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
        forgotPassword.click();
    }

    }
