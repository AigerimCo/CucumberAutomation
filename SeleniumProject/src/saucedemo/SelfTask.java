package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
/*
1. go to sauce demo app
2. login to application
3. add any product from the list
4. verify if cart items number is changing
expected: on cart icon, it must show "1"
test data:
username: standard_user
password: secret_sauce
 */
public class SelfTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons = driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();

        int expectedItemCount = 1;

        List<WebElement>addToCartButtons = driver.findElements(By.xpath("//div[@class='pricebar']/button "));
        WebElement checkCart = driver.findElement(By.className("shopping_cart_link"));
        for(WebElement addToCartButton : addToCartButtons){
            addToCartButton.click();
            Thread.sleep(300);
            if(expectedItemCount == Integer.parseInt(checkCart.getText())){
                System.out.println("Passed");
                expectedItemCount ++;
            }else{
                System.out.println("Failed");
                System.out.println("Expected " + expectedItemCount);
                System.out.println("Actual " + checkCart.getText());
            }
        }

    }
}
