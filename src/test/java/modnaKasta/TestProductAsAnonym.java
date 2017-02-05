package modnaKasta;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestProductAsAnonym {

    WebDriver driver = new ChromeDriver();
    SetupForTestBuyProductAsAnonym setupForTestBuyProductAsAnonym = new SetupForTestBuyProductAsAnonym(driver);

    @Before
    public void setUp() throws Exception{
        setupForTestBuyProductAsAnonym.startBrowserAndLoadMainPage();
        Assert.assertTrue("Wrong page loaded",setupForTestBuyProductAsAnonym.isMainPageLoaded());
    }
    @Test

    public void testBuyProductAsAnonym(){

        driver.get("http://ukr.net");


    }
    @After

    public void tearDown(){
        setupForTestBuyProductAsAnonym.closeBrowserAndDriver();
    }
}
