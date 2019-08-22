package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class CheckoutPage extends Utils {
    LoadProp loadProp=new LoadProp();
    private static By _inputFirstName=By.cssSelector("#BillingNewAddress_FirstName");//for first name
    private static By _inputLastName=By.cssSelector("#BillingNewAddress_LastName");//for Last name
    private static By _inputEmail=By.cssSelector("#BillingNewAddress_Email");//for Email
    private static By _inputCompany=By.cssSelector("#BillingNewAddress_Company");//for Company
    private static By _selectCountryName=By.cssSelector("#BillingNewAddress_CountryId");// select Country
    private static By _selectState=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");//select State / province
    private static By _inputCity=By.cssSelector("#BillingNewAddress_City");// input City
    private static By _inputAddress1=By.cssSelector("#BillingNewAddress_Address1");//input Address 1
    private static By _inputAddress2=By.cssSelector("#BillingNewAddress_Address2");//input Address 2
    private static By _inputPostCode=By.cssSelector("#BillingNewAddress_ZipPostalCode");// input Zip / postal code
    private static By _inputPhoneNumber= By.cssSelector("#BillingNewAddress_PhoneNumber");//input Phone number
    private static By _inputFax=By.cssSelector("#BillingNewAddress_FaxNumber");//input Fax number
    private static By _clickOnContinueButton=By.cssSelector("#billing-buttons-container>input");// click on Continue button
    private static By _clickOnNextDay=By.cssSelector("#shippingoption_1");//click on Next Day Air ($0.00),The one day air shipping
    private static By _clickOnContinueBut=By.cssSelector(".button-1.shipping-method-next-step-button");// click on Continue button
    private static By _clickOnCreditCardButton=By.xpath("//input[@id='paymentmethod_1']");//click on Credit Card button
    private static By _clickOnContinue=By.cssSelector(".button-1.payment-method-next-step-button");// click on Continue button
    private static By _selectCreditCard=By.cssSelector("#CreditCardType"); //Select credit card "MasterCard"
    private static By _inputCardholderName=By.cssSelector("#CardholderName"); //input Cardholder name
    private static By _inputCardNumber=By.cssSelector("#CardNumber"); //input Card number
    private static By _selectExpiriDate= By.cssSelector("#ExpireMonth"); //select Expiration date"8"
    private static By _selectExpiriyear=By.cssSelector("#ExpireYear"); //select Expiration year"2020"
    private static By _inputCardCode=By.cssSelector("#CardCode");//input Card code
    private static By _clickOnContiButton=By.xpath("//div[@id='payment-info-buttons-container']/input");//click on continue button
    private static By _clickOnConfirmButton=By.xpath("//div[@id='confirm-order-buttons-container']/input");//click on confirm button

    String eMailAddress = "abcd"+GetCurrentDateStamp()+"@yahoo.com";
    public void fillingPersonalDetailchekout_Method()//add filling personal detail and click on continue
    {
       sendKeyMethod(_inputFirstName,loadProp.getproperty("FirstName"));
       sendKeyMethod(_inputLastName,loadProp.getproperty("LastName"));
       sendKeyMethod((_inputEmail),eMailAddress);
       sendKeyMethod(_inputCompany,loadProp.getproperty("Company"));
       selectByValueMethod(_selectCountryName,"233");
       selectByValueMethod(_selectState,"0");
       sendKeyMethod(_inputCity,loadProp.getproperty("city"));
       sendKeyMethod(_inputAddress1,loadProp.getproperty("Address1"));
       sendKeyMethod(_inputAddress2,loadProp.getproperty("Address2"));
       sendKeyMethod(_inputPostCode,loadProp.getproperty("postcode"));
       sendKeyMethod(_inputPhoneNumber,loadProp.getproperty("PhoneNumber"));
       sendKeyMethod(_inputFax,loadProp.getproperty("Fax"));
       clickOnElement(_clickOnContinueButton);
    }
    public void clickOnNextDay_Method()
    {
        clickOnElement(_clickOnNextDay);//click on Next Day Air ($0.00),The one day air shipping
        clickOnElement(_clickOnContinueBut);// click on Continue
    }
    public void clickOnCreditCardButton_Method()
    {
        clickOnElement(_clickOnCreditCardButton);//click on Credit Card button
        clickOnElement(_clickOnContinue);// click on Continue
    }
    public void fillingCardDetailContinu_Method()// filling all card Details and continue
    {
        selectByValueMethod(_selectCreditCard,"MasterCard");
        sendKeyMethod(_inputCardholderName,loadProp.getproperty("CardholderName"));
        sendKeyMethod(_inputCardNumber,loadProp.getproperty("CardNum"));
        selectByValueMethod(_selectExpiriDate,"8");
        selectByValueMethod(_selectExpiriyear,"2020");
        sendKeyMethod(_inputCardCode,loadProp.getproperty("CardCode"));
        clickOnElement(_clickOnContiButton);
    }
    public void clickOnConfirmButton_Method(){
        clickOnElement(_clickOnConfirmButton);

    }
}
