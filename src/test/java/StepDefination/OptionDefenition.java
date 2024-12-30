package StepDefination;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OptionDefenition {
	WebDriver driver;
	
	@Given("User need to open the chrome and enter the remit local url")
	public void user_need_to_open_the_chrome_and_enter_the_remit_local_url() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("http://remittance.ocs.org/remittance/public/login");
	}
	
	
	@When("User enter the login detail {string} {string}")
	public void user_enter_the_login_detail(String string, String string2) {
	   driver.findElement(By.name("login")).sendKeys(string);
	   driver.findElement(By.name("password")).sendKeys(string2);
	}
	
	
	@When("Click the SIGN IN button")
	public void Click_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();    
	}
	
	

	@Then("User will see the haniffa dashboard page")
	public void user_will_see_the_haniffa_dashboard_page() {
		boolean Status=driver.findElement(By.xpath("//label[normalize-space(text())='dosth ( L001 )']"))
				.isDisplayed();
		assertTrue(Status);
		
		}

}
