package pagesCashwise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CashwiseProject {

        public CashwiseProject() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "(//button)[1]")
        public WebElement signIn;

        @FindBy(xpath = "(//input[@name='email'])[2]")
        public WebElement emailInputBox;


        @FindBy(xpath = "//input[@name='password']")
        public WebElement passwordInputBox;

        @FindBy(xpath = "(//button)[6]")
        public WebElement signInButton;


//        @FindBy(xpath = "(//div/li)[2]")
//        public WebElement expensesButton;
//
//        @FindBy(xpath = "(//div[@class='MuiAccordion-region'])[2]//a")
//        public List<WebElement> expensesList;
//
//
//        @FindBy(xpath = "(//div/a)[5]")
//        public WebElement sellersButton;
//
//        @FindBy(xpath = "(//div/a)[6]")
//        public WebElement productAndServicesButton;
//
//        @FindBy(xpath = "(//div/a)[7]")
//        public WebElement checkButton;


        public void login(String email, String password) {
            signIn.click();
            emailInputBox.sendKeys(email);
            passwordInputBox.sendKeys(password);
            signInButton.click();
}


    }

