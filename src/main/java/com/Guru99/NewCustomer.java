package com.Guru99;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomer extends BaseClass {
    public static void main(String[] args) {
        //chrome_launch();
        launch_browser("firefox");
        open_URL("http://demo.guru99.com/V4/");
        GuruLogin.managerLogin("mngr373431","zahyzYd");
        TC_NewCustomer_001();
    }
    public static void TC_NewCustomer_001(){

        WebElement CustomerLink= driver.findElement(By.linkText("New Customer"));
        CustomerLink.click();

        WebElement CustomerName=driver.findElement(By.name("name"));
        CustomerName.clear();
        CustomerName.sendKeys("tanjimul");

         WebElement CustomerGender=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
        //WebElement CustomerGender=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]"));
        CustomerGender.click();


        WebElement Dob= driver.findElement(By.id("dob"));
        Dob.click();
        Dob.sendKeys("2021-10-26");

        WebElement CustomerAddress=driver.findElement(By.name("addr"));
        CustomerAddress.clear();
        CustomerAddress.sendKeys("Dhaka");

        WebElement City=driver.findElement(By.name("city"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State=driver.findElement(By.name("state"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement PIN=driver.findElement(By.name("pinno"));
        PIN.clear();
        PIN.sendKeys("123456");

        WebElement MobileNumber=driver.findElement(By.name("telephoneno"));
        MobileNumber.clear();
        MobileNumber.sendKeys("01711454539");

        WebElement Email=driver.findElement(By.name("emailid"));
        Email.clear();
        Email.sendKeys("tanjimul789@gmail.com");

        WebElement CustomerPassword=driver.findElement(By.name("password"));
        CustomerPassword.clear();
        CustomerPassword.sendKeys("1234567");

        WebElement SubmitBtn=driver.findElement(By.name("sub"));
        SubmitBtn.click();



    }
}
