package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Summary verification

1. go to www.saucedemo.com
2. get title
3. verify id

Expected: Swag Labs
Actual:

 */
public class Title {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        String actualTitle = driver.getTitle();
        String expectedTitle="Swag Labs";

        if(actualTitle.trim().equals(expectedTitle)){
            System.out.println("PASSED");

        }else{
            System.out.println("FAILED");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual: " + actualTitle);
        }

    }
}
