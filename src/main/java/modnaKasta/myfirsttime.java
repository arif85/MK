package modnaKasta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by arif on 04.02.17.
 */
public class myfirsttime {
    public static void main (String args[]){
        String name = "Arif";
        System.out.print("Hello world "+name);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://modnakasta.ua");
        //driver.quit();
    }
}
