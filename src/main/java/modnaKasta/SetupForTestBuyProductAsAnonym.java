package modnaKasta;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class SetupForTestBuyProductAsAnonym {

    @FindBy(xpath = ".//div[@class='banner_item banners--big']")
    WebElement bigBanner;

    WebDriver driver;

    public SetupForTestBuyProductAsAnonym(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void startBrowserAndLoadMainPage() throws Exception{
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.modnakasta.ua");

    }
    public boolean isMainPageLoaded(){
        try{
            boolean isBannerDisplayed = bigBanner.isDisplayed();
                    return isBannerDisplayed;
        }catch (Exception e){
            Assert.fail("Main page was not loaded or failed to load big banner");
            return false;
        }
    }
    public void closeBrowserAndDriver(){
        driver.quit();
    }

}
