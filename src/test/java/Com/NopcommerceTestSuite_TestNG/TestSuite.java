package Com.NopcommerceTestSuite_TestNG;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LogoutPage logoutPage = new LogoutPage();
    SignInPage signInPage = new SignInPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    MyaccountCustomerinfoPage myaccountCustomerinfoPage = new MyaccountCustomerinfoPage();
    ApparelPage apparelPage = new ApparelPage();
    ClothingPage clothingPage = new ClothingPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    BookPage bookPage = new BookPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ThankYouPage thankYouPage = new ThankYouPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    VirtualGiftCardPage virtualGiftCardPage = new VirtualGiftCardPage();

     @Test
     public void to_verify_I_can_Get_Register_Page()

     {
    homePage.clickOnRegisterLink();
     }

    /* 5-www.demo.nopcommerce.com, registering on this website. Once registered it then Logout and Login
     again with registered email address checking account holder's detail is correct?
     a.	To verify is a message displayed "your registration completed" on registration completion?*/
    @Test
    public void to_verify_User_Is_Able_To_Register_And_Logout_And_LogIn_And_Checking_Accont_Holders_Detail() {
        homePage.clickOnRegisterLink();//click on register link
        registerPage.maleButtMethod();//click on male button
        registerPage.inputFirstNameMethod();//input first name
        registerPage.inputLastNameMethod();//input last name
        registerPage.selectDateMethod();//for date
        registerPage.selectMonthMethod();//for month
        registerPage.selectYearMethod();//for year
        registerPage.inputEmailMethod();//input email
        registerPage.inputCompanyNameMethod();//input company name
        registerPage.clickOnNewsletterMethod();//click on news letter
        registerPage.inputPasswordMethod();//input password
        registerPage.inputConfirmPasswordMethod();//input confirm password
        registerPage.clickOnRegisterButton();//click on register button
        //assert
        logoutPage.clickOnLogoutMethod();//click on logout
        homePage.clickOnLoginButtonMethod();//click on login
        signInPage.getUserEmailFromRegisterPageMethod(registerPage.eMailAddress);//for get email
        signInPage.inputPasswordMethod();//for Password
        signInPage.clickOnLOgInButtonMethod();//for login button
        myAccountPage.clickOnMyAccountMethod();//click on my account link
        myaccountCustomerinfoPage.assertMyaccountCustomerinfoMethod();//for assert "Your Personal Details"
    }

    /* 1.	http://demo.nopcommerce.com/, Click on Apparel - click on clothing from l   eft side menu - sort by low to high price
     - display 3 per page - click on list(view) - take a screen shot -  add to comparison custom t-shirt and oversized women
      t-shirt - take again screen short with green line on top with message "The product has been added
      to your product comparison" - click on product comparison
      from green line link - assert product name - clear compare list - assert message no product for comparison.*/
    @Test
    public void to_verify_User_Is_Able_To_ClickonApparel_ClickOnClothing_SortByLowToHigh_Display3_ClickOnList_TakeScreenShot_AddtoComparisonCustomTshirtAndOverSizedWomenTshirt_takeAgainScreenShort_clickOnComparison_AndClearCompare() {

        homePage.clickOnApparelMethod();//for click on apparel
        apparelPage.clickOnClothingMethod();//click on clothing
        clothingPage.selectOnLowToHighMethod();//select low to high
        clothingPage.selectOnDisplayMethod();//select display 3
        clothingPage.clickOnViewListMethod();//click on list
        Utils.scerrnshotMethod();
        clothingPage.clickOnCustomTShirtMethod();//for custom T-shirt
        clothingPage.blankClickOnGreenLineMethod();//blink click on green line
        clothingPage.blankClickOnGreenLineMethod();
        clothingPage.blankClickOnGreenLineMethod();//blink click on close green line
        clothingPage.blankClickOnGreenLineMethod();
        clothingPage.clickOnOverSizedWomenTShirtMethod();//for Oversized Women T-Shirt
        clothingPage.blinkClickOnGreenLineSCMethod();//blink click on green line
        Utils.scerrnshotMethod();
        clothingPage.clickOnProductComparisonMethod();//click on product comparison
        compareProductsPage.assert_OversizedWomenTShirt_Method();//assert Oversized Women T-Shirt
        compareProductsPage.assert_CustomTShirt_Method();//assert Custom T-Shirt
        compareProductsPage.click_On_ClearList_Method(); // Click on the Clear list of comparison
        compareProductsPage.assert_NoItems_Method(); //assert for You have no items to compare
    }

    @Test
