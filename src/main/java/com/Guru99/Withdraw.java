package com.Guru99;

import com.Base.BaseClass;
import com.ManagerLogin.ManagerLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Withdraw extends BaseClass {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("http://demo.guru99.com/V4/");
        ManagerLogin.TC_Manager_login001();
        TC_WithdrawMoney_001();
    }
    public static void TC_WithdrawMoney_001(){

        WebElement WithdrawalMoney= driver.findElement(By.linkText("Withdrawal"));
        WithdrawalMoney.click();

        WebElement WithdrawAccountNo=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
        WithdrawAccountNo.clear();
        WithdrawAccountNo.sendKeys("102237");

        WebElement Amount=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input"));
        Amount.clear();
        Amount.sendKeys("10000");

        WebElement WithdrawDescription=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"));
        WithdrawDescription.clear();
        WithdrawDescription.sendKeys("10000tk");

        WebElement WithdrawSubmit= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]"));
        WithdrawSubmit.click();
    }
}
