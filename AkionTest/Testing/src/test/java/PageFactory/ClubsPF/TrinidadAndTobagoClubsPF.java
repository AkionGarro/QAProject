package PageFactory.ClubsPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TrinidadAndTobagoClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement chaguanasPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button")
    WebElement portOfSpainPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/button")
    WebElement mausicaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[3]/div[1]/button")
    WebElement sanFernandoPicker;


    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public TrinidadAndTobagoClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickChaguanasPicker( ) {
        this.chaguanasPicker.click();
    }

    public void clickPortOfSpainPicker( ) {
        this.portOfSpainPicker.click();
    }

    public void clickMausicaPicker( ) {
        this.mausicaPicker.click();
    }

    public void clickSanFernandoPicker( ) {
        this.sanFernandoPicker.click();
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
            case("chaguanas"):
                skipPreferedClub();
                break;
            case("port of spain"):
                clickPortOfSpainPicker();
                break;
            case("mausica"):
                clickMausicaPicker();
                break;
            case("san fernando"):
                clickSanFernandoPicker();
                break;

            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
