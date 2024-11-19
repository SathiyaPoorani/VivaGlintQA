package glintReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GlintReportsLogin {
	
	
	public WebDriver driver;

	@BeforeMethod
	public void open() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("qatester@glintinc.com");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-auth/form/section/footer/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("clientUuid")).sendKeys("qa20230121");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-client/form/section/footer/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Dem0@pass2");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-login/form/section/footer")).click();
		Thread.sleep(30000);
	}

	@Test
	public void TC_001() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option4")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class=\"inlineBtn glintButton\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnIcon slideyClose glintButton']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void TC_002() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
	 	Thread.sleep(2000);
		driver.findElement(By.id("option4")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Question Responses")).click();
		WebElement uploadElement = driver.findElement(By.cssSelector(".list>li"));
		uploadElement.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/glint-root[1]/div[1]/div[1]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/section[1]/glint-survey-report-panel[1]/glint-report-panel[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/glint-survey-filters-list[1]/glint-advanced-survey-filters[1]/div[1]/div[1]/glint-survey-filters[1]/glint-add-filter[1]/glint-filter-editor[1]/div[1]/glint-filter-editor-filter-values[1]/fieldset[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/glint-root[1]/div[1]/div[1]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/section[1]/glint-survey-report-panel[1]/glint-report-panel[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/glint-survey-filters-list[1]/glint-advanced-survey-filters[1]/div[1]/div[1]/glint-survey-filters[1]/glint-add-filter[1]/glint-filter-editor[1]/div[1]/glint-filter-editor-filter-values[1]/fieldset[1]/div[4]/label[1]/input[1]")).click();
		Thread.sleep(4000);
	
	
	}
	@Test
	public void TC_003() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Recurring ETL')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dropdownTrigger_glintDropdown_76215f05-14e9-4414-aba9-44ea2e630848\"]/vg-icon[2]/div")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("option2")).click();
		driver.findElement(By.id("btnWithVgIcon subtleBtn glintButton ng-star-inserted")).click();
		
		
		
	}
	
	@Test
	public void TC_004() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='btnWithVgIcon btnSlim glintButton ng-star-inserted']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"configureSection\"]/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-form/form/div/div/div[2]/label/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnCta glintButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dropdownTrigger_glintDropdown_d0326e97-aa9b-4d82-b155-d8b8b031821f")).click();
		
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='inlineBtnLink glintButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnIcon slideyClose glintButton']")).click();
		
	}
	@Test
	
	
	public void TC_005() throws InterruptedException {
	driver.findElement(By.linkText("Reports")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-report-landing[1]/glint-reports[1]/glint-panel[1]/div[1]/div[1]/div[1]/div[1]/glint-facet-list[1]/div[2]/ul[1]/li[3]/div[1]/span[1]/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[2]/glint-report-header[1]/div[1]/div[1]/div[1]/div[1]/glint-report-template-tools[1]/glint-dropdown[2]/div[1]/div[1]/div[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[2]/glint-report-header[1]/div[1]/div[1]/div[1]/div[1]/glint-report-template-tools[1]/glint-dropdown[2]/div[1]/div[1]/div[2]/ul[1]/li[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[2]/glint-report-header[1]/div[1]/div[1]/div[1]/div[1]/glint-report-template-tools[1]/glint-report-export-pdf-dialog[1]/glint-dialog[1]/div[1]/div[2]/footer[1]/button[1]")).click();
	}}
@Test

public void TC_006() throws InterruptedException {
driver.findElement(By.linkText("Reports")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-report-landing[1]/glint-reports[1]/glint-panel[1]/div[1]/div[1]/div[1]/div[1]/glint-facet-list[1]/div[2]/ul[1]/li[3]/div[1]/span[1]/span[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[2]/glint-report-header[1]/div[1]/div[1]/div[1]/div[1]/glint-report-template-tools[1]/glint-dropdown[2]/div[1]/div[1]/div[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[2]/glint-report-header[1]/div[1]/div[1]/div[1]/div[1]/glint-report-template-tools[1]/glint-dropdown[2]/div[1]/div[1]/div[2]/ul[1]/li[5]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[2]/glint-report-header[1]/div[1]/div[1]/div[1]/div[1]/glint-report-template-tools[1]/glint-report-save-dialog[1]/glint-dialog[1]/div[1]/div[2]/footer[1]/button[2]")).click();

	}
	
	
//	@AfterMethod
//	public void close(){
//		driver.quit();
//	}
	
	
	
	
	
	

