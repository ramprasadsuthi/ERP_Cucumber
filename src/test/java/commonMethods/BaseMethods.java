package commonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseMethods {
	
	public static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void openBrowser(String btype) {
		if(btype.equals("chrome")) {
		       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		       driver = new ChromeDriver();
		} else if(btype.equals("firefox")) {
			// write the code to launch firefox browser
		} if(btype.equals("IE")) {
			//write the code to launch IE browser
		}
	}
	
	public static void launchApp() {
		driver.get("http://webapp.qedgetech.com/login.php");
		driver.manage().window().maximize();
	}
	
	public static void launchApp(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void login() {
		driver.findElement(By.id("username")).clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		
		String pCaption = driver.findElement(By.id("ewPageCaption")).getText();
		
		Assert.assertEquals(pCaption,"Dashboard");
		
	 }
	
	public static void login(String username, String password) throws InterruptedException {
		driver.findElement(By.id("username")).clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnsubmit")).click();
		
		String pCaption = driver.findElement(By.id("ewPageCaption")).getText();
		
		Assert.assertEquals(pCaption,"Dashboard");
		
	 }
	
	public static void logout() {
        driver.findElement(By.id("mi_logout")).click();
        
        if(driver.findElement(By.id("btnsubmit")).isEnabled()) {
        	System.out.println("Logout is success, Testcase is passed");
        } else {
        	System.out.println("Logout is failed, Testcas is failed");
        }
	}
	
	public void closeBrowser() {
		driver.close();
	}

	public void invalidLogin(String username, String password) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnsubmit")).click();
		
		String eMesg = driver.findElement(By.xpath("//div[contains(text(),'Incorrect')]")).getText();
		
		System.out.println("Error Message is : " + eMesg);
		
		if (eMesg.contains("Incorrect")) {
			System.out.println("Invalid Login Testcase is Passed");
		} else {
			System.out.println("Invalid Login Testcase is Failed");
		}
		
	}

}
