package Hookkess;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookesToThanos {
	@Before(order=1)
	@When("Thnos Need to collect infinity stone")
	public void Thnos_Need_to_collect_infinity_stone() {
		System.err.println("Thnos Need to collect infinity stone");
	    
	}
	@After(order=1)
	@Then("Thonos go to garden and take rest")
	public void Thonos_go_to_garden_and_take_rest() {
		System.err.println("Thonos go to garden and take rest");
	}
	
	@Before(order = 0)
	@When("Thonos need to boorn")
	public void Thonos_need_to_boorn() {
		System.out.println("Thonos need to boorn");
	}
	
	@After(order=0)
	@Then("Thonos died at last")
	public void Thonos_died_at_last() {
		System.out.println("Thonos died at last");
	}
	

}
