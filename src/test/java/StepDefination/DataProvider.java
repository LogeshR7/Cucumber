package StepDefination;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataProvider {
	WebDriver driver;
	@Given("User need open chrome and type the Haniffa sg url")
	public void user_need_open_chrome_and_type_the_haniffa_sg_url() {
		driver=new ChromeDriver();
		driver.get("http://haniffa.juzapps.com:1205/demo/");
	  
	}
	
	@When("User see the login page enter the credentials")
	public void user_see_the_login_page_enter_the_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> credentials = dataTable.asList(String.class);
	   String Username = credentials.get(0);
	   String Password=credentials.get(1);
	   driver.findElement(By.name("email")).sendKeys(Username);
	   driver.findElement(By.name("password1")).sendKeys(Password);
	   
	}
	
	@When("User click the signup button")
	public void user_click_the_signup_button() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	
	@Then("User see the dash page of the haniffa sg")
	public void user_see_the_dash_page_of_the_haniffa_sg() {
		boolean status=
				  driver.findElement(By.xpath("//span[normalize-space(text())='Welcome durai']"
				  )).isDisplayed();
		if (status) { System.err.println("Sucess"); }
		else {
			  System.out.println("fail"); }
		
	    
	}
	

}
