package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.driverManager;
import io.cucumber.java.en.Then;

public class FlightBookingStep {
	
	private WebDriver driver;

	
	@Then("User need to select the departure city and arrival city from the drop down")
	public void user_need_to_select_the_departure_city_and_arrival_city_from_the_drop_down() throws InterruptedException {
		driver = driverManager.getDriver();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1).switchTo().frame(1);
		driver.findElement(By.name("depart")).sendKeys("Frankfurt");
	    driver.findElement(By.name("arrive")).sendKeys("San Francisco");
		
	}

	@Then("User need to enter the departure date and return date")
	public void user_need_to_enter_the_departure_date_and_return_date() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.findElement(By.name("departDate")).clear();
		driver.findElement(By.name("departDate")).sendKeys("09/03/2023");
		driver.findElement(By.name("returnDate")).clear();
		driver.findElement(By.name("returnDate")).sendKeys("09/04/2023");
		
	}

	@Then("User need to enter the no of passenger")
	public void user_need_to_enter_the_no_of_passenger() throws InterruptedException {
	 
		Thread.sleep(2000);
		driver.findElement(By.name("numPassengers")).clear();
		driver.findElement(By.name("numPassengers")).sendKeys("4");
	 
	}

	@Then("User need to select the Seating Preference")
	public void user_need_to_select_the_seating_preference() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Aisle']")).click();
		
	}

	@Then("User need to select round trip or not")
	public void user_need_to_select_round_trip_or_not() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='roundtrip']")).click();
		
	}

	@Then("User need to select the type of seat")
	public void user_need_to_select_the_type_of_seat() throws InterruptedException {
	    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='First']")).click();
	
	}

	@Then("User need to click the continue button")
	public void user_need_to_click_the_continue_button() {
	
		driver.findElement(By.name("findFlights")).click();
	
	}

}
