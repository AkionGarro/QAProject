package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {
/*
    WebDriver driver = null;
    @Given("browser is opened")
    public void browser_is_opened() {
        System.out.println("Step: browser is opened");
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @And("user go to login page now")
    public void user_go_to_login_page_now() {
        driver.navigate().to("https://example.testproject.io/web/");
        System.out.println("Step: user go to login page now");
    }
    @When("^user put (.*) and (.*)$")
    public void user_put_username_and_password(String username,Integer password) throws InterruptedException {

        String nameXpath = "/html/body/div[2]/div[1]/form/div[1]/div/input";
        String passwordXpath = "/html/body/div[2]/div[1]/form/div[2]/div/input";

        driver.findElement(By.xpath(nameXpath)).sendKeys(username);
        driver.findElement(By.xpath(passwordXpath)).sendKeys((password).toString());
        Thread.sleep(2000);
        System.out.println("Step: user enters a text in search box");

    }
    @And("user click on login")
    public void user_click_on_login() {
        String loginButtonXpath = "/html/body/div[2]/div[1]/form/div[3]/button";
        driver.findElement(By.xpath(loginButtonXpath)).click();


    }
    @Then("user is redirect to home page")
    public void user_is_redirect_to_home_page() throws InterruptedException {
        Thread.sleep(2000);
        String logoutButtonXpath = "/html/body/div[2]/div[2]/form/div[6]/button[2]";
        driver.findElement(By.xpath(logoutButtonXpath)).isDisplayed();
        driver.close();
        driver.quit();


    }

 */
}
