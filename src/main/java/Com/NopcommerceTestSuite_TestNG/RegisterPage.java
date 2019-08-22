package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisterPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private static By _maleButton= By.cssSelector("#gender-male");//for MaleButton
    private static By _inputFirstName = By.cssSelector("#FirstName");//for  FirstName
    private static By _inputLastName = By.cssSelector("#LastName");//for Last name
    private static By _selectDate = By.xpath("//select[@name='DateOfBirthDay']");//for date
    private static By _selectMonth = By.xpath("//select[@name='DateOfBirthMonth']") ;//for month
    private static By _selectYear = By.xpath("//select[@name='DateOfBirthYear']");//for year
    private static By _inputEmail = By.cssSelector("#Email");//for Email
    private static By _inputCompanyName = By.cssSelector("#Company");//for Companyname
    private static By _clickOnNewsletter = By.xpath("//input[@id='Newsletter']");//for Newsletter
    private static By _inputPassword = By.cssSelector("#Password");//for Password
    private static By _inputConfirmPassword = By.cssSelector("#ConfirmPassword");//for ConfirmPassword
    private static By _inputOnRegisterButton = By.cssSelector("#register-button");//for register-button





    public void  maleButtMethod()
    {
        clickOnElement(_maleButton);
    }
    public void inputFirstNameMethod(){
        clickOnElement(_inputFirstName);
        sendKeyMethod(_inputFirstName,loadProp.getproperty("FirstName"));
    }
    public void inputLastNameMethod(){
        clickOnElement(_inputLastName);
        sendKeyMethod(_inputLastName,loadProp.getproperty("LastName"));
    }
    public void selectDateMethod()
    {
        selectByValueMethod(_selectDate,"10");
    }
    public void selectMonthMethod()

    {
        selectByValueMethod(_selectMonth,"5");
    }
    public void selectYearMethod()
    {
        selectByValueMethod(_selectYear,"1984");
    }
    String eMailAddress = "abcd"+GetCurrentDateStamp()+"@yahoo.com";
    public void inputEmailMethod()
    {
        sendKeyMethod((_inputEmail),eMailAddress);
    }
    public void inputCompanyNameMethod()
    {
        sendKeyMethod(_inputCompanyName,loadProp.getproperty("Company"));
    }
    public void clickOnNewsletterMethod()
    {
        clickOnElement(_clickOnNewsletter);
    }
    public void inputPasswordMethod()
    {
        sendKeyMethod(_inputPassword,loadProp.getproperty("Password"));
    }
    public void inputConfirmPasswordMethod()
    {
        sendKeyMethod(_inputConfirmPassword,loadProp.getproperty("ConfirmPassword"));
    }
    public void clickOnRegisterButton()
    {

        clickOnElement(_inputOnRegisterButton);
    }
    public void fillngAllRegisterDetail_Method()//fillng all register detail and click on register-button
    {
        clickOnElement(_maleButton);
        clickOnElement(_inputFirstName);
        sendKeyMethod(_inputFirstName,loadProp.getproperty("FirstName"));
        clickOnElement(_inputLastName);
        sendKeyMethod(_inputLastName,loadProp.getproperty("LastName"));
        selectByValueMethod(_selectDate,"10");
        selectByValueMethod(_selectMonth,"5");
        selectByValueMethod(_selectYear,"1984");
        sendKeyMethod((_inputEmail),eMailAddress);
        sendKeyMethod(_inputCompanyName,loadProp.getproperty("Company"));
        clickOnElement(_clickOnNewsletter);
        sendKeyMethod(_inputPassword,loadProp.getproperty("Password"));
        sendKeyMethod(_inputConfirmPassword,loadProp.getproperty("ConfirmPassword"));
        clickOnElement(_inputOnRegisterButton);

    }

}
