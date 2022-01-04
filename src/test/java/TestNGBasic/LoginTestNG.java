package TestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTestNG {
    public static WebDriver driver;

    @BeforeClass
    public static void chrome_launch()
    {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }
    @AfterClass
    public static void chrome_close(){
        driver.close();
    }
    @BeforeTest
    public static void before_test(){
        System.out.println("Before Test Executed updated");
    }
    @AfterTest
    public static void after_test(){
        System.out.println("After Test Executed done updated");
    }
    @BeforeMethod
    public static void before_method(){
        System.out.println("before method executed");
    }
    @AfterMethod
    public static void after_method(){
        System.out.println("after method executed");
    }



    @Test(description = "Email and passwors are valid")
    public static void valid_TestCase(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("testemail12wwsewewq56787821@test.com");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
    }

    @Test(description = "Email and password are invalid")
    public static void invalid_TestCase(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("testemail12wwsewewq5");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
    }

}
