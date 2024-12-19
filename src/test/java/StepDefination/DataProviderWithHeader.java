package StepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataProviderWithHeader {
	
	 WebDriver driver;
	@Given("User need to open edge in browaer and kanch the webside for smm")
	public void user_need_to_open_edge_in_browaer_and_kanch_the_webside_for_smm() {
	  
	   driver=new ChromeDriver();
	   driver.get("https://smm.juzapps.com/");
	}
	
	@When("User need to enter the Centrials")
	public void user_need_to_enter_the_centrials(io.cucumber.datatable.DataTable dataTable) {
	  List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	 String username= data.get(0).get("Username");
	  String password=data.get(0).get("Password");
	  driver.findElement(By.name("email")).sendKeys(username);
	  driver.findElement(By.name("password1")).sendKeys(password);
	}
	
	@When("User click the sign button")
	public void user_click_the_sign_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	
	@Then("User see the dash board page of Smm")
	public void user_see_the_dash_board_page_of_smm() {
		 boolean status= driver.findElement(By.xpath("//span[normalize-space(text())='Welcome durai']"
				  )).isDisplayed();
		
		 if (status) { System.err.println("Sucess"); }
		else {
			  System.out.println("fail"); }
		
	    
	}

}
