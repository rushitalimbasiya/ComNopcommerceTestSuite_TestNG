package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class MyaccountCustomerinfoPage extends Utils {

    private static By _assertMyaccountCustomerinfo=By.xpath("//div[@class='fieldset'][1]/div[1]/strong");

    public void assertMyaccountCustomerinfoMethod(){
        assertEqualsMethod(_assertMyaccountCustomerinfo,"Your Personal Details");

    }
}

