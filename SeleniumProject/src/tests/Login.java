package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        //       WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        //       System.out.println(loginButton.getText());


        WebElement users = driver.findElement(By.className("login_credentials"));
        String usersText = users.getText();

        int startIndex = usersText.indexOf("problem");
        String target = usersText.substring(startIndex,startIndex+12);
        System.out.println("Here: " + target);

    }
}
