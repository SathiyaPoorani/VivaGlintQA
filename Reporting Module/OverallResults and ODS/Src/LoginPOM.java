
//POM Page for Login Page Locators
package maventest.maven_testng;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class LoginPOM {

    public WebDriver driver;

    public LoginPOM(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    // Locators Declaration
    @FindBy(how = How.ID, using = "email")
    @CacheLookup
    private WebElement emailId;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/glint-session-root[1]/div[1]/glint-session-client[1]/form[1]/section[1]/input[1]")
    @CacheLookup
    private WebElement clientId;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@class='btnCta glintButton']")
    @CacheLookup
    private WebElement continueButton;
    
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    @CacheLookup
    private WebElement submitbutton;
    
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue']")
    @CacheLookup
    private WebElement	submitpass;
    
    @FindBy(how =How.XPATH, using = "/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/glint-header[1]/header[1]/div[3]/div[1]/glint-nav[1]/nav[1]/glint-tabs[1]/div[1]/ul[1]/li[5]/a[1]")
    @CacheLookup
    private WebElement reportsbutton;
    
    //@FindBy(how = How.XPATH, using = "")
    

    public void enterEmailId(String email) {
        emailId.sendKeys(email);
    }

    public void enterClientId(String cid) {
        clientId.sendKeys(cid);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickContinueButton() {
        continueButton.click();
    }
    
    public void clicksubmitButton() {
    	submitbutton.click();
    }
    
    public void clickpasssubmitButton() {
    	submitpass.click();
    }
    
    public void clickreportsbutton() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        reportsbutton.click();
    }
}