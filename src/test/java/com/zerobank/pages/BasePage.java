package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "active")
    public WebElement selectedTab;

    public void getTab(String tab){
        Driver.getDriver().findElement(By.linkText(tab)).click();
    }
}
