package com.OpenCart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class AddCart extends BaseClass {
    public static void main(String[] args) {
        launch_browser("chrome");
        open_URL("https://demo.opencart.com");
        TC_AddCartOption_003();

    }
    public static void TC_AddCartOption_003(){
          driver.manage().deleteAllCookies();
//        WebElement LaptopNoteBook= driver.findElement(By.linkText("Laptops & Notebooks"));
//        LaptopNoteBook.click();
//
//        WebElement ShowAllLaptops = driver.findElement(By.linkText("Show All Laptops & Notebooks"));
//        ShowAllLaptops.click();
//
//        WebElement AddtoCartLaptopHP = driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]"));
//        AddtoCartLaptopHP.click();
//
//        WebElement DeliveryDate= driver.findElement(By.xpath("//*[@id=\"input-option225\"]"));
//        DeliveryDate.click();
        //DeliveryDate.sendKeys("2021-11-22");

        WebElement AddtoCartClick= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]"));
        AddtoCartClick.click();

        WebElement ItemOption= driver.findElement(By.id("cart-total"));
        ItemOption.click();
//        Actions action= new Actions(driver);
//        action.moveToElement(ItemOption).perform();


    }
}
