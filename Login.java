package loginWithDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	String [] [] dr = {
			
			{"spnandha","Sha1250#"},
			{"shgfjhjh","Sha1250"},
			{"hjhsjj","Sha1250#"},
			{"spnandha","jjhdj"}
			
	};
	
	
	@DataProvider (name = "login credetials")
	public String[][] loginData() {
		return dr;

	}
	
	@Test (dataProvider = "login credetials")
	public void singleFile(String uname, String pword) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AK\\eclipse-workspace\\DataDrivenProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pword);

		 driver.close();
	}

}
