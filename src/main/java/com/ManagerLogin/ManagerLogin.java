package com.ManagerLogin;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ManagerLogin extends BaseClass {
    public static void main(String[] args) {
        TC_Manager_login001();
    }
    public static void TC_Manager_login001(){
        WebElement UserId=driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr373431");

        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("zahyzYd");

        WebElement LoginBtn=driver.findElement(By.name("btnLogin"));
        LoginBtn.click();
    }
}
