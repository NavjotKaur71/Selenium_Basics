import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OrangHRM extends CommonFunctions {


    public void startAutomation() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        openURL(chromeDriver, "https://resolveauto-trials7401.orangehrmlive.com/");

        enterValues(chromeDriver, By.id("txtUsername"), "Admin");

        enterValues(chromeDriver, By.id("txtPassword"), "@l7Dv6kPXL");

        performClick(chromeDriver, By.className("button-holder"));

        String actualProfileName = extractText(chromeDriver,By.id("account-name"));
        System.out.println("Profile Name is = "+actualProfileName);

        performClick(chromeDriver, By.xpath("//*[text()=\"Admin\"]"));

        performClick(chromeDriver, By.xpath("//*[text()=\"User Management\"]"));

        performClick(chromeDriver, By.xpath("//*[text()=\"Users\"]"));


        performClick(chromeDriver, By.xpath("//label[contains(@for,'_36')]"));


//        chromeDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        chromeDriver.findElement(By.id("txtPassword")).sendKeys("@l7Dv6kPXL");
//        chromeDriver.findElement(By.className("button-holder")).click();
//        chromeDriver.findElement(By.xpath("//*[text()=\"Admin\"]")).click();
//
//        waitTillelementToBeClickable(chromeDriver,5,By.xpath("//*[text()=\"User Management\"]"));
//
//        chromeDriver.findElement(By.xpath("//*[text()=\"User Management\"]")).click();
//
//        waitTillelementToBeClickable(chromeDriver,5,By.xpath("//*[text()=\"User Management\"]"));
//        chromeDriver.findElement(By.xpath("//*[text()=\"Users\"]")).click();
//
//        waitTillelementToBeClickable(chromeDriver,30,By.xpath("//*[text()=\"User Management\"]"));
//
//        chromeDriver.findElement(By.xpath("//label[contains(@for,'_36')]")).click();
    }


    public static void main(String[] args) throws InterruptedException {
        OrangHRM orangHRM = new OrangHRM();
        orangHRM.startAutomation();
    }
}
