package utilities;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilTester {

    @Test

    public void test() throws IOException {
        Properties properties = new Properties();
        System.out.println(Config.getValue("study.mate.production"));
    }
}

//    public void test(){
//        Driver.getDriver().get("https://cashwise.us");
//        Flow.wait(1000);
//        Flow.scrollDown(1000);
//        Flow.wait(1000);
//        Flow.scrollUp(900);

//    }
//}
