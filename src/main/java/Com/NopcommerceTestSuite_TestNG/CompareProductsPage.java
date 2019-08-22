package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class CompareProductsPage extends Utils {
    private static By _assertOversizedWomenTShirt=By.xpath("//tr[@class='product-name']/td[2]/a");//assert Oversized Women T-Shirt
    private static By _assertCustomTShirt=By.xpath("//tr[@class='product-name']/td[3]/a");//assert Custom T-Shirt
    private static By _clickOnClearList=By.cssSelector(".page-body>a");// Click on the Clear list of comparison
    private static By _assertNoItems=By.cssSelector(".page-body>div");// assert for You have no items to compare


    public void assert_OversizedWomenTShirt_Method(){
      assertEqualsMethod(_assertOversizedWomenTShirt,"Oversized Women T-Shirt");
    }
    public void assert_CustomTShirt_Method()
    {
        assertEqualsMethod(_assertCustomTShirt,"Custom T-Shirt");
    }
    public void click_On_ClearList_Method()
    {
        clickOnElement(_clickOnClearList);
    }
    public void assert_NoItems_Method()
    {
        assertEqualsMethod(_assertNoItems,"You have no items to compare.");
    }
}

