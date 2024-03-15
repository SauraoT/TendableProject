package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TendableHomePage {
	
	@FindBy(xpath = "//img[@alt='Tendable Logo']")
	private WebElement homePageElement;
	@FindBy(xpath = "//a[text() = 'Our Story']")
	private WebElement ourStoryElement;
	@FindBy(xpath = "//a[text() = 'Our Solution']")
	private WebElement ourSolutionElement;
	@FindBy(xpath = "//a[text() = 'Why Tendable?']")
	private WebElement whyTendablElement;
	@FindBy(xpath = "//a[text() = 'Request A Demo']")
	private WebElement requestDemoElement;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsElement;
	@FindBy(xpath = "//div[normalize-space(text())='Marketing']/following::button[text()='Contact'][1]")
	private WebElement marketingElement;
	@FindBy(xpath = "//input[@placeholder='Full Name'][1]")
	private WebElement fullNameElement;
	@FindBy(xpath = "//input[@name='organisationName'][1]")
	private WebElement organizationElement;
	@FindBy(xpath = "//input[@placeholder='Phone Number'][1]")
	private WebElement phoneNumElement;
	@FindBy(xpath = "//input[@placeholder='Email'][1]")
	private WebElement emailBoxElement;
	@FindBy(xpath = "//select[@name='jobRole'][1]")
	private WebElement jobRoleElement;
	@FindBy(xpath = "//textarea[@name='message'][1]")
	private WebElement messageTextElement;
	@FindBy(xpath = "//input[@value='Consent Agreed'][1]")
	private WebElement agreeRadioElement;
	@FindBy(xpath = "//button[text()='Submit'][1]")
	private WebElement submitBtnElement;
	@FindBy(xpath = "//div[@class='ff-form-errors']")
	private WebElement errorMsgElement;

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public TendableHomePage(WebDriver driver) 
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHome()
	{
		boolean value = homePageElement.isEnabled();
		return value;
	}
	
	public boolean verifyOurStory() 
	{
		boolean value = ourStoryElement.isEnabled();
		ourStoryElement.click();
		driver.navigate().back();
		return value;
	}
	
	public void verifyOurSolution() 
	{
		ourSolutionElement.click();
		driver.navigate().back();
	}
	
	public void verifyWhyTendable() 
	{
		whyTendablElement.click();
		homePageElement.click();
	}
	
	public boolean verifyReqDemo()
	{
		boolean value = requestDemoElement.isEnabled();
		return value;
	}
	
	public void verifyReqDemoOnMenu() 
	{
		ourStoryElement.click();
		requestDemoElement.isEnabled();
		ourSolutionElement.click();
		requestDemoElement.isEnabled();
		whyTendablElement.click();
		requestDemoElement.isEnabled();
	}
	
	public void verifyContactUs()
	{
		contactUsElement.click();
//		submitBtnElement.click();
	}
	
	public void verifyMarketing() 
	{
		marketingElement.click();
	}
	
	public void fillDetails()
	{
		fullNameElement.sendKeys("Steve Rogers");
		organizationElement.sendKeys("Marvel Cinematic Universe");
		phoneNumElement.sendKeys("9998887776");
		emailBoxElement.sendKeys("captain.america@marvel.com");
//		js.executeScript("arguments[0].click();", jobRoleElement);
//		jobRoleElement.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(jobRoleElement).click().build().perform();
		Select s = new Select(jobRoleElement);
		s.selectByValue("Frontline worker");
//		js.executeScript("arguments[0].click();", agreeRadioElement);
//		agreeRadioElement.click();
		actions.moveToElement(agreeRadioElement).click().build().perform();
	}
	public void verifySubmit()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(submitBtnElement).click().build().perform();
//		submitBtnElement.click();
		
	}
	
	public boolean verifyErrorMsg()
	{
		boolean value = errorMsgElement.isDisplayed();
		return value;
	}
}
