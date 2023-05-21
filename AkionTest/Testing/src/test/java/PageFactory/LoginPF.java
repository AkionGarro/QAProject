package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {
    @FindBy(xpath = "/html/body/div[2]/div[1]/form/div[1]/div/input")
    WebElement usernameInput;

    @FindBy(xpath = "/html/body/div[2]/div[1]/form/div[2]/div/input")
    WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[2]/div[1]/form/div[3]/button")
    WebElement loginButton;


    WebDriver driver;

    public LoginPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setNameInputLoginP(String username) {
        this.usernameInput.sendKeys(username);
    }

    public void setPasswordInputLoginP(String password) {
        this.passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void validateLogin(String name, String pass){
        setNameInputLoginP(name);
        setPasswordInputLoginP(pass);

    }


}
