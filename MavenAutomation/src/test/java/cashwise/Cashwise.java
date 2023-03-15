package cashwise;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cashwise {

    /*
TS40: Cashwise Login
Summary: Verifying the login functionality- negative

Steps:
1. Navigate to https://cashwise.us
2. Click on Sign In
3. Enter wrong email and password
4. Click Sign in
5. Verify 'Wrong password or email' error message

Expected:
'Wrong password or email' error message should be displayed
     */
    @Test
    public void verifyLoginNegative() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://cashwise.us");

        driver.findElement(By.xpath("(//button)[1]")).click();
        WebElement emailBox = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.xpath("(//button[.='Sign in'])[2]"));

        emailBox.sendKeys("test@cup.com");
        passwordBox.sendKeys("cupforcut");
        loginButton.click();
        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.xpath("//form/p"));
        String expectedMessage = "Wrong password or email";
        Assertions.assertEquals(expectedMessage, errorMessage.getText(), "Error message for login failed");
        driver.quit();
    }

    /*
    TS41: Cashwise Sign up
    Summary: Verifying sign up fields

    Steps:
    1. Navigate to Cashwise home page
    2. Click on Sign Up
    3. Click Continue
    4. Verify required fields and error message

    Expected:
    "Please enter a valid email address" and "Password cannot be empty!" messages should be displayed respectively

     */
    @Test
    public void signUpNegative() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://cashwise.us");
        WebElement signUpButton = driver.findElement(By.xpath("(//button)[2]"));
        signUpButton.click();
        WebElement continueButton = driver.findElement(By.xpath("//form[@id='register-form-1']/../button"));
        continueButton.click();

        Thread.sleep(1000);
        WebElement errorMessageEmail = driver.findElement(By.xpath("(//form[@id='register-form-1']//p)[1]"));
        WebElement errorMessagePassword = driver.findElement(By.xpath("(//form[@id='register-form-1']//p)[3]"));

        String expectedErrorEmail = "Please enter a valid email address";
        String expectedErrorPassword = "Password cannot be empty!";

        Assertions.assertEquals(expectedErrorEmail, errorMessageEmail.getText());
        Assertions.assertEquals(expectedErrorPassword, errorMessagePassword.getText());
        driver.quit();

    }

    /*
    TS42: Cashwise Sign up
    Summary: Verifying area of business
    Steps:
    1. Navigate to Cashwise home page
    2. Click Sign up
    3. Enter valid email and password
    4. Click continue
    5. Verify Area of Business dropdown list

    Expected:
    1. Total of 9 options should be there
    2. Verify each option text
     */
    @Test
    public void signUpDropdownVerification() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        driver.get("https://cashwise.us");

        WebElement signUpButton = driver.findElement(By.xpath("(//button)[2]"));
        signUpButton.click();

        List<WebElement> inputBoxes = driver.findElements(By.xpath("//form[@id='register-form-1']//input"));
        inputBoxes.get(0).sendKeys("random@codewise.com");
        inputBoxes.get(1).sendKeys("Tester");
        inputBoxes.get(2).sendKeys("Tester");

        WebElement continueButton = driver.findElement(By.xpath("//form[@id='register-form-1']/../button"));
        continueButton.click();

        WebElement areaOfBusiness = driver.findElement(By.id("mui-component-select-business_area_id"));
        areaOfBusiness.click();

        List<WebElement> areaOfBusinessList = driver.findElements(By.xpath("//ul/li"));

        Assertions.assertEquals(9, areaOfBusinessList.size(), "Size for Area Of Business dropdown failed");
        List<String> expectedOptions = new ArrayList<>();
        expectedOptions.add("Retail trade");
        expectedOptions.add("Realty");
        expectedOptions.add("IT, Software development");
        expectedOptions.add("Non-governmental organization");
        expectedOptions.add("Consulting");
        expectedOptions.add("Construction services, repair");
        expectedOptions.add("Cosmetology services");
        expectedOptions.add("Design services");
        expectedOptions.add("Education and training");

        for (WebElement option : areaOfBusinessList) {
            String optionText = option.getText();
            Assertions.assertTrue(expectedOptions.contains(optionText), "Failed: " + optionText);
        }

    }

    /*
    TS44: Cashwise Sign up
Summary: Successful sign up
Steps:
1. Navigate to  Cashwise home page
2. Click Sign Up
3. Enter valid email and password
4. Click Continue
5. Enter valid info and complete step 2
6. Click Sign up button
7. Verify successful sign up

Expected:
It should successfully sign up and login to dashboard url
Name of the company on top of the dashboard page should be same as Company you completed
     */
    @Test
    public void signUpSuccessfully() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://cashwise.us");
        WebElement signUpButton = driver.findElement(By.xpath("(//button)[2]"));
        signUpButton.click();

        List<WebElement> inputBoxes = driver.findElements(By.xpath("//form[@id='register-form-1']//input"));

        // Here we need to come up with dynamic emails
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        System.out.println("Email: " + email);

        inputBoxes.get(0).sendKeys(email);
        inputBoxes.get(1).sendKeys("Tester");
        inputBoxes.get(2).sendKeys("Tester");

        WebElement continueButton = driver.findElement(By.xpath("//form[@id='register-form-1']/../button"));
        continueButton.click();

        List<WebElement> signUpInfoList = driver.findElements(By.xpath("//form[@id='register-form-2']//input"));
        signUpInfoList.get(0).sendKeys(faker.name().firstName());
        signUpInfoList.get(1).sendKeys(faker.name().lastName());
        String companyName = faker.company().name();
        System.out.println("Company: " + companyName);
        signUpInfoList.get(2).sendKeys(companyName);

        WebElement areaOfBusiness = driver.findElement(By.id("mui-component-select-business_area_id"));
        areaOfBusiness.click();

        List<WebElement> areaOfBusinessList = driver.findElements(By.xpath("//ul/li"));
        Random random = new Random();
        int index = random.nextInt(areaOfBusinessList.size());
        areaOfBusinessList.get(index).click();

        signUpInfoList.get(4).sendKeys(faker.address().fullAddress());

        driver.findElement(By.id("mui-component-select-currency")).click();
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul/li"));
        int indexForCurrency = random.nextInt(currencyList.size());
        currencyList.get(indexForCurrency).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button)[5]")).click();

        Thread.sleep(2000);

        String url = driver.getCurrentUrl();
        String expectedURL = "https://cashwise.us/dashboard/infographics";
        Assertions.assertEquals(expectedURL, url, "Sign up URL failed");

        WebElement header = driver.findElement(By.xpath("//header[@id='header']//h2"));
        Assertions.assertEquals(companyName, header.getText().trim(), "Header company name failed after sign up");

    }
}


