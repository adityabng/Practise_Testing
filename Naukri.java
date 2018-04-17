import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			 driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
			 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("get.aditya01@gmail.com");
			 driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("Summer69");
			 driver.findElement(By.xpath("//button[@value='Login']")).click();
			 Thread.sleep(3000);
			 
			 driver.findElement(By.xpath("//a[contains(text(),'UPDATE PROFILE')]")).click();
			 Thread.sleep(3000);
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,2100)", "");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("D:\\Automation_Testing_Resume.doc");
			
		}
	}
