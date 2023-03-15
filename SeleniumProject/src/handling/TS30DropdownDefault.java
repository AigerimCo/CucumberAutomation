package handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
TS30: Blaze Demo Automation
Summary: Verify default flights cities

Steps:
1. Navigate to https://www.blazedemo.com/
2. Verify the default values for departure and destination

Expectation:
Departure city by default must be Paris
Destinatiion city by default must be Buenos Aires
 */
public class TS30DropdownDefault {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");

        WebElement from = driver.findElement(By.name("fromPort"));
        WebElement to = driver.findElement(By.name("toPort"));

        Select fromDropdown = new Select(from);
        Select toDropdown = new Select(to);

        String fromDefault = fromDropdown.getFirstSelectedOption().getText();
        String toDefault = toDropdown.getFirstSelectedOption().getText();

        System.out.println(fromDefault);
        System.out.println(toDefault);

        if(fromDefault.equals("Paris")){
            System.out.println("Departure default PASSED");
        }else{
            System.out.println("Departure default FAILED");
        }
        if(toDefault.equals("Buenos Aires")){
            System.out.println("Destination Default PASSED");
        }else{
            System.out.println("Destination Default FAILED");
        }

    }
}
