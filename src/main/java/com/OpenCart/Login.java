package com.OpenCart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login extends BaseClass {
    public static void main(String[] args) {
        launch_browser("firefox");
        open_URL("https://demo.opencart.com/");
        TC_Login_001();
    }
    public static void TC_Login_001(){

        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login=driver.findElement(By.linkText("Login"));
        Login.click();


        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(TestEmail);

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();

//        WebElement MyAccountLogout= driver.findElement(By.linkText("Logout"));
//        MyAccountLogout.click();

        driver .navigate().to("https://demo.opencart.com/index.php?route=common/home");


    }
}
