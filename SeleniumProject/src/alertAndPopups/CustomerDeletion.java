package alertAndPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class CustomerDeletion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

       driver.findElement(By.name("cusid")).sendKeys("123456");

        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Thread.sleep(2000);
//        Alert confirmationAlert = driver.switchTo().alert();
//
//        System.out.println(confirmationAlert.getText());
//        confirmationAlert.accept();
//
//        Thread.sleep(2000);
//        System.out.println(confirmationAlert.getText());
//
//        confirmationAlert.accept();

    }
}