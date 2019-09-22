package Tests;

import Utilities.Functions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditProfileSteps {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = Functions.getDriver();
		driver.manage().window().maximize();
	}

	@Given("^I click on the User Header Info button$")
	public void clikOnHeaderInfoButton() throws Throwable {
		WebElement headerInfoButton = driver.findElement(By.className("account"));
		headerInfoButton.click();
	}

	@Given("^I click on the My Personal Information button$")
	public void clickOnMyPersonalInformationButton() throws Throwable {
		WebElement personalInfoButton = driver.findElement(By.xpath("//i[@class=\"icon-user\"]"));
		personalInfoButton.click();
	}

	@Given("^I change my first name to be 'Frederick'$")
	public void changeFirstName() throws Throwable {
		WebElement firstNameField = driver.findElement(By.id("firstname"));
		firstNameField.clear();
		firstNameField.sendKeys("Frederick");
	}

	@Given("^I enter my current password as 'Selenium(\\d+)'$")
	public void enterCUrrentPassword(int arg1) throws Throwable {
		WebElement currentPasswordField = driver.findElement(By.id("old_passwd"));
		currentPasswordField.sendKeys("Selenium123");
	}

	@When("^I click on the Save button$")
	public void i_click_on_the_Save_button() throws Throwable {
		WebElement saveButton = driver.findElement(By.xpath("//span[contains(., \"Save\")]"));
		saveButton.click();
	}

	@Then("^I should see a success message saying 'Your personal information has been successfully updated\\.'$")
	public void verifySuccessMessageIsDisplayed() throws Throwable {
		String expectedSuccessMessage = "Your personal information has been successfully updated.";
		WebElement displayedMessageBanner = driver.findElement(By.xpath("//p[@class = \"alert alert-success\"]"));
		String actualSuccessMessage = displayedMessageBanner.getText();

		assertEquals(expectedSuccessMessage, actualSuccessMessage);
	}

}
