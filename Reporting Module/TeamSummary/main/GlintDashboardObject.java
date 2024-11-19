package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GlintDashboardObject {
    public WebDriver driver;

    public GlintDashboardObject(WebDriver newdriver){
         driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    @FindBy(how = How.ID, using = "tab-4")
    @CacheLookup
    WebElement reportsheading;

    @FindBy(how = How.XPATH, using = "//div[text()='Team Summary']")
    @CacheLookup
    WebElement teamsummary;

    @FindBy(how = How.XPATH, using = "//span[text()=' Ad-Hoc NLP']")
    @CacheLookup
    WebElement adhocnlp;

    public void clickReportsheading(){
        reportsheading.click();
    }
    public void clickTeamsummary(){
        teamsummary.click();
    }
    public void clickAdhocnlp(){
        adhocnlp.click();
    }

}
