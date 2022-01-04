package com.GoogleSearch;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchCity extends BaseClass {
       public static void main(String[] args) {
             //chrome_launch();
             firefox_launch();
             open_URL("https://www.google.com");
             TC_0001();
             //chrome_close();
             //firefox_close();
    }
    public static void TC_0001(){
        //WebElement Search=driver.findElement(By.name("q"));
        WebElement Search=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input"));
        Search.clear();
        Search.sendKeys("Dhaka");
        //Search.sendKeys();
        Search.sendKeys(Keys.ENTER);
    }

}
