package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizationSwaglabs {
	
	WebDriver driver=null;
	@Given("User lounch browser")
	public void user_lounch_browser() throws InterruptedException {
		
 	}
	
	@When("User opens url")
	public void user_opens_url() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com");
		Thread.sleep(3000);
		
	}


	@When("user enter (.*) and (.*)")
	public void user_enter_username_and_password_as(String username, String password) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		   
		
	}

	@And("click on login") 
	public void click_on_login() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@Then("page url should be desired page url")
	public void page_url_should_be_desired_page_url() throws InterruptedException {
	    
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	    Thread.sleep(3000);
	}

	@And("close browser")
	public void close_browser() {
	   driver.close();
	}

}