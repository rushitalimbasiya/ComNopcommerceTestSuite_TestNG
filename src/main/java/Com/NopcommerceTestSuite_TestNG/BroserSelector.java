package Com.NopcommerceTestSuite_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BroserSelector extends Utils {
    public void browserSelection(){
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getproperty("browser");
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resourcer\\BrowserDriver\\chromedriver.exe");
            driver =new ChromeDriver();
            System.out.println("chrome");
        }
        else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resourcer\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("Firefox");
        }
        else if (browser.equalsIgnoreCase("InternetExplorer")){
            System.setProperty("webdeiver.ie.driver","src\\test\\Resourcer\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            System.out.println("InternetExplorer");
        }
        else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdeiver.edge.driver","src\\test\\Resourcer\\BrowserDriver\\msedgedriver.exe");
            driver =new EdgeDriver();
            System.out.println("Edge");
        }
    }
}
