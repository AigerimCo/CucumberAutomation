//package cashwiseTest;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import pagesCashwise.CashwiseProject;
//import utilities.Config;
//import utilities.Driver;
//import utilities.Flow;
//
//public class TestAigerim1 {
//    CashwiseProject access = new CashwiseProject();
//
//
//    @Test
//    public void PositiveAccess() {
//        Driver.getDriver().get(Config.getValue("cashwiseURL"));
//        access.login(Config.getValue("cashwiseLoginEmail"), Config.getValue("cashwiseLoginPassword"));
//        Flow.wait(2000);
//        String expectedUrl = " "
//
//
//
//    }
//    @Test
//    public void ExpensesDropdownVerificationNegative() {
//
//        Driver.getDriver().get("https://cashwise.us");
//        expenses.login("cashwise@gmail.com", "0000000");
//        String actual = Driver.getDriver().getCurrentUrl();
//        String expected = "https://cashwise.us/main?showLogin=true";
//        Assertions.assertNotEquals(expected,actual);
//
//    }
//}
//
