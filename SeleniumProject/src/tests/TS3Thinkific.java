package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Summary verifying the url

1. go to https://codewise-s-school.thinkific.com/
2.check url,make sure it is "https://codewise-s-school.thinkific.com/courses/sdet-course" by default
3. click on Sigh in
4. verify the URL and make sure it is https://codewise-s-school.thinkific.com/users
 */
public class TS3Thinkific {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codewise-s-school.thinkific.com/");

        String expectedURL = ("https://codewise-s-school.thinkific.com/courses/sdet-course");

        String actualURL = driver.getCurrentUrl();

        if(actualURL.trim().equals(expectedURL)){
            System.out.println("PASSED");

        }else{
            System.out.println("FAILED");
            System.out.println("Expected: " + expectedURL);
            System.out.println("Actual: " + actualURL);
        }

        driver.findElement(By.linkText("Sign In")).click();
        System.out.println(driver.getCurrentUrl());

    }
}


