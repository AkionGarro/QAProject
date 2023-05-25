package PageFactory.ClubsPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ColombiaClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement bucaramangaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button")
    WebElement barranquillaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/button")
    WebElement caliCañasgordasPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[3]/div[1]/button")
    WebElement caliMengaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[5]/div[1]/div[3]/div[1]/button")
    WebElement pereiraPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[6]/div[1]/div[3]/div[1]/button")
    WebElement bogotaSalitrePicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[7]/div[1]/div[3]/div[1]/button")
    WebElement medellinPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[8]/div[1]/div[3]/div[1]/button")
    WebElement chiaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[9]/div[1]/div[3]/div[1]/button")
    WebElement bogotaUsaquenPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public ColombiaClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickBucaramangaPicker( ) {
        this.bucaramangaPicker.click();
    }

    public void clickBarranquillaPicker( ) {
        this.barranquillaPicker.click();
    }

    public void clickCaliCañasgordasPicker( ) {
        this.caliCañasgordasPicker.click();
    }

    public void clickCaliMengaPicker( ) {
        this.caliMengaPicker.click();
    }

    public void clickPereiraPicker( ) {
        this.pereiraPicker.click();
    }

    public void clickBogotaSalitrePickerr( ) {
        this.bogotaSalitrePicker.click();
    }

    public void clickMedellinPicker( ) {
        this.medellinPicker.click();
    }

    public void clickChiaPicker( ) {
        this.chiaPicker.click();
    }
    public void clickBogotaUsaquenPicker( ) {
        this.bogotaUsaquenPicker.click();
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
            case("bucaramanga"):
                clickBucaramangaPicker();
                break;
            case("barranquilla"):
                skipPreferedClub();
                break;
            case("cali cañasgordas"):
                clickCaliCañasgordasPicker();
                break;
            case("cali menga"):
                clickCaliMengaPicker();
                break;
            case("pereira"):
                clickPereiraPicker();
                break;
            case("bogotá salitre"):
                clickBogotaSalitrePickerr();
                break;
            case("medellín"):
                clickMedellinPicker();
                break;
            case("chía"):
                clickChiaPicker();
                break;
            case("bogotá usaquén"):
                clickBogotaUsaquenPicker();
                break;
            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
