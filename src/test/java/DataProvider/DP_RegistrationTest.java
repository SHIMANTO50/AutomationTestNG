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

public class DP_RegistrationTest {
    public static WebDriver driver;

    //Extent report
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeSuite
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        System.out.println("Before Suite Executed.");
    }
    @AfterSuite
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
    @Test(dataProvider = "Registration_Data")
    public static void valid_TestCase(String firstName,
                                      String lastName,
                                      String email,
                                      String Telephone,
                                      String Password,
                                      String ConfirmPassword){

        //Implement Extent Report
        htmlReporter =new ExtentHtmlReporter("./ExtentReports/DP_Registration.html");
        reports=new ExtentReports();
        reports.attachReporter(htmlReporter);

        //Information add to Report
        reports.setSystemInfo("Project Name","Opencart");
        reports.setSystemInfo("Module Name","Login");
        reports.setSystemInfo("Browser","Chrome");
        reports.setSystemInfo("Test by","Tanjimul");

        test=reports.createTest("Registration test");

        //Registration code
        WebElement FirstName= driver.findElement(By.id("input-firstname"));
        FirstName.clear();
        FirstName.sendKeys(firstName);

        WebElement LastName= driver.findElement(By.id("input-lastname"));
        LastName.clear();
        LastName.sendKeys(lastName);

        WebElement Email= driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(email);


        WebElement telephone= driver.findElement(By.id("input-telephone"));
        telephone.clear();
        telephone.sendKeys(Telephone);

        WebElement password= driver.findElement(By.id("input-password"));
        password.clear();
        password.sendKeys(Password);

        WebElement PasswordConfirm= driver.findElement(By.id("input-confirm"));
        PasswordConfirm.clear();
        PasswordConfirm.sendKeys(ConfirmPassword);

        WebElement PrivacyPolicy= driver.findElement(By.name("agree"));
        PrivacyPolicy.click();

        WebElement Continue= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        Continue.click();



        reports.flush();
    }


    @DataProvider(name="Registration_Data")
    public Object [][] data(){

        Object [][] data=new Object[2][6];

        //set 1
        data [0][0]="Earth";
        data [0][1]="World";
        data [0][2]="earth@test.com";
        data [0][3]="123123";
        data [0][4]="12345";
        data [0][5]="123456";

        //set 2
        data [1][0]="Moon";
        data [1][1]="Planet";
        data [1][2]="moon@test.com";
        data [1][3]="123123";
        data [1][4]="123421";
        data [1][5]="123456";

        return data;
    }

}
