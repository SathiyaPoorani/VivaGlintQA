import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pageobjects.CommentsCardObject;
import pageobjects.GlintDashboardObject;
import pageobjects.LoginPageObject;
import pageobjects.ReportCardObject;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public ReportCardObject report;
    public GlintDashboardObject glint;
    public LoginPageObject loginfun;
    public CommentsCardObject comments;

    public void launchbrowser(){
        System.out.println("Launching Browser.");
        driver = new ChromeDriver();
        report = new ReportCardObject(driver);
        glint = new GlintDashboardObject(driver);
        loginfun = new LoginPageObject(driver);
        comments = new CommentsCardObject(driver);
        driver.manage().window().maximize();
        driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
        iwait();
    }

    public void closebrowser(){
        System.out.println("Closing Browser.");
        driver.quit();
    }

    public void login() throws InterruptedException {
        loginfun.setEmailid("qatester@glintinc.com");
        iwait();
        loginfun.setContinuebutton();
        iwait();
        loginfun.setCompanyid("qa20220428");
        iwait();
        loginfun.setContinuebutton();
        iwait();
        loginfun.setPassword("Dem0@pass2");
        iwait();
        loginfun.setContinuebutton();
    }

    public void iwait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void takescreenshot(String tname) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:/Users/lebi01/OneDrive - dentsu/Testing/TestScreenshots/"+tname+".png"));
        System.out.println("--------ScreenShot Captured--------");
    }

    public void scrollthepage(WebElement scroll){
        WebElement scrolltoelement = scroll;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrolltoelement);
    }

    public void mousehover(WebElement mouse){
        Actions action = new Actions(driver);
        action.moveToElement(mouse).build().perform();
    }
}
