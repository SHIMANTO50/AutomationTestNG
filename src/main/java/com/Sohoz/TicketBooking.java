package com.Sohoz;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TicketBooking extends BaseClass {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("https://www.shohoz.com/bus-tickets");
        TC_TicketBooking_001();
    }
    public static void TC_TicketBooking_001(){
        WebElement From=driver.findElement(By.id("dest_from"));
        From.clear();
        From.sendKeys("Dhaka");

        WebElement To=driver.findElement(By.id("dest_to"));
        To.clear();
        To.sendKeys("Chittagong");

        WebElement PickDate=driver.findElement(By.id("doj"));
        PickDate.click();
        PickDate.sendKeys("30-Dec-2021");


//        WebElement DateOfReturn=driver.findElement(By.id("dor"));
//        DateOfReturn.click();
    }


}
