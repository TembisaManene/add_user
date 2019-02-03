import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tembisamanene/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        
        driver.findElement(By.cssSelector(".btn btn-link pull-right")).click();

        driver.findElement(By.name("FirstName")).sendKeys("Tembisa");

        driver.findElement(By.name("LastName")).sendKeys("Manene");

        driver.findElement(By.name("UserName")).sendKeys("tembisam");

        driver.findElement(By.name("optionsRadios")).click();
        
        driver.findElement(By.name("Email")).sendKeys("maneneT@gmail.com");
        
        driver.findElement(By.name("Mobilephone")).sendKeys("0730707197");
        

        //driver.findElement(By.id("checkbox-2")).click();

        //driver.findElement(By.cssSelector("option[value='1']")).click();

        //driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        //driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn btn-success")).click();

        driver.quit();
    }
}
