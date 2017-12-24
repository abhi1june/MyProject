package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test1 {

	WebDriver driver;
	
	@Test(priority=0)
	public void start() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Successfully launched Chrome Driver");

	}
	
	@Test(priority=1)
	public void navigate_to_main_window(){
		String parent_win=driver.getWindowHandle();
		driver.switchTo().window(parent_win);
		System.out.println("Switched to main window");
	}
	
	@Test(priority=2)
	public void failing_it(){
		Assert.assertEquals(1, 2);
		System.out.println("Force-fully failing it");
	}

}
