package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps {
    WebDriver driver;

    @Given("^I am on the home page$")
    public void user_is_on_Home_Page(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/files/chromedriver2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080");
    }


    @Then("^I should see the \"([^\"]*)\" field$")
    public void iShouldSeeTheField(String fieldName) throws Throwable {
        WebElement field = driver.findElement(By.id(fieldName));
        Assert.assertEquals(true,field.isDisplayed());
    }

    @And("^I close the browser$")
    public void iCloseTheBrowser() throws Throwable {
        driver.close();
    }
}