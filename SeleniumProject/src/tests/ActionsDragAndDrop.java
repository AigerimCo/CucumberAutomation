package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

    //1. Go to application https://the-internet.herokuapp.com/drag_and_drop
    //2. locate both web elements for source and target
    //3. create actions object from driver
    //4. call dragAndDrop method and pass source and target
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement a = driver.findElement(By.id("column-a"));
        WebElement b = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        Thread.sleep(1000);

   //     actions.dragAndDrop(a, b).perform();
  //      actions.dragAndDropBy(a, 300,90).perform();

   //     actions.clickAndHold(a).moveToElement(b).build().perform();
        actions.moveByOffset(0,0).perform();
        actions.clickAndHold(a).moveByOffset(200,60).release().build().perform();

    }
}
