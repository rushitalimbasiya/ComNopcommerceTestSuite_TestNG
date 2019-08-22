package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class ClothingPage extends Utils {

    private static By _selectOnLowToHigh = By.cssSelector("#products-orderby");//select low to high
    private static By _selectOnDisplay = By.cssSelector("#products-pagesize");//select display
    private static By _clickOnViewList = By.xpath("//div[@class='product-viewmode']/a[2]");//click on list
    private static By _clickOnCustomTShirt = By.xpath("//div[@class='item-box'][2]/div/div[2]/div[3]/div[2]/input[2]");//for Custom T-Shirt
    private static By _ClickOnCloseGreenline = By.cssSelector(".close");// click on close green line
    private static By _blankClick = By.xpath("//div[@class='block block-popular-tags']/div[1]/strong");//blank click
    private static By _clickOnOverSizedWomenTShirt = By.xpath("//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/28\"),!1']");//for Oversized Women T-Shirt
    private static By _blinkClickOnGreenLineSC = By.xpath("//div[@id='bar-notification']/div/p");//blink click on green line for screen shot
    private static By _clickOnProductComparison = By.xpath("//div[@id='bar-notification']/div/p/a");//click on product comparison
    private static By _clickForWait=By.cssSelector("#bar-notification>div>p");// for wait

    public void selectOnLowToHighMethod() {
        selectByVisibleTextMethod(_selectOnLowToHigh, "Price: Low to High");
    }

    public void selectOnDisplayMethod() {
        selectByVisibleTextMethod(_selectOnDisplay, "3");
    }

    public void clickOnViewListMethod() {
        clickOnElement(_clickOnViewList);
    }

    public void clickOnCustomTShirtMethod() {
        clickOnElement(_clickOnCustomTShirt);
    }

    public void blankClickOnGreenLineMethod() {
        clickOnElement(_blankClick);
        clickOnElement(_ClickOnCloseGreenline);
        clickOnElement(_blankClick);
    }

    public void clickOnOverSizedWomenTShirtMethod() {
        clickOnElement(_clickOnOverSizedWomenTShirt);
    }

    public void blinkClickOnGreenLineSCMethod() {
        clickOnElement(_blankClick);
        clickOnElement(_blinkClickOnGreenLineSC);
    }

    public void clickOnProductComparisonMethod() {
        clickOnElement(_clickOnProductComparison);
    }

    public void selectOnHighToLow_Method() //sort by high to low
    {
        selectByVisibleTextMethod(_selectOnLowToHigh, "Price: High to Low");
    }

    public void selectOnDisplay9_Method()//display 9 per page
    {
        selectByVisibleTextMethod(_selectOnDisplay,"9");
    }

    public void clickForWait_Method()
    {
        waitMethod(_clickForWait);
    }
}
