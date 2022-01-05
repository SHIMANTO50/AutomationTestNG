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

    @BeforeClass
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register");
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
    @Test(dataProvider = "Registration_Data")
    public static void valid_TestCase(String firstName,
                                      String lastName,
                                      String email,
                                      String Telephone,
                                      String Password,
                                      String ConfirmPassword){

        //Implement Extent Report
        htmlReporter =new ExtentHtmlReporter("./ExtentReports/DP_Registration4.html");
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
        test.log(Status.INFO, "FirstName Type"+firstName);

        WebElement LastName= driver.findElement(By.id("input-lastname"));
        LastName.clear();
        LastName.sendKeys(lastName);
        test.log(Status.INFO, "LastName Type"+lastName);

        WebElement Email= driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(email);
        test.log(Status.INFO, "Email Type"+email);


        WebElement telephone= driver.findElement(By.id("input-telephone"));
        telephone.clear();
        telephone.sendKeys(Telephone);
        test.log(Status.INFO, "Telephone Type"+Telephone);

        WebElement password= driver.findElement(By.id("input-password"));
        password.clear();
        password.sendKeys(Password);
        test.log(Status.INFO, "Password Type"+Password);

        WebElement PasswordConfirm= driver.findElement(By.id("input-confirm"));
        PasswordConfirm.clear();
        PasswordConfirm.sendKeys(ConfirmPassword);
        test.log(Status.INFO, "ConfirmPassword Type"+ConfirmPassword);

        WebElement PrivacyPolicy= driver.findElement(By.name("agree"));
        PrivacyPolicy.click();
        test.log(Status.INFO, "PrivacyPolicy check");

        WebElement Continue= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        Continue.click();
        test.log(Status.INFO, "Continue Button Click");



        reports.flush();
    }


    @DataProvider(name="Registration_Data")
    public Object [][] data(){

        Object [][] data=new Object[2][6];

        //set 1
        data [0][0]="Tuesday";
        data [0][1]="World";
        data [0][2]="tuesday@test.com";
        data [0][3]="123123212";
        data [0][4]="12345678";
        data [0][5]="12345678";

        //set 2
        data [1][0]="Friday";
        data [1][1]="Planet";
        data [1][2]="friday@test.com";
        data [1][3]="1231235612";
        data [1][4]="12342132";
        data [1][5]="123421311";

        return data;
    }

}
