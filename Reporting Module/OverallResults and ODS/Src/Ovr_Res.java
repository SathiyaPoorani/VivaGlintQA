package maventest.maven_testng;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ovr_Res {

    public WebDriver driver;
	//public	Ovr_Res	overall;

    public Ovr_Res(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='View all Comments']")
    @CacheLookup
    private WebElement comments;

    @FindBy(how = How.XPATH, using = "(//button)[13]")
    @CacheLookup
    private WebElement ovrres;

    @FindBy(how = How.XPATH, using = "//*[@id=\"section6201cc9f-6721-455e-81d6-ddeddc88fa21\"]")
    @CacheLookup
    private WebElement scores;

    @FindBy(how=How.XPATH ,using="/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[1]/glint-survey-report-panel[1]/glint-report-panel[1]/div[2]/div[1]/div[2]/div[1]/div[1]/glint-reported-survey-list[1]/glint-reported-survey[1]/div[1]/div[2]/div[1]/div[1]/glint-survey-range-picker[1]/glint-pulse-range-picker[1]/glint-dropdown[1]/div[1]/label[1]")
    @CacheLookup
    private WebElement dropdown;

    @FindBy(how=How.XPATH,using="//button[@id='reportDetailAddSectionButton']")
    @CacheLookup
    private WebElement addsection;

    @FindBy(how=How.XPATH,using="//div[@data-id='PULSE_RESULTS']//button[@class='btnCircle btnLg btnCta glintButton']")
    @CacheLookup
    private WebElement  addsurveyresultsbtn;


    @FindBy(how=How.XPATH,using="(//li[@id='option1'])[1]")
    @CacheLookup
    private WebElement  pdfexport;

    @FindBy(how=How.XPATH,using="//button[normalize-space()='Generate PDF']")
    @CacheLookup
    private WebElement  generatepdf;

    public void clickcomments() {
        comments.click();
    }

    public void clickovrres() {
        ovrres.click();
    }

    public void Scores_ss() {
        scores.getScreenshotAs(OutputType.FILE).renameTo(new File("C:\\Users\\vkini01\\OneDrive - dentsu\\Pictures\\Saved Pictures\\test.png"));
    }

    public void clickdropdown() {
        dropdown.click();
    }

    public void clickaddsection() {
        addsection.click();
    }

    public void clickaddsurveyresultsbtn() {
        addsurveyresultsbtn.click();
    }


    public void clickreportexporttopdf(){
        pdfexport.click();
        generatepdf.click();
    }

}


