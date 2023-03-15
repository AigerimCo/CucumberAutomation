package uploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*

1. Go to https://demo.guru99.com/test/drag_drop.html
2. Locate '5000'
3. Locate 'Debit side Amount'
4. Drag and drop
5. Verify 'Debit Movement 5000' and Credit Movement '0'

 */
public class DebitDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

//   (//li[@id='fourth']/a)[2])\n"
        WebElement source = driver.findElement(By.xpath("(//li[@id='fourth']/a)[2]"));

        WebElement destination = driver.findElement(By.id("amt7"));

        Actions actions = new Actions(driver);
        //       Thread.sleep(1000);

        actions.dragAndDrop(source, destination).perform();

        WebElement debitMovement = driver.findElement(By.id("t7"));
        WebElement creditMovement = driver.findElement(By.id("t8"));

        String expectedDebit = "5000";
        String expectedCredit = "0";

        if (debitMovement.getText().equals(expectedDebit)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        if (creditMovement.getText().equals(expectedCredit)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}