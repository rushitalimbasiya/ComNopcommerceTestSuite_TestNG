package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class SignInPage extends Utils {

    LoadProp loadProp = new LoadProp();
    RegisterPage registerPage = new RegisterPage();

    private static By _getUserEmilFromRegisterPage=By.cssSelector("#Email");//get email
    private static By _inputPassword = By.cssSelector("#Password");//for Password
    private static By _clickOnLOgInButton=By.cssSelector(".button-1.login-button");//for login button
    private static By _clickOnAsGuest=By.xpath("//input[@value='Checkout as Guest']");//click on checkout as guest button


    public void getUserEmailFromRegisterPageMethod(String email)
    {
        sendKeyMethod(_getUserEmilFromRegisterPage,email);
    }
    public void inputPasswordMethod()

    {

        sendKeyMethod(_inputPassword,loadProp.getproperty("Password"));
    }
    public void clickOnLOgInButtonMethod()


    {
        clickOnElement(_clickOnLOgInButton);
    }
    public void clickOnAsGuest_Method()
    {
        clickOnElement(_clickOnAsGuest);
    }
    public void getUserEmilAndPasswordFromRegisterPage_Method(String email)//enter registered email address and password and click on log in button
    {
        sendKeyMethod(_getUserEmilFromRegisterPage,email);
        sendKeyMethod(_inputPassword,loadProp.getproperty("Password"));
        clickOnElement(_clickOnLOgInButton);

    }


}
