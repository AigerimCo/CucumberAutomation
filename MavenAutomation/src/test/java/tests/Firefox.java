package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();    // ==> just in case if not gonna take to firefox
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

    }
}
