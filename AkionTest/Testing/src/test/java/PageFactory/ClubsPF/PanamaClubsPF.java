package PageFactory.ClubsPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PanamaClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement viaBrasilPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button")
    WebElement elDoradoPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/button")
    WebElement davidPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[3]/div[1]/button")
    WebElement brisasPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[5]/div[1]/div[3]/div[1]/button")
    WebElement costaVerdePicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[6]/div[1]/div[3]/div[1]/button")
    WebElement santiagoDeVeraguasPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[7]/div[1]/div[3]/div[1]/button")
    WebElement metroParkPicker;



    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public PanamaClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickViaBrasilPicker( ) {
        this.viaBrasilPicker.click();
    }

    public void clickElDoradoPicker( ) {
        this.elDoradoPicker.click();
    }

    public void clickDavidPicker( ) {
        this.davidPicker.click();
    }

    public void clickBrisasPicker( ) {
        this.brisasPicker.click();
    }

    public void clickCostaVerdePicker( ) {
        this.costaVerdePicker.click();
    }

    public void clickSantiagoDeVeraguasPicker( ) {
        this.santiagoDeVeraguasPicker.click();
    }

    public void clickMetroParkPicker( ) {
        this.metroParkPicker.click();
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
            case("vía brasil"):
                skipPreferedClub();
                break;
            case("el dorado"):
                clickElDoradoPicker();
                break;
            case("david"):
                clickDavidPicker();
                break;
            case("brisas"):
                clickBrisasPicker();
                break;
            case("costa verde"):
                clickCostaVerdePicker();
                break;
            case("santiago de veraguas"):
                clickSantiagoDeVeraguasPicker();
                break;
            case("metro park"):
                clickMetroParkPicker();
                break;

            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
