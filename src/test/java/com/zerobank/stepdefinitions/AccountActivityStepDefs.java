package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("User navigates to {string} tab")
    public void user_navigates_to_tab(String tab) {
        accountActivityPage.getTab(tab);
    }

    @Then("Account dropdown should have {string} selected")
    public void account_dropdown_should_have_selected(String expectedAccountType) {
       String actualAccountType = accountActivityPage.selectedOption();
       Assert.assertEquals(expectedAccountType,actualAccountType);
    }

    @Then("Account dropdown should have the following options")
    public void account_dropdown_should_have_the_following_options(List<String> expectedAccountList) {
        List<String> actualAccountList = accountActivityPage.accountOptions();
        Assert.assertEquals(expectedAccountList,actualAccountList);
    }

    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> expectedColumnNames) {
        List<String> actualColumnNames = BrowserUtils.getElementsText(accountActivityPage.accountColumnNames);
        Assert.assertEquals(expectedColumnNames,actualColumnNames);

    }
}
