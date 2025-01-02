package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HaniffaklStep {
	WebDriver driver;
	@Given("User need to open chrome and lanch the haniffa kl website")
	public void user_need_to_open_chrome_and_lanch_the_haniffa_kl_website() {
	    driver=new ChromeDriver();
	    driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
	}
	
	@When("User need to insert the valid {string} {string}")
	public void user_need_to_insert_the_valid(String string, String string2) {
		driver.findElement(By.name("email")).sendKeys(string);
		driver.findElement(By.name("password1")).sendKeys(string2);
	    
	}
	
	@When("User clik the sign in button on the bottom")
	public void user_clik_the_sign_in_button_on_the_bottom() {
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	    
	}
	
	@Then("The user will see the dashboard page")
	public void the_user_will_see_the_dashboard_page() {
		boolean ststus= driver.findElement(By.xpath("//span[text()='Purchase']")).isDisplayed();
		if (ststus) {
			System.out.println("sucess");}
	}
	
	@Then("User need to click on the purchase module located left side")
	public void user_need_to_click_on_the_purchase_module_located_left_side() {
	    driver.findElement(By.xpath("//span[text()='Purchase']")).click();
	    
	    
	}
	
	@Then("User click the purchase order module")
	public void user_click_the_purchase_order_module() {
	    driver.findElement(By.xpath("(//a[@class='icon-btn']//i)[2]")).click();
	    
	}
	
	@Then("Click the insert button on top rigt conor on top right side")
	public void click_the_insert_button_on_top_rigt_conor_on_top_right_side() {
	    driver.findElement(By.xpath("//span[text()=' INSERT']")).click();
	    
	}
	
	@Then("Enter the vendor")
	public void enter_the_vendor() throws Exception {
	   WebElement ele= driver.findElement(By.id("vendor"));
	   ele .sendKeys("haniff");
	   Thread.sleep(2000);
	   ele.sendKeys(Keys.DOWN,Keys.ENTER);
	   
	}

	
	
	
	@When("User type {string}")
	public void user_type(String string) throws Exception {
	   WebElement ele1= driver.findElement(By.id("sku"));
	   ele1.sendKeys(string);
	   Thread.sleep(2000);
	   ele1.sendKeys(Keys.DOWN,Keys.ENTER);
	   Thread.sleep(2000);
	   driver.findElement(By.id("sku_uom_type")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	}
	
	@When("Need to enter the Qty {string}")
	public void need_to_enter_the_qty(String string) {
	    driver.findElement(By.id("quantity")).sendKeys(string);
	    
	}
	
	@Then("Click add button")
	public void click_add_button() throws Exception {
		
	    driver.findElement(By.id("addItem")).click();
	    Thread.sleep(2000);
	   
	}
	
	@When("User type product {string}")
	public void user_type_product(String string) throws Exception {
		 WebElement ele2= driver.findElement(By.id("sku"));
		   ele2.sendKeys(string);
		   Thread.sleep(2000);
		   ele2.sendKeys(Keys.DOWN,Keys.ENTER);
		   Thread.sleep(2000);
		   driver.findElement(By.id("sku_uom_type")).sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
	}

	
	@When("Need to add qty {string}")
	public void need_to_add_qty(String string) {
		 driver.findElement(By.id("quantity")).sendKeys(string);
	      
	}
	
	@Then("Click add button on botton right")
	public void click_add_button_on_botton_right() {
		  driver.findElement(By.id("addItem")).click();
	    
	    
	}
	
	@Then("Click save button on Top right side")
	public void click_save_button_on_top_right_side() {
		driver.findElement(By.name("purchase_button")).click();
	    
	    
	}
	
	@Then("The user will see the sucess message and also see the purchase order list page")
	public void the_user_will_see_the_sucess_message_and_also_see_the_purchase_order_list_page() throws InterruptedException {
	Thread.sleep(1000);
		WebElement ele3= driver.findElement(By.xpath("//div[normalize-space(text())="
	 		+ "'Success: You have added purchase!']"));  
	 if (ele3.isDisplayed()) {
		 System.out.println("Logesh Sucesss");	
	}
	    
	}
	
	@When("User click the view icion on the list page to coinform the order")
	public void user_click_the_view_icion_on_the_list_page_to_coinform_the_order() throws Exception {
	    driver.findElement(By.xpath("//i[@title='View']")).click();
	    Thread.sleep(1000);
	}
	
	@Then("User need to click the name located on the top right conor")
	public void user_need_to_click_the_name_located_on_the_top_right_conor() throws Exception {
	    Thread.sleep(1000);
		WebElement ele4=driver.findElement(By.xpath("//a[@data-close-others='true']"));
	    Actions bulider=new Actions(driver);
	    bulider.moveToElement(ele4);
	   
	    
	}
	
	@Then("Click logout")
	public void click_logout() {
		driver.findElement(By.xpath("//a[text()=' Log Out']")).click();
	    
	}
}
