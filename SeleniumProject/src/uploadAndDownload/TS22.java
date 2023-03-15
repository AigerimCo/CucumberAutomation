package uploadAndDownload;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TS22: Tariff assignment to Customer

Summary: Assigning the tariff to customer
Steps:
1. Navigate to https://demo.guru99.com/
2. Click on Telecom Project
3. Click on Add Tariff Plan to Customer
4. Enter the Customer ID and click next
5. Select the first approved Tariff Plan
6. Click Add Tariff Plan to Customer
7. Verify successful assignment by message
'Congratulation Tariff Plan assigned'
 */
public class TS22 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");

        WebElement telecom = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a"));
        telecom.click();

        WebElement addCustomer = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a"));
        addCustomer.click();

//        WebElement advertisement = driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/svg"));
//        addCustomer.click();

        WebElement customerID = driver.findElement(By.id("customer_id"));
        customerID.sendKeys("123456789");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        WebElement addTariffPlan = driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a"));
        addTariffPlan.click();



    }
    }
