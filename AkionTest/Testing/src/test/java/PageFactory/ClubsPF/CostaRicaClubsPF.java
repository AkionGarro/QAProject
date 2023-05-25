package PageFactory.ClubsPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CostaRicaClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement zapotePicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button")
    WebElement escazuPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/button")
    WebElement herediaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[3]/div[1]/button")
    WebElement llorentePicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[5]/div[1]/div[3]/div[1]/button")
    WebElement alajuelaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[6]/div[1]/div[3]/div[1]/button")
    WebElement tresRiosPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[7]/div[1]/div[3]/div[1]/button")
    WebElement santaAnaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[8]/div[1]/div[3]/div[1]/button")
    WebElement liberiaPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public CostaRicaClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickZapotePicker( ) {
        this.zapotePicker.click();
    }

    public void clickEscazuPicker( ) {
        this.escazuPicker.click();
    }

    public void clickHerediaPicker( ) {
        this.herediaPicker.click();
    }

    public void clickLlorentePicker( ) {
        this.llorentePicker.click();
    }

    public void clickAlajuelaPicker( ) {
        this.alajuelaPicker.click();
    }

    public void clickTresRiosPicker( ) {
        this.tresRiosPicker.click();
    }

    public void clickSantaAnaPicker( ) {
        this.santaAnaPicker.click();
    }

    public void clickLiberiaPicker( ) {
        this.liberiaPicker.click();
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
            case("escazú"):
                skipPreferedClub();
                break;
            case("zapote"):
                clickZapotePicker();
                break;
            case("heredia"):
                clickHerediaPicker();
                break;
            case("llorente"):
                clickLlorentePicker();
                break;
            case("alajuela"):
                clickAlajuelaPicker();
                break;
            case("tres ríos"):
                clickTresRiosPicker();
                break;
            case("santa Ana"):
                clickSantaAnaPicker();
                break;
            case("liberia"):
                clickLiberiaPicker();
                break;
            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
