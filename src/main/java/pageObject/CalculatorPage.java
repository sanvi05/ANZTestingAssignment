package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorPage {

	private WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
	}

	private By annualIncome = By.xpath("//input[@aria-labelledby='q2q1']");
	private By otherIncome = By.xpath("//input[@aria-labelledby='q2q2']");
	private By monthlyLivingExpense = By.id("expenses");
	private By homeLoan = By.id("homeloans");
	private By otherLoans = By.id("otherloans");
	private By otherCommitments = By.xpath("//input[@aria-labelledby='q3q4']");
	private By creditLimits = By.id("credit");
	private By borrowCalculatorButton = By.id("btnBorrowCalculater");
	private By borrowResultAmount = By.xpath("//span[@id='borrowResultTextAmount']");
	private By startOverBtn = By.xpath("//div[@class='result__restart']//button//span");
	private By errorText = By.xpath("//div[@class='borrow__error__text']");
	
	public void setAnnualIncome(String annualIncomeInput) {
		 driver.findElement(annualIncome).sendKeys(annualIncomeInput);
	}
	
	public void setOtherIncome(String otherIncomeInput) {
		 driver.findElement(otherIncome).sendKeys(otherIncomeInput);
	}
	
	public void setMonthlyLivingExpense(String monthlyLivingExpenseInput) {
		 driver.findElement(monthlyLivingExpense).sendKeys(monthlyLivingExpenseInput);
	}
	
	public void setHomeLoan(String homeLoanInput) {
		 driver.findElement(homeLoan).sendKeys(homeLoanInput);
	}
	
	public void setOtherLoans(String otherLoansInput) {
		 driver.findElement(otherLoans).sendKeys(otherLoansInput);
	}
	
	public void setOtherCommitments(String otherCommitmentsInput) {
		 driver.findElement(otherCommitments).sendKeys(otherCommitmentsInput);
	}
	
	public void setCreditLimits(String creditLimitsInput) {
		 driver.findElement(creditLimits).sendKeys(creditLimitsInput);
	}
	
	public void clickBorrowCalculatorButton() throws InterruptedException {
		 driver.findElement(borrowCalculatorButton).click();
		 Thread.sleep(5000);
	}
	
	public String getBorrowResultAmount() {
		return driver.findElement(borrowResultAmount).getText();
	}
	
	public void clickStartOverButton() {
		 driver.findElement(startOverBtn).click();
	}
	
	public String getAnnualIncome() {
		 return driver.findElement(annualIncome).getText();
	}
	
	public String getOtherIncome() {
		return driver.findElement(otherIncome).getText();
	}
	
	public String getMonthlyLivingExpense() {
		return driver.findElement(monthlyLivingExpense).getText();
	}
	
	public String getHomeLoan() {
		return driver.findElement(homeLoan).getText();
	}
	
	public String getOtherLoans() {
		return driver.findElement(otherLoans).getText();
	}
	
	public String getOtherCommitments() {
		return driver.findElement(otherCommitments).getText();
	}
	
	public String getCreditLimits() {
		return driver.findElement(creditLimits).getText();
	}
	
	public String getErrorText() {
		return driver.findElement(errorText).getText();
	}
	
}