/*	6.Demo.nopcommerce.com – click on the product – change quantity of the product – add picture of Fahrenheit 451
    by ray Bradbury book in with list – verify “The product has been added to you wishlist” from top green line –
    add product in to cart – change the quantity to 4 – go to cart from top green message – select country –
    term and condition – checkout – checkout as guest – filling personal detail – add
    card detail – continue to order till end and verify order confirmation message.*/
    public void to_verify_User_Is_Able_To_AddFahrenheit451Book_ChangeTheQuantity4_SelectCountry_CheckoutAsGuest_FillingPersonalDetail_AddCardDetail_VerifyOrderConfirmationMessage() {
        homePage.click_On_Book_Method();  //click on book
        bookPage.addToWishList_Method();  //add to wish list Fahrenheit 451 by Ray Bradbury book
        bookPage.assertGreenLien_Method();   //assert on green lien The product has been added to your wishlist
        bookPage.clickOnFahrenheitBook_Method();  //click on Fahrenheit 451 by Ray Bradbury book
        bookPage.clickOnAddToCart_Method();   //product add to cart
        bookPage.clickOnShoppingCart_Method();  //click top green The product has been added to your shopping cart
        bookPage.changeTheQuatity_Method();  //change the quantity to 4
        bookPage.selectCountry_Method();  // select country
        bookPage.addPostCode_method();  //add Zip / postal code
        bookPage.clickOnAgreeButton_Method();  //click on  agree box
        bookPage.clickOnCheckoutButton_Method();  //click on checkout
        signInPage.clickOnAsGuest_Method();  //click on checkout as guest button
        checkoutPage.fillingPersonalDetailchekout_Method();  //add filling personal detail and click on continue
        checkoutPage.clickOnNextDay_Method(); //click on Next Day Air ($0.00),The one day air shipping,click on Continue
        checkoutPage.clickOnCreditCardButton_Method(); //click on Credit Card button,click on Continue
        checkoutPage.fillingCardDetailContinu_Method(); //add card detail and click on continue button
        checkoutPage.clickOnConfirmButton_Method();  //click on confirm button
        thankYouPage.assertOnMassages_Method();  //assert with order confirmation message Your order has been successfully processed!
    }

    @Test

    /*7.	opening demo.nopcommerce.com, registering an account on this website,
    after registering log out and log in again with registered email address and password,
     adding a virtual gift card in the cart, after filling all personal detail, send an Email a friend,
      send an email and assert the final message.
a.	Date stamp for the unique email address.*/
    public void to_verify_User_Is_Able_To__Register_And_Logout_And_LogIn_AddingVirtualGiftCardInCart_AfterFillingAllPersonalDetail_SendEmailFriendSend_And_assertFinalMessage() {

        homePage.clickOnRegisterLink();  //click on register link
        registerPage.fillngAllRegisterDetail_Method();  //fillng all register detail and click on register-button
        logoutPage.clickOnLogoutMethod();  //click on log out link
        homePage.clickOnLoginButtonMethod();  //click on log in link
        signInPage.getUserEmilAndPasswordFromRegisterPage_Method(registerPage.emailAddress1);  // enter registered email address and password and click on log in button
        homePage.clickOnGiftCard_Method();  // click on gift card
        giftCardsPage.addVirtualGiftCardInCart_Method();  //adding a virtual gift card in the cart
        virtualGiftCardPage.inputFillingRecipienDetail_Method();  //input Recipient's Name ,Recipient's Email and Message
        virtualGiftCardPage.clickOnEmailFriendButton_Method();  // click on send an Email a friend button
        virtualGiftCardPage.inputFriendYourEmailAndPersonalMessage_Method();  // enter friend detail and Personal message
        virtualGiftCardPage.clickOnSendEmailButton_Method();  //click on send email button
        virtualGiftCardPage.assertFinalMessage_Method();  //assert final message Your message has been sent

    }

    @Test

/*2.	http://demo.nopcommerce.com/, Click on Apparel - click on clothing from left side menu
       - sort by high to low -display 9 per page - click on list(view) -
       add to comparison custom t-shirt and oversized women t-shirt - click on product comparison from green line link
       - assert product name -clear compare list -assert message no product for comparison.*/
    public void to_verify_User_Is_Able_To_ClickOnApparel_ClickOnClothing_HighToLow_9PerPage_ClickOnList_AddComparisonCustomTshirt_OvrrsizedWomenTshirt_ProductComparisonFromGreenLineLink_AssertProductName_clearCompareList_AssertMessageNoProductForComparison() {
        homePage.clickOnApparelMethod();   //Click on Apparel
        apparelPage.clickOnClothingMethod();   //click on clothing from left side menu
        clothingPage.selectOnHighToLow_Method();   //sort by high to low
        clothingPage.selectOnDisplay9_Method();   // display 9 per page
        clothingPage.clickOnViewListMethod();   //click on list(view)
        clothingPage.clickOnCustomTShirtMethod();   //add to comparison custom t-shirt
        clothingPage.blankClickOnGreenLineMethod();//  blankClickOnGreenLine
      //  clothingPage.clickForWait_Method();
        clothingPage.clickOnOverSizedWomenTShirtMethod();   //add to oversized women t-shirt
        clothingPage.clickOnProductComparisonMethod();   //click on product comparison from green line link
        compareProductsPage.assert_CustomTShirt_Method();   // assert product name CustomTShirt
        compareProductsPage.assert_OversizedWomenTShirt_Method();  //assert product name OversizedWomenTShirt
        compareProductsPage.click_On_ClearList_Method();   //clear compare list
        compareProductsPage.assert_NoItems_Method();   //assert message no product for comparison

    }
}
