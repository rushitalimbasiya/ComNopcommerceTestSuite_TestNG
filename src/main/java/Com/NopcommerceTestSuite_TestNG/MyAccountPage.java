package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class MyAccountPage extends Utils {

    private static By _clickOnMyAccount= By.className("ico-account");//click on my account

    public void clickOnMyAccountMethod(){
        clickOnElement(_clickOnMyAccount);
    }
}

