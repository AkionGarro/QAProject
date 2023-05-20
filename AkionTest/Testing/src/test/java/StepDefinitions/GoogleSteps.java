package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.Kernel;
import java.util.concurrent.TimeUnit;

public class GoogleSteps {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Step: browser is open");
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.navigate().to("https://google.com");
        System.out.println("Step: user is on google search page");
    }
    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
        String xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea";
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Automation Step by Step");
        Thread.sleep(2000);
        System.out.println("Step: user enters a text in search box");
    }
    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        System.out.println("Step: hits enter" );
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() throws InterruptedException {
        System.out.println("Step: user is navigated to search results");
        driver.getPageSource().contains("Online Courses");
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }


}
