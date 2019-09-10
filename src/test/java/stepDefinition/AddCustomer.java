package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
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
	public void the_user_fill_the_all_details(DataTable CustomerDetails) {
		List<String> cdl = CustomerDetails.asList(String.class);
		System.out.println(cdl);

		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(cdl.get(0));
		driver.findElement(By.id("lname")).sendKeys(cdl.get(1));
		driver.findElement(By.name("emailid")).sendKeys(cdl.get(2));
		driver.findElement(By.name("addr")).sendKeys(cdl.get(3));
		driver.findElement(By.name("telephoneno")).sendKeys(cdl.get(4));
	}

	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user get the CustomerID")
	public void the_user_get_the_CustomerID() {
		WebElement text = driver.findElement(By.xpath("//table[@class='alt access']//tr/td[2]"));
		String str = text.getText();
		System.out.println("CustomerID" + ":" + str);
	}

	@Then("The user close the url")
	public void the_user_close_the_url() {
		driver.close();
	}
	
	@Given("The user Launch the url guru")
	public void the_user_Launch_the_url_guru() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("The user click the Add Tariff Plan")
	public void the_user_click_the_Add_Tariff_Plan() {
		driver.findElement(By.xpath("//*[text()='Add Tariff Plan']")).click();
	}

	@When("The user fill all details in tariff plan")
	public void the_user_fill_all_details_in_tariff_plan(DataTable CustomerDetails) {
		Map<String, String> cdam = CustomerDetails.asMap(String.class, String.class);
		System.out.println(cdam);
		
		driver.findElement(By.id("rental1")).sendKeys(cdam.get("Monthly Rental"));
		driver.findElement(By.id("local_minutes")).sendKeys(cdam.get("Free Local Minutes"));
		driver.findElement(By.id("inter_minutes")).sendKeys(cdam.get("Free International Minutes"));
		driver.findElement(By.id("sms_pack")).sendKeys(cdam.get("Free SMS Pack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(cdam.get("Local Per Minutes Charges"));
		driver.findElement(By.id("inter_charges")).sendKeys(cdam.get("International Per Minutes Charges"));
		driver.findElement(By.id("sms_charges")).sendKeys(cdam.get("SMS Per Charges"));
	}

	@When("The user click Submit button")
	public void the_user_click_Submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user get the message congratulations")
	public void the_user_get_the_message_congratulations() {
		WebElement text = driver.findElement(By.xpath("//section[@id='main']//h2"));
		String str = text.getText();
		System.out.println(str);
	}

}
	
