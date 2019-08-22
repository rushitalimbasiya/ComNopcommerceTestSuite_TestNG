package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogoutPage extends Utils {
    private static By _clickOnLogout = By.className("ico-logout");//for logout



    public void clickOnLogoutMethod()
    {
        clickOnElement(_clickOnLogout);
    }

 }

