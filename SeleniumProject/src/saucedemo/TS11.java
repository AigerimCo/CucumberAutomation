package saucedemo;
/*
TS11: Verify shopping cart add item amount
Summary: Verify adding the items to cart is working
1. Go to Sauce Demo app
2. Login to Application
3. Add any product from the list
4. Verify if cart items number is changing
Expected: On Cart icon, it must show "1"
Test data:
username: standard_user
password: secret_sauce
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS11 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons = driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys();
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();

        WebElement addBackpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addBackpack.click();
        Thread.sleep(2000);
        WebElement numberOfItems = driver.findElement(By.className("shopping_cart_badge"));
        System.out.println(numberOfItems.getText());

        String excepted = "1";
        String actual = numberOfItems.getText();
        if (actual.equals(excepted)) {
            System.out.println("Number of items in the cart changed");
        } else {
            System.out.println("Number of items not changed");
        }


        // Thread.sleep(2000);
        //WebElement addTShirt= driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        //addTShirt.click();
        //System.out.println(numberOfItems.getText());
    }
}