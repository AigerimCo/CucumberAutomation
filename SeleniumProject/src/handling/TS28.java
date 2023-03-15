package handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS28 {
    /*
    TS28: Blaze Demo automation

Summary: Destination of the Week verification

Steps:
1. Naviagate to https://www.blazedemo.com/
2. Click on the Destination of the week link
3. Verify the Destination

Expectation:
Hawaii
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");


        WebElement destination = driver.findElement(By.xpath("/html/body/div[2]/div/p[2]/a"));
        destination.click();

        String expected = "Destination of the week: Hawaii !";
        WebElement actual = driver.findElement(By.xpath("/html/body/div[2]"));

        System.out.println(actual.getText());

        if(actual.getText().equals(expected)){
            System.out.println("Hawaii");
        }else{
            System.out.println("another place");
            System.out.println(actual.getText());
        }
    }
}




