package uploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TS21: Adding customer at Telecom

Summary: Creating a new customer in Telecom software
Steps:
1. Navigate to https://demo.guru99.com/
2. Click on Telecom Project
3. Click on Add Customer
4. Fill out all fields for new customer
5. Click submit
6. Verify if new customer created
7. Print out the Customer ID in console
8. Save the Customer ID somewhere in your code

910337

 */
public class TS21 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");

        WebElement telecom = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a"));
        telecom.click();

        WebElement addCustomer = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a"));
        addCustomer.click();

        WebElement doneButton = driver.findElement(By.id("done"));
        doneButton.click();

        WebElement firstName = driver.findElement(By.id("fname"));
        firstName.sendKeys("Aigerim");

        WebElement lastName = driver.findElement(By.id("lname"));
        lastName.sendKeys("Corindan");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("aigerim@gmail.com");

        WebElement address = driver.findElement(By.id("message"));
        address.sendKeys("6322 N Richmond str, 60659,Chicago,IL");

        WebElement phoneNumber = driver.findElement(By.id("telephoneno"));
        phoneNumber.sendKeys("3125092625");

        WebElement submit = driver.findElement(By.name("submit"));


    }
}
