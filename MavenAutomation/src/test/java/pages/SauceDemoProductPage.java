package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

/*
   Locate all the web elements that are needed for sort dropdown and create a method
   that selects the dropdown by visible text

   SauceDemoProductPage sdpp = new SauceDemoProductPage();
   sdpp.selectDropdown("A to Z")
    */
public class SauceDemoProductPage {

    public SauceDemoProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "product_sort_container")
    public WebElement sortDropdown;

    public void selectSortDropdown(String visibleText){
        Select sort = new Select(sortDropdown);
        sort.selectByVisibleText(visibleText);
    }
}
