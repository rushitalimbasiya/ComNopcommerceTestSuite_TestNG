package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    LoadProp loadProp = new LoadProp();

  private static By _RegisterLink = By.className("ico-register");//click on RegisterButton
  private static By _clickOnLoginButton = By.className("ico-login");//click on login button
  private static By _clickOnApparel = By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a");//click on apparel
  private static By _clickOnBook = By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a");//click on book
  private static By _clickOnGiftCard=By.xpath("//ul[@class='top-menu notmobile']/li[7]/a"); // click on gift card




    public void clickOnRegisterLink()

    {
        clickOnElement(_RegisterLink);
    }
    public void clickOnLoginButtonMethod()

    {
        clickOnElement(_clickOnLoginButton);
    }
    public void clickOnApparelMethod()
    {

        clickOnElement(_clickOnApparel);
    }
    public void click_On_Book_Method()
    {
        clickOnElement(_clickOnBook);
    }
    public void clickOnGiftCard_Method()
    {
        clickOnElement(_clickOnGiftCard);
    }
}

