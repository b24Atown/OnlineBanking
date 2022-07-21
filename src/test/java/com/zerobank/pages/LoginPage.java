package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement signInBtn;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMsg;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInBtn.click();
    }

}
