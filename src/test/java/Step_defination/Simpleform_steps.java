package Step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Simpleform_steps {
	WebDriver driver;
	@Given("User opens the browser and navigate to V2 Traning website")
	public void user_opens_the_browser_and_navigate_to_v2_traning_website() {
		 ChromeDriverManager.chromedriver().setup();//to set the path
			driver=new ChromeDriver();//creating obje3ct for chromedriver
			
			driver.get("https://v1.training-support.net/selenium/simple-form");//to retrive the url
			
	    
	}

	@When("User enter First name,Last name,email")
	public void user_enter_first_name_last_name_email() {
		driver.findElement(By.id("firstName")).sendKeys("varsha");
		driver.findElement(By.id("lastName")).sendKeys("mane");
		driver.findElement(By.id("email")).sendKeys("varshamane@gmail.com");
	
	    
	}

	@When("Contact number ,Message")
	public void contact_number_message() {
	driver.findElement(By.id("number")).sendKeys("7744955710");
	driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys("Hello");
	 
	   }

	@When("User click on submit")
	public void user_click_on_submit() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	    
	}

	@Then("A confirmation pop-up is displayed")
	public void a_confirmation_pop_up_is_displayed() {
		System.out.println("clicked on submit");
		driver.quit();
		
	    
	}

}
