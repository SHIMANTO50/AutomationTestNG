package com.OpenCart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchProduct extends BaseClass {
    public static void main(String[] args) {
        launch_browser("chrome");
        open_URL("https://demo.opencart.com/");
        TC_Search_001();
    }
    public static void TC_Search_001(){

        WebElement Search=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        Search.clear();
        Search.sendKeys("iphone");

        WebElement SearchBtn=driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i"));
        SearchBtn.click();

    }
}
