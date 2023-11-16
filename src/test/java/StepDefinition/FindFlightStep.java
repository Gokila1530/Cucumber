package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.driverManager;
import io.cucumber.java.en.Then;

public class FindFlightStep {

	private WebDriver driver;
	
	@Then("user need to click on the  Flights button")
	public void user_need_to_click_on_the_flights_button() throws InterruptedException {
		driver = driverManager.getDriver();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1).switchTo().frame(0);
		driver.findElement(By.xpath("//img[@alt='Search Flights Button']")).click();
	}
}
