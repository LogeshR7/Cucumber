
  package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterHanifaLogin {
	 WebDriver driver;
	@Given("User Need to open Hanifa Website on Chrome")
	  public void user_need_to_open_hanifa_website_on_chrome() {
		  driver=new ChromeDriver();
		  driver.get("http://haniffakl.asuscomm.com:2311/Demo/");  
	  }
	  
	  @When("user enter the {string}  {string}")
	  public void user_enter_the(String string, String string2) {
		  driver.findElement(By.name("email")).sendKeys(string);
		  driver.findElement(By.name("password1")).sendKeys(string2);
	     
	  }
	  
	  @When("User click the Login button")
	  public void user_click_the_login_button() {
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
	      
	  }
	  
	  @Then("User See the Dashboard page of haniffa")
	  public void user_see_the_dashboard_page_of_haniffa() {
		  boolean status=
				  driver.findElement(By.xpath("//span[normalize-space(text())='Welcome durai']"
				  )).isDisplayed();
		  if (status) { System.err.println("Sucess"); }else {
			  System.out.println("fail"); }
		  
	    
	  }
  
  
  }
  
  
  
  //TODO learn //span[normalize-space(text())='Welcome durai'] }
 