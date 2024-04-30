package Com.Winvest.pageojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Inkprog.WinvestAppTestAbstract.WaitsAbstractMethods;

public class BussinesInformationPageObjects extends WaitsAbstractMethods {
	WebDriver driver;

	public BussinesInformationPageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = ":r0:")
	WebElement emil_id;
	@FindBy(xpath = "//button[text()='Send OTP']")
	WebElement Send_OPT;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement SubmitOtp;
	@FindBy(xpath = "//div[@id=\"root\"]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/span/a")
	WebElement FinacialButton;

	@FindBy(xpath = "//div[@id=\"form\"]/input[1]")
	WebElement year;
	@FindBy(xpath = "//select[@id=\"month\"]/option[7]")
	WebElement months;
	@FindBy(id = "text")
	WebElement Amount;
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement SubmitData;
	@FindBy(xpath = "//option[text()='2023']")
	WebElement DropDown;
	@FindBy(xpath = "//div[@class=\"graph\"]")
	WebElement GraphAlignment;
	@FindBy(xpath = "//button[text()='Profit']")
	WebElement profittab;
	@FindBy(xpath = "//button[text()='GMV / Collection']")
	WebElement GMVCollectiontab;
	@FindBy(xpath = "//button[text()='Transaction']")
	WebElement Trancationtab;

	public void VerifyLandingPage(String email) throws InterruptedException {

		emil_id.sendKeys(email);
		Send_OPT.click();
		Thread.sleep(20000);
		SubmitOtp.click();
	}

	public void verifyFinacialButton() throws Exception {

		FinacialButton.click();

	}

	public void verifyProfittab() {

		profittab.click();
	}

	public void verifyGmvcolectionTab() {
		GMVCollectiontab.click();
	}

	public void verifyTracationtab() {
		Trancationtab.click();
	}

	public boolean verifyAmountData(String years, String amount) {

		year.sendKeys(years);
		months.click();
		Amount.sendKeys(amount);
		SubmitData.click();
		boolean submitbutton = SubmitData.isEnabled();
		return submitbutton;

	}

	public boolean verifyDropdwon() {
		DropDown.click();
		boolean dropdown1 = DropDown.isSelected();
		return dropdown1;
	}

	public int verifygraphhightAligment() {

		GraphAlignment.click();
		int height = GraphAlignment.getRect().getHeight();
		return height;

	}

	public int verifygraphWidthAligment() {

		int width = GraphAlignment.getRect().getWidth();
		return width;

	}

}
