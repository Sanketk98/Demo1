package Com.Inkprog.WinvestAppTest.winvest.components;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Com.Winvest.pageojects.BussinesInformationPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {

	public static WebDriver driver;

	BussinesInformationPageObjects base;

	@BeforeTest
	public void setUp() {

		WebDriverManager.chromedriver().setup();

		base = new BussinesInformationPageObjects(driver);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();

		String url = "http://ec2-18-60-39-230.ap-south-2.compute.amazonaws.com:3005/login";

		driver.get(url);
		String strurl = driver.getCurrentUrl();
		System.out.println("This is current url" + strurl);
		assertEquals(strurl, url);

		driver.findElement(By.id(":r0:")).sendKeys("inkprog3@gmail.com");

		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		System.out.println("successfully login completed");

		driver.findElement(

				By.xpath("//div[@id=\"root\"]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/span/a")).click();

	}

	@AfterTest
	public void down() {

		driver.close();
	}

}
