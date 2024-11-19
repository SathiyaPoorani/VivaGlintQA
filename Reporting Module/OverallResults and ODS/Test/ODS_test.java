
package testcase;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Conftest.confi_ods;

public class ODS_test extends confi_ods {
    
    private static final String SCREENSHOT_PATH = System.getProperty("user.dir") + "/test-output/screenshots/";
    private WebDriverWait wait;
    
    @BeforeClass
    public void setupClass() {
        // Create screenshots directory if it doesn't exist
        new File(SCREENSHOT_PATH).mkdirs();
    }
    
    @BeforeMethod
    public void setup() throws InterruptedException {
        openBrowserODS();
        LoginCredentialsODS();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

    @Test(description = "Verify config button functionality", groups = {"smoke"})
    public void TC_ODS_01() throws InterruptedException {
        configbutton();
    }

    @Test(description = "Verify Survey Programs section", groups = {"regression"})
    public void TC_ODS_02() throws InterruptedException {
        configbutton();
        Survey_Programs();
    }
    
    @Test(description = "Verify Survey Programs with screenshot", groups = {"regression"})
    public void TC_ODS_03() throws InterruptedException {
        configbutton();
        Survey_Programs();
        takeScreenshot("survey_programs");
    }


    @Test(description = "Verify People page with screenshot", groups = {"regression"})
    public void TC_ODS_04() throws InterruptedException {
        configbutton();
        People();
        takeScreenshot("people_page");
    }

    @Test(description = "Verify People Export functionality", groups = {"regression"})
    public void TC_ODS_05() throws InterruptedException {
        configbutton();
        People();
        ClickPeopleExport();
        //takeScreenshot("people_export");
    }
    
    @Test(description = "Verify People page buttons", groups = {"regression"})
    public void TC_ODS_06() throws InterruptedException {
        configbutton();
        People();
        PeoplePageButtonCheck();
    }

    @Test(description = "verify Attribute buttons" , groups ={"regression"})
    public void TC_ODS_07() throws InterruptedException {
        configbutton();
        People();
        AttributeButtonCheck();
    }

    @Test(description ="Verify Company admin in User Roles", groups={"regression"})
    public void TC_ODS_08() throws InterruptedException
    {
        configbutton();
        People();
        CompanyAdmin();
        Thread.sleep(5000);
    }

    @Test(description ="Verify User Role1 in User Roles", groups={"regression"})
    public void TC_ODS_09() throws InterruptedException
    {
        configbutton();
        People();
        Urole1();
        Thread.sleep(5000);
    }

    @Test(description="Verify User role 2 in user roles", groups={"regression"})
    public void TC_ODS_10() throws InterruptedException
    {
        configbutton();
        People();
        Urole2();
        Thread.sleep(5000);
    }

    @Test(description="Verify User Attribute and Optional Attributes button",groups={"smoke"})
    public void TC_ODS_11() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        configbutton();
        Thread.sleep(5000);
        People();
        Actions_Button();
        AttributeVisibility();

    }

    @Test(description="Verify Custom Attribute Visibility",groups={"smoke"})
    public void TC_ODS_12() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        configbutton();
        Thread.sleep(5000);
        People();
        Actions_Button();
        AttributeVisibility();
        takeScreenshot("CAV");
    }

    @Test(description="Verify Custom Attribute Visibility button",groups={"smoke"})
    public void TC_ODS_13() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        configbutton();
        Thread.sleep(5000);
        People();
        Actions_Button();
        AttributeVisibility();
        CAV_button();
    }

    



}
