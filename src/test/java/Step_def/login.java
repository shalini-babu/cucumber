package Step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver = null;

	@Given("user login page is opened")
	public void user_login_page_is_opened() {
		String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://10.232.237.143:443/TestMeApp/"); 
	    
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	    System.out.println("The title of the page is"+driver.getTitle());
	    
	}

	@When("user enters {string} as a username and {string} as a password")
	public void user_enters_as_a_username_and_as_a_password(String string, String string2) throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("password123");

	}

	@When("user click on Login button")
	public void user_click_on_Login_button() {
		  driver.findElement(By.name("Login")).click();

	    
	}

	@Then("will Finds a TestMeApp hoempage")
	public void will_Finds_a_TestMeApp_hoempage() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@href='logout.htm']")).click();

	}

}
