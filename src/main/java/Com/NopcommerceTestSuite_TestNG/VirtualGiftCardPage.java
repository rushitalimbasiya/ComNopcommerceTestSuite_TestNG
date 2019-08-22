package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class VirtualGiftCardPage extends Utils {
    LoadProp loadProp=new LoadProp();
    private static By _inputRecientName =By.cssSelector("#giftcard_43_RecipientName"); //input Recipient's Name
    private static By _inputRecipientEmail =By.cssSelector("#giftcard_43_RecipientEmail");//input Recipient's Email
    private static By _inputMessage =By.cssSelector("#giftcard_43_Message"); //input Message
    private static By _clickOnEmailFriendButton =By.xpath("//div[@class='email-a-friend']/input");//click on Email a friend button
    private static By _inputFrindEmail =By.cssSelector("#FriendEmail"); //input Friend's email
    private static By _inputPersonlMessage =By.cssSelector("#PersonalMessage");//input Personal message
    private static By _clickOnSendEmailButton =By.cssSelector(".buttons>input");//click on send email button
    private static By _assertFinalMessage = By.xpath("//div[@class='result']");//assert final message Your message has been sent




    public void inputFillingRecipienDetail_Method()//input Recipient's Name ,Recipient's Email and Message
    {
        sendKeyMethod(_inputRecientName,loadProp.getproperty("RecipientName"));
        sendKeyMethod(_inputRecipientEmail,loadProp.getproperty("RecipientEmail"));
        sendKeyMethod(_inputMessage,loadProp.getproperty("Message"));
    }
    public void clickOnEmailFriendButton_Method() //click on Email a friend button
    {
      clickOnElement(_clickOnEmailFriendButton);
    }
    public void inputFriendYourEmailAndPersonalMessage_Method() //input Friend's email and Personal message
    {
       sendKeyMethod(_inputFrindEmail,loadProp.getproperty("FriendEmail"));
       sendKeyMethod(_inputPersonlMessage,loadProp.getproperty("PersonalMessage"));
    }
    public void clickOnSendEmailButton_Method()//click on send email button
    {
       clickOnElement(_clickOnSendEmailButton);
    }
    public void assertFinalMessage_Method()  //assert final message Your message has been sent
    {
      assertEqualsMethod(_assertFinalMessage,"Your message has been sent.");
    }
}
