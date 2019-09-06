package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomer {

	static WebDriver driver;
	
	@Given("The user launch the url")
	public void the_user_launch_the_url() {
	     WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/telecom/");
	   driver.manage().window().maximize();
	}

	@Given("The user click the Add customer")
	public void the_user_click_the_Add_customer() {
		driver.findElement(By.xpath("(//*[text()='Add Customer'])[1]")).click();
	}

	@When("The user fill the all details")
	public void the_user_fill_the_all_details() {
	    driver.findElement(By.xpath("//*[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("Aro");
	    driver.findElement(By.id("lname")).sendKeys("Jacq");
	    driver.findElement(By.name("emailid")).sendKeys("arojacq@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Velachery");
	    driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
	}

	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("The user get the CustomerID")
	public void the_user_get_the_CustomerID() {
	    WebElement text = driver.findElement(By.xpath("//table[@class='alt access']//tr/td[2]"));
	    String str = text.getText();
	    System.out.println("CustomerID"+":"+str);
	}

	@Then("The user close the url")
	public void the_user_close_the_url() {
	    driver.close();
	}

	
}
