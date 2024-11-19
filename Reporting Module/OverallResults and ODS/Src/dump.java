package maventest.maven_testng;

public class dump {
    
}

/*package maven_testng.maventest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ODS {

    public WebDriver driver;

    public ODS(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/glint-root/div/div[2]/div/glint-header/header/div[3]/div/div/ul/li[2]/a")
    @CacheLookup
    private WebElement config;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-config[1]/section[1]/glint-config-sections[1]/div[1]/div[1]/section[2]/div[1]/ul[1]/li[1]/a[1]/div[1]/vg-icon[1]/div[1]/*[name()='svg'][1]")
    @CacheLookup
    private WebElement programs;

    @FindBy(how = How.XPATH, using = "//li[@data-id='people']//div[@class='circle ng-star-inserted']")
    @CacheLookup
    private WebElement people;

    @FindBy(how =How.XPATH, using = "//button[@class='btnWithVgIcon btnExport glintButton']")
    @CacheLookup
    private WebElement pplexport;

    @FindBy(how=How.XPATH,using = "//button[@class='btnCta glintButton']")
    @CacheLookup
    private WebElement exportbtn;

    @FindBy(how = How.XPATH, using = "//div[@class='sidePane filterList ng-star-inserted']//div[1]//ul[1]//li[3]//div[1]")
    @CacheLookup
    private WebElement inacemp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[1]/ul/li[5]/div")
    @CacheLookup
    private WebElement supportemp;

    @FindBy(how = How.XPATH,using ='//*[@id=\"vg-panel1\"]/div/div/div/div[1]/glint-facet-list/div[1]/ul/li[5]/div')
    @CacheLookup
    private WebElement advuser; 

    public void clickconfig() {
        config.click();
    }
    
    public void Clickprograms() {
        programs.click();
    }

    public void clickpeople() {
        people.click();
    }

    public  void clickpplexport() {
        pplexport.click();
        exportbtn.click();
    }

    public void checkpplpagebutton() {
        inacemp.click();
        supportemp.click();
        advuser.click();

    }
}
*/