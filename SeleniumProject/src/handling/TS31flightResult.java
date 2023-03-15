package handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
Summary: Verify the flight result
1. Navigate to https://www.blazedemmo.com/
2. Choose departure city Boston
3. Choose destination city London
4. Click find flights
5. Verify following requirements

Expected:
-There must be total of 5 results
-There must be 2 Virgin America flights
 */
public class TS31flightResult {
    public static void main(String[] args)throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");

        WebElement from = driver.findElement(By.name("fromPort"));
        WebElement to = driver.findElement(By.name("toPort"));

        Select fromDropdown = new Select(from);
        Select toDropdown = new Select(to);

        fromDropdown.selectByVisibleText("Boston");
        toDropdown.selectByVisibleText("London");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='container']/input")).click();

        List<WebElement>resultRows = driver.findElements(By.xpath("//table/tbody/tr"));

        if(resultRows.size() == 5){
            System.out.println("Number of Result PASSED");
        }
        else{
            System.out.println("Number of Results FAILED");
        }

        List<WebElement>virginAirlines=driver.findElements(By.xpath("//td[.='Virgin America']"));

        if(virginAirlines.size() == 2){
            System.out.println("Virgin America flight PASSED");
        }
        else{
            System.out.println("Virgin America flight FAILED");
        }



    }
}
