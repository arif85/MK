package modnaKasta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by arif on 04.02.17.
 */
public class myfirsttime {
    public static void main (String args[]){
        String name = "Arif Huseinov ";
        System.out.print("Hello world "+name);
        WebDriver driver = new ChromeDriver();
        driver.get("https://modnakasta.ua");
        String title= driver.getTitle();
        System.out.println(title);
        driver.get("https://google.com");
        String cur = driver.getCurrentUrl();
        System.out.print(cur);
        driver.quit();
    }
}
