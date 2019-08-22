package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class ApparelPage extends Utils {
    private static By _clickOnClothing = By.xpath("//ul[@class='sublist']/li[2]/a");//click on clothing

    public void clickOnClothingMethod()
    {
        clickOnElement(_clickOnClothing);
    }
}
