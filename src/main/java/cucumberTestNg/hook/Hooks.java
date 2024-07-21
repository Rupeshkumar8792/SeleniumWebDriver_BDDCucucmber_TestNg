package cucumberTestNg.hook;

import cucumberTestNg.base.BaseClass;
import cucumberTestNg.utility.Util;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass
{
	//beforeScenario method is executed before every test. same as @BeforeMthod annotation
	
	@Before
	public void beforeScenario()
	{
		launchBrowser();
	}
	
	@After
	public void afterScenario(Scenario scenario)
	{
		if (scenario.isFailed()) 
		{
			scenario.attach(Util.takeScreenshot(), "image/png", scenario.getName());
		}
		
		tearDown();
	}
}
