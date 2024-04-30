package Com.Inkprog.WinvestAppTestAbstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsAbstractMethods {
	WebDriver driver;

	public WaitsAbstractMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void visibilityWait(By locator, long value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(value));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
		

}
