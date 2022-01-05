package DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DP_LoginTest {
    public static WebDriver driver;

    //Extent report
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeClass
    public static void chrome_launch(){
        //browser launch
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        System.out.println("Before Suite Executed.");
    }
    @AfterClass
    public static void chrome_close(){
        driver.close();
        System.out.println("After Suite Executed.");
    }

    @BeforeTest
    public static void before_test(){
        System.out.println("Before test Executed.");
    }

    @AfterTest
    public static void after_test(){
        System.out.println("After test Executed.");
    }

    @BeforeMethod
    public static void before_method(){
        System.out.println("Before method Executed.");
    }
    @AfterMethod
    public static void chrome_method(){
        System.out.println("After method Executed.");
    }
    @Test(dataProvider = "LoginData")
    public static void valid_TestCase(String DP_Email,String DP_Pass) {

        //Implement Extent Report
        htmlReporter = new ExtentHtmlReporter("./ExtentReports/DP_LoginReport.html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);

        //Information add to Report
        reports.setSystemInfo("Project Name", "Opencart");
        reports.setSystemInfo("Module Name", "Login");
        reports.setSystemInfo("Browser", "Chrome");
        reports.setSystemInfo("Test by", "Tanjimul");


        test = reports.createTest("Login test");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(DP_Email);
        test.log(Status.INFO, "Email Type"+DP_Email);

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys(DP_Pass);
        test.log(Status.INFO, "Password Type"+DP_Pass);

        WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        test.log(Status.INFO, "Login Button click");
        System.out.println("Valid TestCase Executed");

        test.log(Status.PASS, "Test Case Executed.");

        reports.flush();
    }

        @DataProvider(name="LoginData")

         public Object [][] data(){
             Object [][] data=new Object[3][2];

             data[0][0]="test1@gmail.com";
             data[0][1]="123467";

            data[1][0]="testemail12wwsewewq56787821@test.com";
            data[1][1]="123467";

            data[2][0]="testemail12wwsewewq5678782.com";
            data[2][1]="123467";

            return data;



        }




}
