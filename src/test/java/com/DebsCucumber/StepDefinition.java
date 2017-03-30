package com.DebsCucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 16/03/2017.
 */
public class StepDefinition {

      WebDriver driver = null;


    @Given("^I am able to see  Debenhams web page$")
    public void i_am_able_to_see_Debenhams_web_page() throws Throwable {
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\ZLATAN\\geckodriver.exe");
       // driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\ZLATAN\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.debenhams.com/");
      //  String Debenhams = driver.getTitle();
      //  Assert.assertTrue(Debenhams.contains("Fashion, Beauty, Gifts, Furniture & Electricals "));


    }

    @When("^I am able to sign In from landing page$")
    public void i_am_able_to_sign_In_from_landing_page() throws Throwable {
        driver.findElement(By.id("headerLogin")).click();

    }

    @And("^I log in with valid Email and password \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_log_in_with_valid_Email_and_password_and(String uname, String pword) throws Throwable {
        driver.findElement(By.name("logonId")).sendKeys(uname);
        driver.findElement(By.id("confirm")).sendKeys(pword);
        driver.findElement(By.id("WC_AccountDisplay_links_2")).click();

    }

    @And("^I am presented with user account with welcome greetings \"([^\"]*)\"$")
    public void i_am_presented_with_user_account_with_welcome_greetings(String LoginMessage) throws Throwable {
       // WebElement element = driver.findElement(By.id("no-bg-myacc"));
       // assert element.getText().equals("My account");
       // String welcomemessage = driver.getTitle();
       // Assert.assertTrue(welcomemessage.contains("My account "));
        assert (driver.findElement(By.id("no-bg-myacc"))).isDisplayed();


    }

    @Then("^user able to  log out successfully by clicking signout$")
    public void user_able_to_log_out_successfully_by_clicking_signout() throws Throwable {
       // WebElement elem = driver.findElement(By.className("sh-itemLink"));
       // Wait.until(ExpectedConditions.visibilityOf((elem)));
       driver.findElement(By.className("sh-itemLink")).click();


      driver.quit();
    }







}
