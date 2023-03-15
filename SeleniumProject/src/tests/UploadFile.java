package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");

       WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
       chooseFileButton.sendKeys("C:\\Users\\User\\Desktop\\IMG_9535.jpg");

        driver.findElement(By.id("file-submit")).click();

       WebElement message = driver.findElement(By.tagName("h3"));
       String expected = "File Uploaded!";
//
//
//        if (message.getText().equals(expected)) {
//            System.out.println("PASSED");
//        } else {
//            System.out.println("FAILED");
//            System.out.println(expected);
//            System.out.println(message.getText());
//        }

    }
}