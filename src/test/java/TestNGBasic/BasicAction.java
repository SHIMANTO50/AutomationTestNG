package TestNGBasic;

import org.testng.annotations.*;

public class BasicAction {
    @BeforeTest
    public static void browser_config(){
        System.out.println("Browser config First");
    }
    @BeforeMethod
    public static void url_launch(){
        System.out.println("Browser Launch");
    }
    @Test
    public static void method1(){
        System.out.println("Test case 1 executed");
    }
    @AfterMethod
    public static void verification(){
        System.out.println("Verification Done");
    }

    @Test
    public static void method2(){
        System.out.println("Test case 2 executed");
    }
    @AfterTest
    public static void browser_close(){
        System.out.println("Browser close");
    }
}
