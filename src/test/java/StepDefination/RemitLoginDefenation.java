package StepDefination;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemitLoginDefenation {
	WebDriver driver;

	@Given("User need to enter into the remit webapplication using chrome browser")
	public void user_need_to_enter_into_the_remit_webapplication_using_chrome_browser() {
		driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");
	}
	
	
	@When("User type the Username {string}")
	public void user_type_the_username(String USername) {
		driver.findElement(By.name("login")).sendKeys(USername);
	  }
	
	
	@When("USer type the password {string}")
	public void u_ser_type_the_password(String Password) {
	    driver.findElement(By.name("password")).sendKeys(Password);  
	}
	
	
	@Then("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	}
	
	
	@Then("user is able to see the home page")
	public void user_is_able_to_see_the_home_page() { 
	boolean Status=driver.findElement(By.xpath("//label[normalize-space(text())='dosth ( L001 )']"))
			.isDisplayed();
	assertTrue(Status);
	
	}

}
