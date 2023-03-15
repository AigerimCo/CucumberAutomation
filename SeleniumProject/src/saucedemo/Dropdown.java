package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

////*[@class='product_sort_container']

        List<WebElement> items = driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("standard_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();

        WebElement dropdown = driver.findElement(By.className("product_sort_container"));
        Select sort = new Select(dropdown);

        System.out.println(sort.getFirstSelectedOption().getText());

       List<WebElement>sortOptions = sort.getOptions();

       for(WebElement option : sortOptions){
           System.out.println(option.getText());
       }
       if(sortOptions.size() == 4){
           System.out.println("PASSED");
       }else{
           System.out.println("FAILED");
       }


    }
}


