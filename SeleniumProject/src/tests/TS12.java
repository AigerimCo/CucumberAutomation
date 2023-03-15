package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Verify added Item
Summary: Verify Add to Cart button after adding

Go to application and log in
Add any Item to the Cart
Verify 'Add to Cart' button changed
Expectation: 'Add to Cart' button should become 'REMOVE
 */
import java.util.List;

public class TS12 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

//  //div[@class='pricebar'] /button
        List<WebElement> items = driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("standard_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();

        List<WebElement> addToCartButtons= driver.findElements(By.xpath("//div[@class='pricebar'] /button"));

    for(WebElement addToCartButton: addToCartButtons){
        Thread.sleep(300);
        addToCartButton.click();
        List<WebElement> removeButtons= driver.findElements(By.xpath("//div[@class='pricebar'] /button"));
   String expected = "REMOVE";

   for(WebElement removebutton : removeButtons){
       String actualResult = removebutton.getText();
       if(actualResult.equals(expected)) {
           System.out.println("PASSED");
       }else{
           System.out.println("FAILED");
           System.out.println("expected: " + expected);
           System.out.println("Actual: " + actualResult);

       }
   }
    }
    }
    }

