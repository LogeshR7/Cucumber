package Hookkess;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookesToThanos {
	@Before
	@When("Thnos Need to collect infinity stone")
	public void Thnos_Need_to_collect_infinity_stone() {
		System.err.println("Thnos Need to collect infinity stone");
	    
	}
	@After
	@Then("Thonos go to garden and take rest")
	public void Thonos_go_to_garden_and_take_rest() {
		System.err.println("Thonos go to garden and take rest");
	}

}
