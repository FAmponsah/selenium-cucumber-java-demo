package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Functions;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderTShirtSteps {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = Functions.getDriver();
		driver.manage().window().maximize();
	}

	@Given("^I am on the website with url 'http://automationpractice\\.com'$")
	public void visitAutomationPracticeHomepage() throws Throwable {
		driver.get("http://automationpractice.com");
	}

	@Given("^I click on the Sign in button$")
	public void clickOnSignInButton() throws Throwable {
		WebElement signInButton = driver.findElement(By.className("login"));
		signInButton.click();
	}

	@Given("^I log in as with username as 'SeleniumTesting@gmail\\.com' and password as 'Selenium(\\d+)'$")
	public void login(int arg1) throws Throwable {
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("SeleniumTesting@gmail.com");

		WebElement passwordField = driver.findElement(By.id("passwd"));
		passwordField.sendKeys("Selenium123");

		WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
		loginButton.click();
	}

	@Given("^I click on the T-SHIRTS tab$")
	public void i_click_on_the_T_SHIRTS_tab() throws Throwable {
		WebElement searchFiled = driver.findElement(By.id("search_query_top"));
		searchFiled.sendKeys("T-SHIRTS");

		WebElement searchIcon = driver.findElement(By.xpath("//button[@name=\"submit_search\"]"));
		searchIcon.click();
	}

	@Given("^I click on the Add to cart button$")
	public void clickOnAddToCartButton() throws Throwable {
		WebElement inStockButton = driver.findElement(By.xpath("//span[@class=\"available-now\"]"));
		WebElement addToCartButton = driver.findElement(By.xpath("//div/a[@title=\"Add to cart\"]"));

		Actions action = new Actions(driver);
		action.moveToElement(inStockButton).click(addToCartButton).build().perform();
	}

	@Given("^I click on the Proceed to checkout button$")
	public void clickOnProceedToCheckoutButton() throws Throwable {
		throw new PendingException();
	}

	@Given("^I click on the Proceed to checkout button on the shopping cart summary page$")
	public void clickProceedToCheckoutOnshoppingCartSummaryPage() throws Throwable {
		throw new PendingException();
	}

	@Given("^I select the I agree to terms of service checkbox$")
	public void i_select_the_I_agree_to_terms_of_service_checkbox() throws Throwable {
		WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]"));
		proceedToCheckoutButton.click();
	}

	@When("^I click on the 'Pay by bank wire' button$")
	public void i_click_on_the_Pay_by_bank_wire_button() throws Throwable {
		throw new PendingException();
	}

	@Then("^I can confirm my order has been placed$")
	public void i_can_confirm_my_order_has_been_placed() throws Throwable {
		throw new PendingException();
	}

	@After
	public void cleanUp() throws Exception {
		Functions.closeDriver(driver);
	}

}
