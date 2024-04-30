package Com.winvest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Com.Winvest.pageojects.BussinesInformationPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GraphData2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		BussinesInformationPageObjects base = new BussinesInformationPageObjects(driver);

		String url = "http://ec2-18-60-39-230.ap-south-2.compute.amazonaws.com:3005/login";

		driver.get(url);
		String strurl = driver.getCurrentUrl();
		System.out.println("This is current url" + strurl);

		driver.findElement(By.id(":r0:")).sendKeys("inkprog3@gmail.com");

		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		System.out.println("successfully login completed");
		Thread.sleep(2000);
		driver.findElement(

				By.xpath("//div[@id=\"root\"]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/span/a")).click();

		driver.findElement(By.xpath("//div[@id=\"form\"]/input[1]")).sendKeys("2023");
		driver.findElement(By.xpath("//select[@id=\"month\"]/option[7]")).click();
		driver.findElement(By.id("text")).sendKeys("5000");
		WebElement submit = driver.findElement(By.xpath("//input[@type=\"submit\"]"));

		submit.click();

		/*
		 * if (element) { System.out.println("Pop massage is display"); } else {
		 * System.out.println("Pop massage is not display"); }
		 */

		Assert.assertTrue(submit.isEnabled(), "This button is enable and working");

		WebElement dp = driver.findElement(By.xpath("//option[text()='2023']"));
		dp.click();
		boolean element1 = dp.isSelected();
		if (element1) {
			System.out.println("Dropdown is open ");

		} else {
			System.out.println("Dropdown is not open");

		}

		WebElement HW = driver.findElement(By.xpath("//div[@class=\"graph\"]"));

		int hight1 = HW.getRect().getHeight();
		int width1 = HW.getRect().getWidth();

		if (hight1 == 256 && width1 == 725) {
			System.out.println("the aligment height & width are matching expected data");
		} else {
			System.out.println("the aligment height & width are not matching expected data");

		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Profit']")).click();

		driver.findElement(By.xpath("//div[@id=\"form\"]/input[1]")).sendKeys("2023");

		driver.findElement(By.xpath("//select[@id=\"month\"]/option[3]")).click();
		driver.findElement(By.id("text")).sendKeys("4000");
		WebElement submitbutton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		submitbutton.click();
		boolean element2 = submitbutton.isEnabled();
		if (element2) {
			System.out.println("Pop message is display1");
		} else {
			System.out.println("Pop message is not display1");
		}

		WebElement dropdown = driver.findElement(By.xpath("//option[text()='2023']"));
		dropdown.click();
		boolean element3 = dropdown.isSelected();
		if (element3) {
			System.out.println("Dropdown is open ");

		} else {
			System.out.println("Dropdown is not open");
		}

		WebElement S1 = driver.findElement(By.xpath("//div[@class=\"graph\"]"));
		int hight2 = S1.getRect().getHeight();
		int width2 = S1.getRect().getWidth();

		if (hight2 == 256 && width2 == 725) {
			System.out.println("the aligment height & width are matching expected data");
		} else {
			System.out.println("the aligment height & width are not matching expected data");
		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='GMV / Collection']")).click();

		driver.findElement(By.xpath("//div[@id=\"form\"]/input[1]")).sendKeys("2022");

		driver.findElement(By.xpath("//select[@id=\"month\"]/option[6]")).click();
		driver.findElement(By.id("text")).sendKeys("4000");
		WebElement submitbutton1 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		submitbutton1.click();

		boolean element4 = submitbutton1.isEnabled();
		if (element4) {
			System.out.println("Pop massage is display");
		} else {
			System.out.println("Pop massage is not display");
		}

		WebElement dd = driver.findElement(By.xpath("//option[text()='2022']"));
		dd.click();
		boolean element5 = dd.isSelected();
		if (element5) {
			System.out.println("Dropdown is open ");

		} else {
			System.out.println("Dropdown is not open");

		}

		WebElement S2 = driver.findElement(By.xpath("//div[@class=\"graph\"]"));
		int hight4 = S2.getRect().getHeight();
		int width4 = S2.getRect().getWidth();
		if (hight4 == 256 && width4 == 725) {
			System.out.println("the aligment height & width are matching expected data");
		} else {
			System.out.println("the aligment height & width are not matching expected data");
		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Transaction']")).click();

		driver.findElement(By.xpath("//div[@id=\"form\"]/input[1]")).sendKeys("2016");

		driver.findElement(By.xpath("//select[@id=\"month\"]/option[3]")).click();
		driver.findElement(By.id("text")).sendKeys("4000");
		WebElement S3 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		S3.click();
		boolean element6 = S3.isEnabled();
		if (element6) {
			System.out.println("Pop message is display2");
		} else {
			System.out.println("Pop message is not display2");
		}

		WebElement dd1 = driver.findElement(By.xpath("//option[text()='2023']"));
		dd1.click();
		boolean element7 = dd1.isSelected();
		if (element7) {
			System.out.println("Dropdown is open ");

		} else {
			System.out.println("Dropdown is not open");
		}

		WebElement HW2 = driver.findElement(By.xpath("//div[@class=\"graph\"]"));
		int hight5 = HW2.getRect().getHeight();
		int width5 = HW2.getRect().getWidth();
		if (hight5 == 256 && width5 == 725) {
			System.out.println("the aligment height & width are matching expected data");
		} else {
			System.out.println("the aligment height & width are not matching expected data");
		}
		Thread.sleep(5000);
	}
}
