package uploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Summary: Bank account sign up

1. Navigate to https://demo.guru99.com/
2. Enter email
3. Click submit
4. Read the User ID and Password and print them out in the console
5. After getting that credentials, save it in your IntelliJ in comment

User ID :mngr478763
Password :zequrUn
 */

public class BankProject {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com");

        WebElement emailInput = driver.findElement(By.name("emailid"));
        emailInput.sendKeys("input@gmail.com");

        driver.findElement(By.name("btnLogin")).click();

//(//td[@class ='accpage']/../td)[2]

        WebElement userID = driver.findElement(By.xpath("(//td[@class ='accpage']/../td)[2]"));
        WebElement password = driver.findElement(By.xpath("(//td[@class ='accpage']/../td)[4]"));

        System.out.println(userID.getText());
        System.out.println(password.getText());

//        mngr478801
//         EqenYve

    }

}

