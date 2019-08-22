package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.By;

public class ThankYouPage extends Utils {
    private static By _assertOnMassages=By.xpath("//div[@class='section order-completed']/div/strong");
    //assert for massages"Your order has been successfully processed!"

    public void assertOnMassages_Method()
    {
        assertEqualsMethod(_assertOnMassages,"Your order has been successfully processed!");
    }
}
