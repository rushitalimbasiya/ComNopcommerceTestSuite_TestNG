package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class BookPage extends Utils {
      LoadProp loadProp= new LoadProp();
      private static By _addToWishList=By.xpath("//input[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/37/2/1\"),!1']");
      private static By _assertGreenLien=By.xpath("//div[@id='bar-notification']/div/p");//for assert top green lien
      private static By _clickOnFahrenheitBook = By.xpath("//div[@data-productid='37']/div[1]/a/img");  //click on Fahrenheit 451 by Ray Bradbury book
      private static By _clickOnAddToCart=By.xpath("//input[@id='add-to-cart-button-37']");//book add to cart
      private static By _clickOnShoppingCart=By.xpath("//p[@class='content']/a"); //click top green The product has been added to your shopping cart
      private static By _changeTheQuatity= By.cssSelector(".quantity>input");//change the quantity to 4
      private static By _selectCountry=By.cssSelector("#CountryId");// select country
      private static By _addPostCode=By.xpath("//input[@id='ZipPostalCode']");//add Zip / postal code
      private static By _clickOnAgreeButton=By.xpath("//input[@id='termsofservice']");//click on  agree box
      private static By _clickOnCheckoutButton=By.xpath("//div[@class='checkout-buttons']/button");  //click on checkout
      public void addToWishList_Method(){
            clickOnElement(_addToWishList);
      }
      public void assertGreenLien_Method(){
            assertEqualMethod(_assertGreenLien,"The product has been added to your wishlist");
      }
      public void clickOnFahrenheitBook_Method()
      {
            clickOnElement(_clickOnFahrenheitBook);
      }
      public void clickOnAddToCart_Method()
      {
            clickOnElement(_clickOnAddToCart);
      }
      public void clickOnShoppingCart_Method()
      {
            clickOnElement(_clickOnShoppingCart);
      }
      public void changeTheQuatity_Method()
      {
            clearOnElement(_changeTheQuatity);
            sendKeyMethod(_changeTheQuatity,"4");
      }
      public void selectCountry_Method()
      {
            selectByValueMethod(_selectCountry,"233");
      }
      public void addPostCode_method()
      {
            sendKeyMethod(_addPostCode,loadProp.getproperty("postcode"));
      }
      public void clickOnAgreeButton_Method()
      {
            clickOnElement(_clickOnAgreeButton);
      }
      public void clickOnCheckoutButton_Method()
      {
            clickOnElement(_clickOnCheckoutButton);
      }





}
