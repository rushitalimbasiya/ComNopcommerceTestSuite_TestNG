package Com.NopcommerceTestSuite_TestNG;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;


public class BaseTest extends BagePage {
    BroserSelector broserSelector = new BroserSelector();
    LoadProp loadProp = new LoadProp();
    Utils utils = new Utils();
    @BeforeMethod
    public void openBrowser(){
        broserSelector.browserSelection();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get(loadProp.getproperty("url"));
        driver.manage().deleteAllCookies();
    }
    @AfterMethod
    public void closeBrowser(ITestResult result){
        if (ITestResult.FAILURE==result.getStatus())
        {
            utils.scerrnsshotMethod(driver,result.getName());

        }
        driver.quit();
    }

}
