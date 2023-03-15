package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/esen/Desktop/selenium resources/chromedriver");

        WebDriver chrome = new ChromeDriver();

        chrome.get("https://www.google.com/");

//        chrome.manage().window().fullscreen();
//
//        //chrome.manage().window().maximize();
//
//        chrome.navigate().to("https://amazon.com");
//        chrome.navigate().refresh();
//        chrome.navigate().back();
//        chrome.quit();

    }

}
