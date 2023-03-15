package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
TS33: Flight selection verification

Steps:
1. Navigate to https://www.blazedemo.com/reserve.php
2. Locate the buttons for each flight result and click each
4. verify each 'Choose this flight' button is working

Expected:
Every time you click on 'Choose this flight' button
it should take you to 'purchase page'
 */
public class FlightButtonTS33 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/reserve.php");

        List<WebElement> buttons = driver.findElements(By.xpath("//table/tbody/tr/td/input"));
        int count = 1;
        for(WebElement button : buttons){
            button.click();
            if(driver.getCurrentUrl().contains("purchase.php")){
                System.out.println("PASSED");
            }
            else{
                System.out.println("FAILED");
                System.out.println(driver.getCurrentUrl());
            }
            driver.navigate().back();
            count++;
        }
    }
}
