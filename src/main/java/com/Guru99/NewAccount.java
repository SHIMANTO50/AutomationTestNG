package com.Guru99;

import com.Base.BaseClass;
import com.ManagerLogin.ManagerLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccount extends BaseClass {
    public static void main(String[] args) {
        //chrome_launch();
        launch_browser("chrome");
        open_URL("http://demo.guru99.com/V4/");
        GuruLogin.managerLogin("mngr373431","zahyzYd");
        TC_NewAccountCustomer_001();
    }
    public static void TC_NewAccountCustomer_001(){

        WebElement CustomerNewAccount= driver.findElement(By.linkText("New Account"));
        CustomerNewAccount.click();

        WebElement CustomerId=driver.findElement(By.name("cusid"));
        CustomerId.clear();
        CustomerId.sendKeys("5400");

        WebElement AccountTypeDropDown=driver.findElement(By.name("selaccount"));
        Select sel=new Select(AccountTypeDropDown);
        sel.selectByVisibleText("Current");

        WebElement InitialDeposit=driver.findElement(By.name("inideposit"));
        InitialDeposit.clear();
        InitialDeposit.sendKeys("50000");

        WebElement Submit= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
        Submit.click();
    }
}
