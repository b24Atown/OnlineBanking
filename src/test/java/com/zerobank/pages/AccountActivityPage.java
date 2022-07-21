package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement accountDropdown;

    @FindBy(xpath = "//tr/th")
    public List<WebElement> accountColumnNames;

    public String selectedOption(){
        Select accountOptions = new Select(accountDropdown);
        return accountOptions.getFirstSelectedOption().getText();
    }

    public List<String> accountOptions(){
        Select accountOptions = new Select(accountDropdown);
        return BrowserUtils.getElementsText(accountOptions.getOptions());
    }
}
