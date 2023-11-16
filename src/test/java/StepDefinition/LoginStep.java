package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.driverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	private WebDriver driver;
	
	
	@Given("Url")
	public void url() {
		
	    driver = driverManager.getDriver();
	    driver.get("http://localhost:1080/webtours/index.htm");
	    driver.manage().window().maximize();
	    
	    }
	    

	@When("Enter username and password")
	public void enter_username_and_password() {
		
		driver.switchTo().frame(1).switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jojo");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bean");
		
	    
	}

	@Then("click login button")
	public void click_login_button() {
	
	    driver.findElement(By.name("login")).click();
	    
	}

}
