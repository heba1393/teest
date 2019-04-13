package Testing;

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FirstTest {

   @Test
    public void testOne()
    {
        IOSDriver<IOSElement> driver;
        String serverUrl = "http://0.0.0.0:4723/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6 (12.1)");
        capabilities.setCapability(MobileCapabilityType.UDID, "F5CF4CA5-1ABD-4C09-8589-7D4BC849D774");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        capabilities.setCapability(MobileCapabilityType.APP, "/Applications/Demo.app");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
        capabilities.setCapability("bundleId", "com.cloudconnectiv.MobileNOC.Demo");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        capabilities.setCapability(MobileCapabilityType.APP, "/Users/user/Library/Developer/Xcode/DerivedData/Demo-fkdoylepzlnthedjnbnfjabevhdj/Build/Products/Debug-iphonesimulator/Demo.app");

        try {
            driver = new IOSDriver<IOSElement>(new URL(serverUrl), capabilities);

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.manage().timeouts().e

//            driver.findElement(By.id("lb20")).click();
//
//            TouchActions action = new TouchActions(driver);
//            action.scroll(driver.findElement(By.id("lb20")), 10, 567);
//            action.perform();



//            RemoteWebElement parent = driver.findElement(By.className("XCUIElementTypeTable"));
//            String parentID = parent.getId();
//            HashMap<String, String> scrollObject = new HashMap<String, String>();
//            scrollObject.put("element", parentID);
//            scrollObject.put("predicateString", "label == 'Title: 20'");
//            driver.executeScript("mobile:scroll", scrollObject);
            driver.swipe(0,0,0,20,2000);

            driver.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
    }
}
