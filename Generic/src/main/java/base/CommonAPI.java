package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver =null;

    @BeforeMethod
    public void setUP(){
        System.setProperty("webdriver.chrome.driver","/Users/dola/IdeaProjects/Netflix/Generic/Path/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.netflix.com/");

    }

    public void clearFeild(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }


    //@AfterMethod
//    public void CloseBrowser(){
//     driver.close();
//}
    public void SignInClick(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void SignInEmail (String locator , String value){
        driver.findElement(By.name(locator )).sendKeys(value);
        //  driver.findElement(By.name(locator)).sendKeys(value);
        //  driver.findElement(By.cssSelector(locator)).click();
    }
    public void SignInPass (String locator , String value){
        driver.findElement(By.name(locator)).sendKeys(value);
    }

    public void SignInButton (String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void TypeElementAndEnter (String locator , String value) {
        try {
            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception Ex1) {
            try {
                driver.findElement(By.cssSelector(locator)).sendKeys(value , Keys.ENTER);
            } catch (Exception Ex2) {
                driver.findElement(By.id(locator)).sendKeys(value , Keys.ENTER);
            }
        }


    }

}

