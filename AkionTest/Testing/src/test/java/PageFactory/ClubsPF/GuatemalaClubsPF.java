package PageFactory.ClubsPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GuatemalaClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement arandaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button")
    WebElement miraFloresPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/button")
    WebElement praderaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[3]/div[1]/button")
    WebElement fraijanesPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[5]/div[1]/div[3]/div[1]/button")
    WebElement sanCristobalPicker;


    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public GuatemalaClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickArandaPicker( ) {
        this.arandaPicker.click();
    }

    public void clickMiraFloresPicker( ) {
        this.miraFloresPicker.click();
    }

    public void clickPraderaPicker( ) {
        this.praderaPicker.click();
    }

    public void clickFraijanesPicker( ) {
        this.fraijanesPicker.click();
    }

    public void clickSanCristobalPicker( ) {
        this.sanCristobalPicker.click();
    }


    public void skipPreferedClub(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div/div/div/div/div/div/div[1]/button")));
        WebElement modalAcceptButton = driver.findElement(
                By.xpath("/html/body/form/div/div/div/div/div/div/div[1]/button"));
        modalAcceptButton.click();
    }
    public void pickClub(String club){

        club = club.toLowerCase();
        clickClubPicker();
        switch (club){
            case("aranda"):
                clickArandaPicker();
                break;
            case("miraflores"):
                skipPreferedClub();
                break;
            case("pradera"):
                clickPraderaPicker();
                break;
            case("fraijanes"):
                clickFraijanesPicker();
                break;
            case("san cristóbal"):
                clickSanCristobalPicker();
                break;
            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
