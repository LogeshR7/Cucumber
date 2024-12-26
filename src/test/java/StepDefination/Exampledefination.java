package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Exampledefination {
	WebDriver driver;
	@Given("User need too open edge and go to smm website")
	public void user_need_too_open_edge_and_go_to_smm_website() {
		driver=new ChromeDriver();
		driver.get("https://smm.juzapps.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@When("User need to enter {string} {string}")
	public void user_need_to_enter(String string, String string2) {
		driver.findElement(By.name("email")).sendKeys(string);
		driver.findElement(By.name("password1")).sendKeys(string2);
	 
	}
	@When("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click()
;	    
	}
	@Then("User have to see the smm dashboard page")
	public void user_have_to_see_the_smm_dashboard_page() {
		boolean ststus= driver.findElement(By.xpath("//span[text()='Purchase']")).isDisplayed();
		if (ststus) {
			System.out.println("sucess");
		}
	   
	}

}
