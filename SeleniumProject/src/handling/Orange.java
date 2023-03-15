package handling;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Set;
/*
TS27:

Steps:
1. Navigate to https://opensource-demo.orangehrmlive.com
2. Click OrangeHRM link
3. Verify it opened second window
4. Switch to second window
5. Verify if it took to right place by checking URL
 */
public class Orange {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        // How to change from Set to List?
        List<String> listWindows = new ArrayList<>(windowHandles);

        System.out.println(windowHandles.size());

        for (String id: windowHandles){
            if (!id.equals(mainWindow)){
                driver.switchTo().window(id);
            }
        }

        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(mainWindow);

        // Usu

        for (String id: windowHandles){
            driver.switchTo().window(id);
            if (driver.getTitle().equals("Google")){
                break;
            }
        }
        driver.switchTo().window(mainWindow);

    }
}