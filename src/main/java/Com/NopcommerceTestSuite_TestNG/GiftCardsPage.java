package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class GiftCardsPage extends Utils {

    private static By _addVirtualGiftCardInCart=By.xpath("//input[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/43/1/1\"),!1']");
                                                                           //adding a virtual gift card in the cart
    public void addVirtualGiftCardInCart_Method()
    {
        clickOnElement(_addVirtualGiftCardInCart);
    }
}
