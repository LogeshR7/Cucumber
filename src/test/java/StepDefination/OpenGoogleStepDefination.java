package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleStepDefination {
	WebDriver driver;
	
	@Given("User need to lanch google.co.in on chrome")
	public void user_need_to_lanch_google_co_in_on_chrome() {
	   driver=new ChromeDriver();
	   driver.get("https://www.google.co.in/");
	}
	
	@When("User click the search bar and type {string}")
	public void user_click_the_search_bar_and_type(String SearchData) {
		driver.findElement(By.name("q")).sendKeys(SearchData);
	}
	
	@When("User click the return button")
	public void user_click_the_return_button() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	    
	@Then("User see the result of search")
	public void user_see_the_result_of_search() {
	boolean status=	driver.findElement(By.xpath("//div[normalize-space(text())='Cristiano Ronaldo']")).isDisplayed();
	 if (status) {
		System.out.println("Test passed");
	} else {
		System.out.println("Test Fail");
	}  
	
	}

}
