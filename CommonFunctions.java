import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

    public void waitTillelementToBeClickable(ChromeDriver chromeDriver, long timeOutInSeconds, By element){
        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver,timeOutInSeconds);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println("Element is Clickable");
    }

    public void WaitTillElementIsVisible(ChromeDriver chromeDriver, long timeOutInSeconds, By element){
        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver,timeOutInSeconds);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(element));
        System.out.println("Element is Visible");

    }

    public void performClick(ChromeDriver chromeDriver, By element){
        waitTillelementToBeClickable(chromeDriver,30,element);
        chromeDriver.findElement(element).click();
        System.out.println("Clicking an element = "+ element);
    }

    public void enterValues(ChromeDriver chromeDriver, By element,String data){
        System.out.println("Enter Values = "+ data);
        chromeDriver.findElement(element).sendKeys(data);
    }

    public void openURL(ChromeDriver chromeDriver,String URL){
        chromeDriver.get(URL);
        System.out.println("Opening URL ="+URL);
    }

    public String extractText(ChromeDriver chromeDriver,By element){
        return chromeDriver.findElement(element).getText();
    }

}
