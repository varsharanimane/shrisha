package Step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Excelsheet {
	WebDriver driver;
	@Given("User opens the chrome browser and navigate to training form website")
	public void user_opens_the_chrome_browser_and_navigate_to_training_form_website() {
		ChromeDriverManager.chromedriver().setup();//to set the path
		driver=new ChromeDriver();//creating obje3ct for chromedriver
		
		driver.get("https://v1.training-support.net/selenium/simple-form");
	   
	}

	@When("User is Entering {string}, {string}, {string}")
	public void user_is_entering(String Firstname, String Lastname, String Email) {
		driver.findElement(By.id("firstName")).sendKeys(Firstname);
		driver.findElement(By.id("lastName")).sendKeys(Lastname);
		driver.findElement(By.id("email")).sendKeys( Email);
	
	  
	}

	@When("User  Enter {string}, {string}")
	public void user_enter(String ContactNumber, String Message) {
		driver.findElement(By.id("number")).sendKeys(ContactNumber);
		driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys( Message);
		 
	   
	}

	@When("clicking on submit button")
	public void clicking_on_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	    
	  
	}

	@Then("All the data enter sucessfully")
	public void all_the_data_enter_sucessfully() {
		System.out.println("clicked on submit");
		driver.quit();
	    
	}


}
