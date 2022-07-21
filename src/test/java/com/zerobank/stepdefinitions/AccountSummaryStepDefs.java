package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefs {

    @Then("Account summary page should have the following account types:")
    public void account_summary_page_should_have_the_following_account_types(List<String> expectedAccountTypes) {
        List<WebElement> accountElements = new AccountSummaryPage().accounts;
        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountElements);

        Assert.assertEquals("Account types are not as expected",expectedAccountTypes,actualAccountTypes);
    }
    @Then("Credit Accounts table must have columns:")
    public void credit_accounts_table_must_have_columns(List<String> expectedColumns) {

        List<String> actualColumnNames = BrowserUtils.getElementsText(new AccountSummaryPage().creditColumns);
        Assert.assertEquals("Columns are not as expected",expectedColumns,actualColumnNames);

    }

}
