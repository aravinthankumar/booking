package org.stepdefinitation;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class Hooks extends BaseClass{
	@After
	public void after(Scenario sc)  {
	
		TakesScreenshot tk =(TakesScreenshot)driver;
		byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(ss, "image/png");
		System.out.println("====take ss========");

		quit();
		System.out.println("==after==========");

	}

}
