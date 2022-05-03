import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumLocators {


    public void run() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.google.com/");
//        chromeDriver.findElement(By.linkText("Images")).click();
//        chromeDriver.findElement(By.partialLinkText("GmailAshish")).click();

        //gLFyf gsfi  & // name is : q
        //class="gLFyf gsfi"
        chromeDriver.findElement(By.name("q")).sendKeys("Resolve6");
        //enter techlistic tutorials in search box
        List<WebElement> autoSuggest = chromeDriver.findElements(By.className("UUbT9"));
        Thread.sleep(2000);
        System.out.println(autoSuggest.size());
        for (WebElement element : autoSuggest) {
            System.out.println(element.getText());
        }
    }
//        chromeDriver.findElement(By.id("icon")).click();
//        String str=chromeDriver.findElement(By.tagName("span")).getText();
//        System.out.println(str);
//
//        // City Dropdown : Cities :  CITYC, CITYB, CITYA  (Same classname : firstLevelMenu), : Click on CITY C
//
//        chromeDriver.findElement(By.className("firstLevelMenu")).click();

    //Get Multiple Element from Selenium
    //Findelements


    public static void main(String[] args) throws InterruptedException {
        SeleniumLocators seleniumLocators = new SeleniumLocators();
        seleniumLocators.run();
    }
}
