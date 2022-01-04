package com.Guru99;

import com.Base.BaseClass;
import com.ManagerLogin.ManagerLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FundTransfer extends BaseClass {
    public static void main(String[] args) {
        //chrome_launch();
        launch_browser("chrome");
        open_URL("http://demo.guru99.com/V4/");
        GuruLogin.managerLogin("mngr373431","zahyzYd");
        TC_FundTransferMoney_001();
    }
    public static void TC_FundTransferMoney_001(){
        WebElement FundTransferUrl= driver.findElement(By.linkText("Fund Transfer"));
        FundTransferUrl.click();

        WebElement PayersAccountNo=driver.findElement(By.name("payersaccount"));
        PayersAccountNo.clear();
        PayersAccountNo.sendKeys("102237");

        WebElement PayeesAccountNo=driver.findElement(By.name("payeeaccount"));
        PayeesAccountNo.clear();
        PayeesAccountNo.sendKeys("102288");

        WebElement FundTransferAmount=driver.findElement(By.name("ammount"));
        FundTransferAmount.clear();
        FundTransferAmount.sendKeys("10000");

        WebElement FundTransferDescription=driver.findElement(By.name("desc"));
        FundTransferDescription.clear();
        FundTransferDescription.sendKeys("10000tk");

        WebElement FundTransferSubmit= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]"));
        FundTransferSubmit.click();
    }
}
