package Com.winvest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Winvest.pageojects.BussinesInformationPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GraphData {
	WebDriver driver;
	BussinesInformationPageObjects base;

	@BeforeTest
	public void tearDown() throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		base = new BussinesInformationPageObjects(driver);

		String url = "http://ec2-18-60-39-230.ap-south-2.compute.amazonaws.com:3005/login";

		driver.get(url);
		String strurl = driver.getCurrentUrl();

		Assert.assertEquals(strurl, url);

		base.VerifyLandingPage("inkprog3@gmail.com");

		Thread.sleep(1000);

		base.verifyFinacialButton();
	}

	@Test(priority = 1)
	public void revenuvePopMessage() throws Exception {
		Thread.sleep(2000);

		boolean verifysubmitbutton1 = base.verifyAmountData("2041", "100");

		Assert.assertTrue(verifysubmitbutton1, "The popup message is displayed and button is working");
	}

	@Test(priority = 2)
	public void rvenuveDropDown() throws Exception {
		Thread.sleep(2000);

		boolean Dropdown1 = base.verifyDropdwon();

		Assert.assertTrue(Dropdown1, "This DropDown is open and working");
	}

	@Test(priority = 3)
	public void revunveGraphAligment() throws Exception {
		Thread.sleep(2000);
		int hight1 = base.verifygraphhightAligment();
		Assert.assertTrue(hight1 == 256, "The  hight is correct");

		int width1 = base.verifygraphWidthAligment();
		Assert.assertTrue(width1 == 725, "The width is correct");

		base.verifyProfittab();
	}

	@Test(priority = 4)
	public void profitPopMessage() throws Exception {
		Thread.sleep(2000);

		boolean verifysubmitbutton2 = base.verifyAmountData("2041", "1000");

		Assert.assertTrue(verifysubmitbutton2, "The popup message is displayed and button is working");
	}

	@Test(priority = 5)
	public void profitDropDown() throws Exception {
		Thread.sleep(2000);

		boolean Dropdown2 = base.verifyDropdwon();
		Assert.assertTrue(Dropdown2, "The Dropdown is open and working");
	}

	@Test(priority = 6)
	public void profitGraphAligment() throws Exception {
		Thread.sleep(2000);
		int hight2 = base.verifygraphhightAligment();
		Assert.assertTrue(hight2 == 256, "The  hight is correct");
		int width2 = base.verifygraphWidthAligment();
		Assert.assertTrue(width2 == 725, "The width is correct");

		base.verifyGmvcolectionTab();
	}

	@Test(priority = 7)
	public void Gmv_collectionPopMessage() throws Exception {
		Thread.sleep(2000);
		boolean verifysubmitbutton3 = base.verifyAmountData("2041", "100");
		Assert.assertTrue(verifysubmitbutton3, "The popup message is displayed and button is working");
	}

	@Test(priority = 8)
	public void Gmv_collectionDropDown() throws Exception {
		Thread.sleep(2000);
		boolean Dropdwon3 = base.verifyDropdwon();
		Assert.assertTrue(Dropdwon3, "The Dropdown is open and working");
	}

	@Test(priority = 9)
	public void Gmv_collectionGraphAligment() throws Exception {
		Thread.sleep(2000);
		int hight3 = base.verifygraphhightAligment();
		Assert.assertTrue(hight3 == 256, "The  hight is correct");
		int width3 = base.verifygraphWidthAligment();

		Assert.assertTrue(width3 == 718, "The width is correct");

		base.verifyTracationtab();
	}

	@Test(priority = 10)
	public void trancationPopMessage() throws Exception {
		Thread.sleep(2000);
		boolean verifysubmitbutton4 = base.verifyAmountData("2041", "200");
		Assert.assertTrue(verifysubmitbutton4, "The popup message is displayed and button is working");
	}

	@Test(priority = 11)
	public void trancationDropDown() throws Exception {
		Thread.sleep(2000);
		boolean DropDown4 = base.verifyDropdwon();
		Assert.assertTrue(DropDown4, "The DropDwon is open and working");
	}

	@Test(priority = 12)
	public void trancationGraphAligment() throws Exception {
		Thread.sleep(2000);
		int hight4 = base.verifygraphhightAligment();
		Assert.assertTrue(hight4 == 256, "The  hight is correct");
		int width4 = base.verifygraphWidthAligment();
		Assert.assertTrue(width4 == 718, "The width is correct");

	}

}
