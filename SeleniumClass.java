import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SeleniumClass {


    public void startAutomation() throws InterruptedException {

        //WebDriverManager : Handle the Setup of Browser's
        // To Setup Automation : Chrome
        WebDriverManager.chromedriver().setup();

        // Driver Init :Creation of ChromeDriver object
        //Part of Selenium Library
        ChromeDriver chromeDriver= new ChromeDriver();

        // Get()
        //Navigate.to
        //NavigateBack
        //FindElement
        //Get () : Open the browser of Chrome & It will open the url which is getting passed in Paramater.
        //Maximize
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/");
        // to maximize(); is used to MAximize the window.
     //   chromeDriver.manage().window().maximize();

//        //Expectation
//        String expectedTitle="OrangeHRM";
//
//        //GetTitle : Extract the title of the application :
//        //Actual Result
//        String actualTitle=chromeDriver.getTitle();
//
//        // Compare the Actual Result & Expected Result
//
//        if(expectedTitle.equals(actualTitle)){
//            System.out.println("Test case is Passed");
//        }else
//            System.out.println("Test case if Failed");

        // element finding :
        // got the element location : Via id : - txtUsername
        //SendKeys : To enter some data in that particular Element in WEb application
        chromeDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
        // Clear() : Clear the text which is present in that element.
//        chromeDriver.findElement(By.id("txtUsername")).clear();

        // quit : To close the complete session.
        // Close : To Close the particular window.

//
//
//        chromeDriver.quit();


        // running automation in 5 chrome instance
        // Close.
        //Quit :



        //clear the data & then Enfer the data

//
        chromeDriver.findElement(By.name("txtPassword")).sendKeys("admin123");

        // Click () : This funcion is used to perform click on that particular element

        chromeDriver.findElement(By.className("button")).click();


        List<WebElement> list= chromeDriver.findElements(By.className("firstLevelMenu"));

        for(int a=0;a<list.size();a++){
            System.out.println(list.get(a).getText());
        }


        // Task : Find Out why Selenium used List in place of Array.
        // Array & List  & What is difference between Array & List


//
//        String expectedProfileName="Paul";
//        //GetTex() : Retrun the data which is present in that particular Element
//        String actualProfileName = chromeDriver.findElement(By.id("welcome")).getText();
//
//
//        System.out.println("Profile Name is = "+actualProfileName);
//
//        //findElement : Function : Accepting Paramter : By  Class
//        //By : class
//        // id (Element) , Xpath,Css,
//
//        if(actualProfileName.contains(expectedProfileName)){
//            System.out.println("Paul is present in that string");
//        }else
//            System.out.println("Paul is not present in that string ");

    }



    public static void main(String[] args) throws InterruptedException {
        SeleniumClass seleniumClass =new SeleniumClass();
        seleniumClass.startAutomation();
    }
}
