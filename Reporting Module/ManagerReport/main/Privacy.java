package logins;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Privacy {
	
	public WebDriver driver;

	public WebDriverWait wait;
 
	@BeforeMethod

	public void open() throws InterruptedException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://app.glintqa.az.glintinc.com/session/auth");

		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("qatester@glintinc.com");

		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-auth/form/section/footer/button")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("clientUuid")).sendKeys("qa20230712");

		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-client/form/section/footer/button")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("password")).sendKeys("Dem0@pass2");

		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-login/form/section/footer")).click();

		Thread.sleep(30000);

	}
 
	@AfterMethod

	public void close() {

		driver.quit();

	}
	public void TC_MR_002() throws InterruptedException {

		
		//driver.findElement(By.linkText("Privacy")).click();

		//Thread.sleep(30000);
		
		driver.findElement(By.xpath("//i[@class='question glintIcon'][1]")).click();
		
		Thread.sleep(30000);
		
		Alert alert=driver.switchTo().alert();
		driver.close();
		Thread.sleep(30000);
	}

}
