package stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.CalculatorPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calculator {

	public WebDriver driver;
	public CalculatorPage cp;
	
	@Given("user launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    cp = new CalculatorPage(driver);
	}
	
	@When("user opens URL {string}")
	public void user_opens_url(String url) {
	 driver.get(url);
	}
	
	@When("user enters below details")
	public void user_enters_below_details(DataTable dataTable) {
	  List<List<String>> data = dataTable.cells();
	  cp.setAnnualIncome(data.get(1).get(0));
	  cp.setOtherIncome(data.get(1).get(1));
	  cp.setMonthlyLivingExpense(data.get(1).get(2));
	  cp.setHomeLoan(data.get(1).get(3));
	  cp.setOtherLoans(data.get(1).get(4));
	  cp.setOtherCommitments(data.get(1).get(5));
	  cp.setCreditLimits(data.get(1).get(6));
	}
	
	@When("user clicks {string} button")
	public void user_clicks_button(String btn) throws InterruptedException {
		   cp.clickBorrowCalculatorButton();
	}
	
	@When("user clicks Start over button")
	public void user_clicks_Start_over_button(){
		cp.clickStartOverButton();
	}
	
	@Then("verify borrowing estimate is calculated as {string}")
	public void verify_borrowing_estimate_is_calculated_as(String expectedLimit) {
		String actualLimit = cp.getBorrowResultAmount();
		System.out.println(actualLimit);
	    Assert.assertEquals(actualLimit, expectedLimit);
	    driver.close();
	}
	
	@Then("verify the form is cleared")
	public void verify_the_form_is_cleared() {
		 
		  String actualAnnualIncome = cp.getAnnualIncome();
		  String actualOtherIncome = cp.getOtherIncome();
		  String actualMonthlyLivingExpensee = cp.getMonthlyLivingExpense();
		  String actualHomeLoan = cp.getHomeLoan();
		  String actualOtherLoans = cp.getOtherLoans();
		  String actualOtherCommitments = cp.getOtherCommitments();
		  String actualCreditLimits = cp.getCreditLimits();
		  
		  Assert.assertEquals(actualAnnualIncome, "" );
		  Assert.assertEquals(actualOtherIncome, "" );
		  Assert.assertEquals(actualMonthlyLivingExpensee, "" );
		  Assert.assertEquals(actualHomeLoan, "" );
		  Assert.assertEquals(actualOtherLoans, "" );
		  Assert.assertEquals(actualOtherCommitments, "" );
		  Assert.assertEquals(actualCreditLimits, "" ); 
		  driver.close();
	}
	
	@Then("verify the message displayed")
	public void verify_the_message_displayed(DataTable dataTable) {
		 List<List<String>> data = dataTable.cells();
		 
		 String actualText = cp.getErrorText();
		  
		  Assert.assertEquals(actualText, data.get(1).get(0));
		  driver.close();
	}
}