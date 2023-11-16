package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.driverManager;
import io.cucumber.java.en.Then;

public class UserDetailStep  {

	
	
	private WebDriver driver;

	@Then("User need to enter the first name last name street address city and passenger name")
	public void user_need_to_enter_the_first_name_last_name_street_address_city_and_passenger_name() {
		driver = driverManager.getDriver();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1).switchTo().frame(1);
	    driver.findElement(By.name("firstName")).clear();
	    driver.findElement(By.name("firstName")).sendKeys("Karthiga");
	    driver.findElement(By.name("lastName")).clear();
	    driver.findElement(By.name("lastName")).sendKeys("Vino");
	    driver.findElement(By.name("address1")).sendKeys("SanFrancisco");
	    driver.findElement(By.name("address2")).sendKeys("Oakland");
	    driver.findElement(By.name("pass1")).clear();
	    driver.findElement(By.name("pass1")).sendKeys("Karthi");
	    driver.findElement(By.name("pass2")).sendKeys("Saras");
	    driver.findElement(By.name("pass3")).sendKeys("Rani");
	    driver.findElement(By.name("pass4")).sendKeys("Aswathi");
	    
	}

	@Then("User need to enter the Credit Card and exp date")
	public void user_need_to_enter_the_credit_card_and_exp_date() {
		
		 driver.findElement(By.name("creditCard")).sendKeys("185684875315145");
		 driver.findElement(By.name("expDate")).sendKeys("7531");
	    
	}
 
	@Then("User need to click the continue button in the user Detail Page")
	public void user_need_to_click_the_continue_button_in_the_user_detail_page() throws InterruptedException {
	   
		driver.findElement(By.name("buyFlights")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
}
