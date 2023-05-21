package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    protected WebDriver driver;
    private By nameInputLoginP = By.xpath("/html/body/div[2]/div[1]/form/div[1]/div/input");
    private By passwordInputLoginP = By.xpath("/html/body/div[2]/div[1]/form/div[2]/div/input");
    private By loginButtonLoginP = By.xpath("/html/body/div[2]/div[1]/form/div[3]/button");

    private By logoutButtonLoginP = By.xpath("/html/body/div[2]/div[2]/form/div[6]/button[2]");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setNameInputLoginP(String username) {
       this.driver.findElement(nameInputLoginP).sendKeys(username);
    }

    public void setPasswordInputLoginP(String password) {
        this.driver.findElement(passwordInputLoginP).sendKeys(password);
    }

    public void clickLoginButton() {
        this.driver.findElement(loginButtonLoginP).click();
    }

    public void validateLogin(String name, String pass){
        setNameInputLoginP(name);
        setPasswordInputLoginP(pass);

    }
    public void logoutButtonIsDesplayed(){
        this.driver.findElement(logoutButtonLoginP).isDisplayed();
    }



}
