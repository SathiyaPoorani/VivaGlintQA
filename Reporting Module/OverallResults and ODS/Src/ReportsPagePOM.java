package maventest.maven_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReportsPagePOM {
	
	public WebDriver driver;
	public	ReportsPagePOM	report;
	
	public ReportsPagePOM(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }
	
	//Locators Declaration
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-report-landing[1]/glint-reports[1]/glint-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/glint-report-tile-list[1]/ul[1]/li[1]/button[1]")
    @CacheLookup
    private WebElement execsummary;
	
	@FindBy(how =How.XPATH, using = "/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-report-landing[1]/glint-reports[1]/glint-panel[1]/div[1]/div[1]/div[1]/div[1]/glint-facet-list[1]/div[2]/ul[1]/li[4]/div[1]")
	@CacheLookup
	private WebElement	changeprogram;

	@FindBy(how = How.XPATH, using = "//li[2]//button[1]")
	@CacheLookup
	private WebElement heatmapreport;
	
	@FindBy(how = How.ID, using = "reportOverflowDropdown")
	@CacheLookup
	private WebElement morebutton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"reportDetailHeader\"]/glint-report-header/div/div/div[1]/div/glint-report-template-tools/button")
	@CacheLookup
	private WebElement settings;
	
	@FindBy(how= How.ID, using="reportExportDropdown")
	@CacheLookup
	private WebElement reportexportbutton;
	
	public void clickexecsummary() {
        execsummary.click();
    }
	
	public void clickchangeprogram() {
		changeprogram.click();
		changeprogram.click();
	}
	
	public void clickhmap() {
		heatmapreport.click();
	}
	
	public void moreclick() {
		morebutton.click();
	}
	
	public void settingsbutton() {
		settings.click();
	}

	public void reportexport(){
		reportexportbutton.click();
	}
}

