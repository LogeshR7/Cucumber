package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookessDefination {
	@When("Thnos has infinty stone")
	public void thnos_has_infinty_stone() {
		System.err.println("Thnos has infinty stone");
	    
	}
	
	@Then("He sanap his fingure")
	public void he_sanap_his_fingure() {
		System.err.println("He sanap his fingure");
	    
	}
	
	@Then("Half of the life are dead")
	public void half_of_the_life_are_dead() {
		System.err.println("Half of the life are dead");
	}

}
