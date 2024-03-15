package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class myHooks {

	WebDriver driver;
	DriverFactory df;
	
	@Before
	public void launchBrowser() throws IOException
	{
		
		df = new DriverFactory();
		
		driver = df.initBrowser();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@After
	public void exit()
	{
		driver.quit();
	}
}
