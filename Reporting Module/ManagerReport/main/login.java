package logins;
	 
	import java.util.ArrayList;

	import java.util.List;

	import java.util.Set;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import org.openqa.selenium.support.ui.WebDriverWait;

	import org.testng.Assert;

	import org.testng.annotations.AfterMethod;

	import org.testng.annotations.BeforeMethod;

	import org.testng.annotations.Test;
	 
	public class Login_Page {
	 
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
	 
		@Test

		public void TC_MR_001() throws InterruptedException {

			driver.findElement(By.linkText("Reports")).click();

			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

			Thread.sleep(60000);

			driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[1]")).click();

			Thread.sleep(20000);

			String parentwid = driver.getWindowHandle();

			System.out.println("Parent ID" + parentwid);

			driver.findElement(By.xpath("//*[@id=\"option1\"]")).click();

			Set<String> allID = driver.getWindowHandles();

			List<String> l = new ArrayList<String>(allID);

			driver.switchTo().window(l.get(1));

			Thread.sleep(20000);

			String parentwid2 = driver.getWindowHandle();

			System.out.println("Parent ID2" + parentwid2);

			Set<String> allID2 = driver.getWindowHandles();

			List<String> l2 = new ArrayList<String>(allID2);

			driver.switchTo().window(l2.get(1));

			Thread.sleep(2000);

			driver.close();
		
	 
		}
		

	}

