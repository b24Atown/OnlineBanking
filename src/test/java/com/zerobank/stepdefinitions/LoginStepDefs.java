package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("signin_button")).click();
    }
    @Given("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("User should be able to see {string} page")
    public void user_should_be_able_to_see_page(String pageName) {
        Assert.assertTrue("Page title is mismatching",Driver.getDriver().getTitle().contains(pageName));
        //second way to verify which tab youre at
        String selectedTab = new BasePage().selectedTab.getText();
        Assert.assertEquals("Page is not matching",pageName,selectedTab);

    }

    @Then("User should see {string} message")
    public void userShouldSeeMessage(String expectedText) {
        Assert.assertEquals(expectedText,loginPage.errorMsg.getText());
    }
}
