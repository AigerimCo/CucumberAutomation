package handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS28new {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");
        WebElement destinationOfTheWeekLink = driver.findElement(By.partialLinkText("The Beach"));

        destinationOfTheWeekLink.click();
        WebElement title = driver.findElement(By.xpath("(//div[@class='container'])[2]"));
        String destinationText = title.getText();
        int start = destinationText.indexOf(":");
        int end = destinationText.indexOf("!");
        String destination = destinationText.substring(start+1, end);
        System.out.println(destination);

        if (destination.trim().equals("Hawaii")){
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }

    }

}
/*
package assignments; #29

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HeaderVerification {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");

        List<WebElement> headerLinks = driver.findElements(By.xpath("(//div[@class='container'])[1]/a"));

        int count = 0;
        for (WebElement link: headerLinks){
            String href = link.getAttribute("href");
            if (href != null){
                count++;
            }
        }

        if (count == 2){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        driver.quit();
    }
}
 */


/*
package assignments; #30

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDefault {

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

        if (fromDefault.equals("Paris")){
            System.out.println("Departure Default PASSED");
        }else{
            System.out.println("Departure Default FAILED");
        }

        if (toDefault.equals("Buenos Aires")){
            System.out.println("Destination Default PASSED");
        }else{
            System.out.println("Destination Default FAILED");
        }
    }
}
 */

/*
package assignments; #31

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FlightResults {

    public static void main(String[] args) throws InterruptedException {

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

        List<WebElement> resultRows = driver.findElements(By.xpath("//table/tbody/tr"));

        if (resultRows.size() == 5){
            System.out.println("Number of Result PASSED");
        }
        else{
            System.out.println("Number of Results FAILED");
        }

        List<WebElement> virginAirlines = driver.findElements(By.xpath("//td[.='Virgin America']"));

        if (virginAirlines.size() == 2){
            System.out.println("Virgin America flight PASSED");
        }
        else {
            System.out.println("Virgin America flight FAILED");
        }




    }
}
 */

/*
#32


 */