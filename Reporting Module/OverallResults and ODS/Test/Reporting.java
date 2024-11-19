
package testcase;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Conftest.confi;

public class Reporting extends confi{
	
	private static final String SCREENSHOT_PATH = System.getProperty("user.dir") + "/test-output/screenshots/";
	private WebDriverWait wait;

	@BeforeClass
		public void setupClass() {
        // Create screenshots directory if it doesn't exist
        new File(SCREENSHOT_PATH).mkdirs();
		}
    
	
	@BeforeMethod


		public void launchBrowser() throws InterruptedException 
			{
				openBrowser();
    			LoginCredentials();
    			pChanging();

			}
	
 	@AfterMethod
    	public void tearDown(ITestResult result) {
        // Take screenshot on test failure
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot("FAILED_" + result.getName());
        }
        
        if (driver != null) {
            driver.quit();
        }
    }
    
	private void takeScreenshot(String baseFileName) {
        try {
           
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String fileName = baseFileName + "_" + timestamp + ".png";
            
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File(SCREENSHOT_PATH + fileName);
            screenshot.renameTo(destination);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



@Test(description ="Test Case to Click Executive Summary Report and Heatmap Report", groups={"smoke"})

//Test Case to Click Executive Summary Report and Heatmap Report
public void openReports() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//ProgramChanging();
	Thread.sleep(5000);
	ExecSummary();
	driver.navigate().back();
	Heatmap();
	driver.navigate().back();
} 

@Test(description ="Test Case to click more button", groups={"smoke"})
//Test Case to click more button
public void TC_02() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	ExecSummary();
	moree();
	Thread.sleep(5000);
	driver.quit();
}

@Test(description ="Test Case to click settings button", groups={"smoke"})
//Test Case to click settings button
public void TC_03() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	ExecSummary();
	SettingsButton();
}

@Test(description ="Test Case to click export button", groups={"smoke"})
//Test Case to click export button
public void TC_04() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	ExecSummary();
	ReportExport();
	driver.quit();
}


@Test(description ="Test Case to Open Comments", groups={"smoke"})

public void TC_05() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	OpenComments();
	driver.quit();
}

@Test(description ="Test Case to open overall results", groups={"smoke"})

public void TC_06() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	OpenOvr();
	takeScreenshot(SCREENSHOT_PATH + "OVR");
	Thread.sleep(5000);
	driver.quit();
}

@Test(description ="Test Case to open dropdown", groups={"smoke"})
public void TC_07() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	OpenOvr();
	ClickDropdown();
	takeScreenshot(SCREENSHOT_PATH + "Dropdown");
	Thread.sleep(5000);
	driver.quit();
}

@Test(description ="Test Case to click add section", groups={"smoke"})
public void TC_08() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	OpenOvr();
	Clickaddsection();
	driver.quit();
}

@Test(description ="Test Case to click add section and close", groups={"smoke"})
public void TC_09() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	OpenOvr();
	Clickaddsection();
	Clickaddsurveyresultsbtn();
	Thread.sleep(3000);
	driver.quit();
}

@Test(description ="Test Case to click add section and export", groups={"smoke"})
public void TC_10() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	OpenOvr();
	Clickaddsection();
	Clickaddsurveyresultsbtn();
	Thread.sleep(3000);
	ReportExport();
	ClickreportexporttoPDF();
	Thread.sleep(8000);
	//driver.quit();
}

}
	