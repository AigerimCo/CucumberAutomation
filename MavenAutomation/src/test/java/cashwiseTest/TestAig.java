//package cashwiseTest;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import pagesCashwise.CashwiseProject;
//import utilities.Driver;
//
//public class TestAig {
//
//    CashwiseProject access = new CashwiseProject();
//
//    @Test
//    public void PositiveLogIn() {
//        Driver.getDriver().get("https://cashwise.us");
//        access.login("cashwise@gmail.com", "123123");
//
//    // access.expensesButton.click();
//    // Assertions.assertEquals(3, expenses.expensesList.size(), "Size is different");
//      }
//    @Test
//    public void NegativeLogIn() {
//
//        Driver.getDriver().get("https://cashwise.us");
//        access.login("cashwise@gmail.com", "0000000");
//        String actual = Driver.getDriver().getCurrentUrl();
//        String expected = "https://cashwise.us/main?showLogin=true";
//        Assertions.assertNotEquals(expected, actual);
//
//        //expenses.expensesButton.click();
//        //Assertions.assertEquals(3, expenses.expensesList.size(), "Size is different");
//    }
//}