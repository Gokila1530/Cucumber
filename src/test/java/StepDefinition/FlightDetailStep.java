package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.driverManager;
import io.cucumber.java.en.Then;

public class FlightDetailStep  {
	
	private WebDriver driver;
	
	@Then("User need to select the Departure time	and cost and which flight for both the trip")
	public void user_need_to_select_the_departure_time_and_cost_and_which_flight_for_both_the_trip() throws InterruptedException {
		driver = driverManager.getDriver();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1).switchTo().frame(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='161;720;09/03/2023']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='613;661;09/04/2023']")).click();
		
	}
	
	@Then("user need to click the continue button in the flightdetail page")
	public void user_need_to_click_the_continue_button_in_the_flightdetail_page() {
	
		driver.findElement(By.name("reserveFlights")).click();
		
	}

}
