package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions {

	private static WebDriver webDriver;

	public static WebDriver getDriver() {
		if (webDriver == null) {
			webDriver = new ChromeDriver();
		}
		return webDriver;
	}

	public static void closeDriver(WebDriver webDriver) throws Exception {
		if (webDriver != null) {
			try {
				webDriver.close();
			} catch (Exception ex) {
				throw new Exception("An error occured while trying to close the webdriver" + ex.getMessage());
			}
		}
	}

}
