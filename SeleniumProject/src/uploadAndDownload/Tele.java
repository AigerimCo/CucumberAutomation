package uploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tele {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");

        driver.findElement(By.linkText("Telecom Project")).click();
//try {
//    driver.findElement(By.xpath("///span[.=Close']")).click();
//}
// catch(Exception e){
//     System.out.println("There were no popup here");
// }
       driver.findElement(By.linkText("Add customer")).click();

        WebElement backgroundCheck = driver.findElement(By.xpath("//input[@id= 'done']/../label"));
        backgroundCheck.click();

//        WebElement addCustomer = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a"));
//        addCustomer.click();
    }
}


