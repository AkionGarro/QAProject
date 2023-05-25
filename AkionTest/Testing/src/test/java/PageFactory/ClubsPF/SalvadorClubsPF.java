package PageFactory.ClubsPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SalvadorClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement santaElenaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button")
    WebElement losHeroesPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/button")
    WebElement sanMiguelPicker;


    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public SalvadorClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickSantaElenaPicker( ) {
        this.santaElenaPicker.click();
    }

    public void clicklosHeroesPicker( ) {
        this.losHeroesPicker.click();
    }

    public void clicksanMiguelPicker( ) {
        this.sanMiguelPicker.click();
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
            case("santa elena"):
                skipPreferedClub();

                break;
            case("los héroes"):
                clicklosHeroesPicker();
                break;
            case("san miguel"):
                clicksanMiguelPicker();
                break;

            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
