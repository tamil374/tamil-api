package hooksmanager;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class hooks {
	
	public static Scenario scenario;
	
	
	
	    @Before
	   public void beforeStep(Scenario scenario)
	   {
	    	
	    	hooks.scenario=scenario;
	    System.out.println("--------This is before step--------");	
	   }
	   
	  @After
	   public static void afterStep(Scenario scenario)
	   {
		   System.out.println("------This is after step------");
		   System.out.println(scenario.getName());
		   System.out.println(scenario.getStatus());
	   }
	    

}
