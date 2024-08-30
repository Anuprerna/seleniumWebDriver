package seleniumWebDriver;

import static org.testng.Assert.assertEquals;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HMModule {
	@BeforeTest
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","D:\\Amit\\WebDrivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");

		//FirefoxDriver VG = new FirefoxDriver();
		WebDriver VG=new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver();
		VG.get("https://qa.lemniska.com/");
		VG.manage().window().maximize();
		Thread.sleep(5000);

		/// To click on get started
		WebElement GetStartedNow = VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));
		if (GetStartedNow.isEnabled()) {
			System.out.println("Test Case 0 :Get started icon is present -Test Case Passed");
		} else {
			System.out.println("Test Case 0:Get started is Not present -Test Case Failled");
		}
		Thread.sleep(2000);
		/*
		WebElement okayicon = VG.findElement(By.className("LMokaybtnforal"));
		System.out.println("Test Case 1 :Banner present and selected -Test Case Passed");
		okayicon.click();
		Thread.sleep(2000);
		 */
		
		GetStartedNow.click();
		System.out.println("Test Case 2 :Get started icon is present and selected -Test Case Passed");
		Thread.sleep(5500);

//Dropdown is selected 
		WebElement Dropdown = VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Dropdown.click();
		System.out.println("Test Case 3 :Dropdown is selected  -Test Case Passed");

		Thread.sleep(2000);
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(8000);

// To enter the valid email and password 
		WebElement EmailAddress = VG.findElement(By.id("Email"));
		EmailAddress.sendKeys("priya00@yopmail.com");//wj916137@gmail.com
		System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
		Thread.sleep(2000);

		WebElement Password = VG.findElement(By.id("Password"));
		Password.sendKeys("Priya@6767");//Singh@123
		System.out.println("Test Case 5 :password is added  -Test Case Passed");
		Thread.sleep(2500);

//To click on eye icon
		// To click on eye icon
		WebElement Eyeicon = VG.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/span[1]"));
		Eyeicon.click();
		Eyeicon.click();
		System.out.println("Test Case 6 :Eye icon is pressed  -Test Case Passed");

		Thread.sleep(2000);
		Eyeicon.click();
		System.out.println("Test Case 7 :Eye icon is pressed  -Test Case Passed");

		VG.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Test Case 8 :remember me is clicked  -Test Case Passed");

		WebElement Loginicon = VG.findElement(By.xpath("//input[@id='loginBttn']"));
		Loginicon.click();
		System.out.println("Test Case 9 :Login icon is selected -Test Case Passed");

		Thread.sleep(5000);
		VG.findElement(By.className("LMgoit")).click();
		Thread.sleep(2000);
	}

	/////////////////////////////////////////// To test the share icon feature
	@Test
	public void A() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Amit\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver VG=new ChromeDriver();
		//ChromeDriver VG = new ChromeDriver();
		
		VG.get("https://www.lemniska.com/");
		VG.manage().window().maximize();
		Thread.sleep(5000);

		/// To click on get started
		WebElement GetStartedNow = VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));
		if (GetStartedNow.isEnabled()) {
			System.out.println("Test Case 1 :Get started icon is present -Test Case Passed");
		} else {
			System.out.println("Test Case 1 :Get started is Not present -Test Case Failled");
		}
		Thread.sleep(2000);
		WebElement okayicon = VG.findElement(By.className("LMokaybtnforal"));
		okayicon.click();
		Thread.sleep(2000);

		GetStartedNow.click();
		System.out.println("Test Case 2 :Get started icon is present and se3ected -Test Case Passed");
		Thread.sleep(5500);

//Dropdown is selected 
		WebElement Dropdown = VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Dropdown.click();
		System.out.println("Test Case 3 :Dropdown is selected  -Test Case Passed");

		Thread.sleep(2000);
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(8000);

// To enter the valid email and password 
		WebElement EmailAddress = VG.findElement(By.id("Email"));
		EmailAddress.sendKeys("priya00@yopmail.com");
		System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
		Thread.sleep(2000);

		WebElement Password = VG.findElement(By.id("Password"));
		Password.sendKeys("Priya@6767");
		System.out.println("Test Case 5 :password is added  -Test Case Passed");
		Thread.sleep(2500);

//To click on eye icon
		// To click on eye icon
		WebElement Eyeicon = VG.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/span[1]"));
		Eyeicon.click();
		Eyeicon.click();
		System.out.println("Test Case 6 :Eye icon is pressed  -Test Case Passed");

		Thread.sleep(2000);
		Eyeicon.click();
		System.out.println("Test Case 7 :Eye icon is pressed  -Test Case Passed");

		VG.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Test Case 8 :remember me is clicked  -Test Case Passed");

		WebElement Loginicon = VG.findElement(By.xpath("//input[@id='loginBttn']"));
		Loginicon.click();
		System.out.println("Test Case 9 :Login icon is selected -Test Case Passed");

		Thread.sleep(5000);
		VG.findElement(By.className("LMgoit")).click();
		Thread.sleep(2000);
		// to find the comment icon of food lovers post

		VG.findElement(By.className("icon-here")).click();
		Thread.sleep(2500);
		System.out.println("Test case 10 : comment icon is selected -Test Case Passed");
		// to enter the comment in comment Box and save

		//

		// to clear the content
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		VG.findElement(By.className("CommentText")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2500);
		System.out.println("Test case 11 : To clear the content-Test Case Passed");

		VG.findElement(By.className("CommentText")).sendKeys("owsm...........");

		System.out.println("Test case 12 : content on the comment page is added-Test Case Passed");
		Thread.sleep(2500);

		// to click on save

		VG.findElement(By.className("fa-send")).click();
		System.out.println("Test case 13 : Save icon is selected-Test Case Passed");
		Thread.sleep(5500);
		System.out.println("Add comment is working succesfully-Test Case Passed");

		// to share the post

		VG.findElement(By.className("share-icon-1967886430")).click();
		Thread.sleep(2000);
		WebElement sharetofeed = VG.findElement(By.className("editPost"));
		if (sharetofeed.isEnabled()) {
			System.out.println("Test Case 14 : share to feed is Present-Test Case Passed-Test Case Passed");
		} else {
			System.out.println("Test Case 14 : share to feed  is Not Present-Test Case Failled");
		}
		Thread.sleep(1000);
		WebElement copylink = VG.findElement(By.className("copy-post-link"));
		if (copylink.isEnabled()) {
			System.out.println("Test Case 15 : copylink is Present-Test Case Passed-Test Case Passed");
		} else {
			System.out.println("Test Case 15 : copylink  is Not Present-Test Case Failled");
		}
		Thread.sleep(3000);

		// to click the share icon

		VG.findElement(By.className("share-on-feed-link-1967886430")).click();
		System.out.println("Test Case 16 : Share on feed icon is selected-Test Case Passed");
		Thread.sleep(2000);

		// to click on share
		VG.findElement(By.id("EditPostBtn")).click();
		System.out.println("Test Case 17 : Share icon is selected");
		Thread.sleep(2000);
		// String title=VG.findElement(By.className("mt-0").getText();

		// guri tutorial
		System.out.println(
				"Test Case 18 : Title after the share post is : " + VG.findElement(By.className("mt-0")).getText());
		System.out.println("Test Case 19 : Share icon is working as expected");

		// to click on the link
		VG.findElement(By.className("share-icon-1967886430")).click();
		System.out.println("Test Case 20 : Share icon is selected-Test Case Passed");
		Thread.sleep(2000);

		// to test the copy past link
		WebElement link = VG.findElement(By.className("copy-link-1967886430"));
		System.out.println("Test Case 21 : Copy Link icon is selected-Test Case Passed");
		link.click();
		link.toString();
		System.out.println(link);
		System.out.println("Test Case 22 : Link content is pasted-Test Case Passed");

		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

		System.out.println("Test Case 23 : Title after the share post is : " + myText);
		System.out.println("Comments and Share Module is working as expected");
		VG.quit();

	}

	/////////////////////////// To test the User name feature

	@Test
	public void B() throws HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Amit\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver VG = new ChromeDriver();
		VG.get("https://www.lemniska.com/");
		VG.manage().window().maximize();
		Thread.sleep(5000);

		/// To click on get started
		WebElement GetStartedNow = VG
				.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));
		if (GetStartedNow.isEnabled()) {
			System.out.println("Test Case 1 :Get started icon is present -Test Case Passed");
		} else {
			System.out.println("Test Case 1 :Get started is Not present -Test Case Failled");
		}
		Thread.sleep(2000);

		WebElement okayicon = VG.findElement(By.className("LMokaybtnforal"));
		okayicon.click();
		Thread.sleep(2000);

		GetStartedNow.click();
		System.out.println("Test Case 2 :Get started icon is present and se3ected -Test Case Passed");
		Thread.sleep(5500);

//Dropdown is selected 
		WebElement Dropdown = VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Dropdown.click();
		System.out.println("Test Case 3 :Dropdown is selected  -Test Case Passed");

		Thread.sleep(2000);
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(8000);

// To enter the valid email and password 
		WebElement EmailAddress = VG.findElement(By.id("Email"));
		EmailAddress.sendKeys("merry@biyac.com");
		System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
		Thread.sleep(2000);

		WebElement Password = VG.findElement(By.id("Password"));
		Password.sendKeys("123456789");
		System.out.println("Test Case 5 :password is added  -Test Case Passed");
		Thread.sleep(2500);

//To click on eye icon
		// To click on eye icon
		WebElement Eyeicon = VG.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/span[1]"));
		Eyeicon.click();
		Eyeicon.click();
		System.out.println("Test Case 6 :Eye icon is pressed  -Test Case Passed");

		Thread.sleep(2000);
		Eyeicon.click();
		System.out.println("Test Case 7 :Eye icon is pressed  -Test Case Passed");

		VG.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Test Case 8 :remember me is clicked  -Test Case Passed");

		WebElement Loginicon = VG.findElement(By.xpath("//input[@id='loginBttn']"));
		Loginicon.click();
		System.out.println("Test Case 9 :Login icon is selected -Test Case Passed");

		Thread.sleep(5000);
		VG.findElement(By.className("LMgoit")).click();
		Thread.sleep(2000);

		String userName = VG.findElement(By.className("sf-displaynamee")).getText();
		System.out.println("Name of the User Logged in is :" + userName);
		System.out.println("Test case 10 : Logged user name is fetched");

		Thread.sleep(2500);

		// to to test the Home section from the menu bar

		WebElement VGhome = VG.findElement(By.className("hmbbthome"));
		((JavascriptExecutor) VG).executeScript("arguments[0].scrollIntoView();", VGhome);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);

		// to click on profile icon
		VG.findElement(By.className("hhm-profile-icon")).click();
		System.out.println("Test Case 11 :Profile  icon is selected-Test Case Passed");
		Thread.sleep(2500);

		// to fetch the name of the user in the profile

		String userNameinsideprofile = VG.findElement(By.className("profile-owner-name")).getText();
		System.out.println("Name of the User Logged in is :" + userNameinsideprofile);
		System.out.println("Test case 12 : User name inside profile is fetched -Test Case Passed");

		// to validate

		assertEquals(userName, userNameinsideprofile);
		System.out.println("Test case 13 : Assert for the user name is Passed");

		// to enter the menu drop down
		VG.findElement(By.className("fa-caret-down")).click();
		Thread.sleep(3000);
		System.out.println("Test case 14 : Assert for Social URL is passed");
		// To click on the settings from menu

		VG.findElement(By.className("user-settings")).click();
		System.out.println("Test case 15 : User settings is clicked-Test Case Passed");
		Thread.sleep(3000);

		// to fetch the user name

		String usernameundersettings = VG.findElement(By.xpath("//td[contains(text(),'Merry Dicosta')]")).getText();
		System.out.println("Name of the User Logged in is :" + usernameundersettings);
		System.out.println("Test case 16 : User name under settings is fetched-Test Case Passed");
		Thread.sleep(2500);

		// validation of the name from settings to the logged user name
		assertEquals(userName, userNameinsideprofile);
		System.out.println("Test case 17 : Assert for the user name is Passed");

		// to click on the edit profile

		VG.findElement(By.className("HMEDIT-BIOlink")).click();
		System.out.println("Test case 18 : Edit icon under the settings is Clicked-Test Case Passed");
		Thread.sleep(3000);

		// String Firstname=VG.findElement(By.Id("FirstName").getText();
		// System.out.println("Assert for the user name is Passed");

		// String LastName=VG.findElement(By.Id("LastName").getText();
		// System.out.println("Assert for the user name is Passed");

		// to validate the name of the user from the loged in to

		VG.findElement(By.id("FirstName")).sendKeys(Keys.CONTROL, "A");
		VG.findElement(By.id("FirstName")).sendKeys(Keys.CONTROL, "C");

		String Userfirstname = (String) Toolkit.getDefaultToolkit().getSystemClipboard()
				.getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
		System.out.println("Test Case 19 : Title after the share post is : " + Userfirstname);

		// last name
		VG.findElement(By.id("LastName")).sendKeys(Keys.CONTROL, "A");
		VG.findElement(By.id("LastName")).sendKeys(Keys.CONTROL, "C");

		String Userlastname = (String) Toolkit.getDefaultToolkit().getSystemClipboard()
				.getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
		System.out.println("Test Case 20 : Title after the share post is : " + Userlastname);

		String usernamejoined = Userfirstname + " " + Userlastname;
		System.out.println("User Name is : " + usernamejoined);
		assertEquals(userName, usernamejoined);
		System.out.println("Test case 21 : Assert for the user name is Passed");

		// to enter the Healthy Media
		VG.findElement(By.className("VGHM")).click();
		VG.quit();
		System.out.println("configuration -B-User name module is working as expected");

	}

	///////////////////////////// To Test the scheudled
	///////////////////////////// post////////////////////////////////////
	@Test
	public void C() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Amit\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver VG = new ChromeDriver();
		VG.get("https://www.lemniska.com/");
		VG.manage().window().maximize();
		Thread.sleep(5000);

		/// To click on get started
		WebElement GetStartedNow = VG
				.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));
		if (GetStartedNow.isEnabled()) {
			System.out.println("Test Case 1 :Get started icon is present -Test Case Passed");
		} else {
			System.out.println("Test Case 1 :Get started is Not present -Test Case Failled");
		}
		Thread.sleep(2000);

		WebElement okayicon = VG.findElement(By.className("LMokaybtnforal"));
		okayicon.click();
		Thread.sleep(2000);

		GetStartedNow.click();
		System.out.println("Test Case 2 :Get started icon is present and se3ected -Test Case Passed");
		Thread.sleep(5500);

//Dropdown is selected 
		WebElement Dropdown = VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Dropdown.click();
		System.out.println("Test Case 3 :Dropdown is selected  -Test Case Passed");

		Thread.sleep(2000);
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(8000);

// To enter the valid email and password 
		WebElement EmailAddress = VG.findElement(By.id("Email"));
		EmailAddress.sendKeys("kurt@biyac.com");
		System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
		Thread.sleep(2000);

		WebElement Password = VG.findElement(By.id("Password"));
		Password.sendKeys("123456789");
		System.out.println("Test Case 5 :password is added  -Test Case Passed");
		Thread.sleep(2500);

//To click on eye icon
		// To click on eye icon
		WebElement Eyeicon = VG.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/span[1]"));
		Eyeicon.click();
		Eyeicon.click();
		System.out.println("Test Case 6 :Eye icon is pressed  -Test Case Passed");

		Thread.sleep(2000);
		Eyeicon.click();
		System.out.println("Test Case 7 :Eye icon is pressed  -Test Case Passed");

		VG.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Test Case 8 :remember me is clicked  -Test Case Passed");

		WebElement Loginicon = VG.findElement(By.xpath("//input[@id='loginBttn']"));
		Loginicon.click();
		System.out.println("Test Case 9 :Login icon is selected -Test Case Passed");

		Thread.sleep(5000);
		VG.findElement(By.className("LMgoit")).click();
		Thread.sleep(2000);
		// to enter the home screen
		VG.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]")).click();
		Thread.sleep(5500);
		System.out.println("Test Case 10 :Home icon is selected ");
		// to check the create post
		// via text
		WebElement CreatePostviatext = VG.findElement(By.className("txtphvi-item"));
		CreatePostviatext.click();
		Thread.sleep(2500);
		System.out.println("Test Case 11 :Create Post is selected via text icon");

		Thread.sleep(2500);

		WebElement PostText = VG.findElement(By.xpath("//div[@id='PostText']"));
		PostText.sendKeys("This is You this is me this is all we need");
		System.out.println("Test Case 12 : Text under the Post is added ");
		Thread.sleep(5000);

		JavascriptExecutor js = VG;
		// to click on schedule post and pick date
		WebElement scheduledpostdate = VG.findElement(By.id("ShowPostSchedule"));
		scheduledpostdate.click();
		Thread.sleep(2000);
		System.out.println("Test Case 13 : Schedule post date is selected-Test case Passed");
		js.executeScript("window.scrollBy(0,10000)");

		// to fetch the title and validate the same
		String Schedulecalendarpost = VG.findElement(By.className("calendar-title")).getText();
		Assert.assertEquals(Schedulecalendarpost, "Schedule Post");
		System.out.println("Test Case 14 : Assert is Working-Test case Passed");
		Thread.sleep(2000);

		/// to close the pop up

		VG.findElement(By.id("closePostScheduleCalender")).click();
		System.out.println("Test Case 15 : Pop up is closed-Test case Passed");
		Thread.sleep(2000);
		scheduledpostdate.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,10000)");

		WebElement SCPT = VG.findElement(By.className("calendar-title"));
		System.out.println("Title is : " + SCPT.getText());
		System.out.println("Test Case 16 : Title is received-Test case Passed");
		// to enter the calendar

		VG.findElement(By.xpath("//*[@id=\"CalendarDiv\"]/div/div[1]/table/tbody/tr[6]/td[7]")).click();
		System.out.println("Test Case 17 : User entered the calender screen-Test case Passed");

		// to add the post
		VG.findElement(By.id("AddPostBtn")).click();
		Thread.sleep(8500);
		System.out.println("Test Case 18 : Add post icon is selected-Test case Passed");

		String Titlename = VG.findElement(By.className("schedule-post-title")).getText();
		String ExpectedTitle = ("Scheduled Post List");
		Assert.assertEquals(Titlename, ExpectedTitle);
		System.out.println("Test Case 19 : Assert is passed-Test case Passed");

		// to get the tool tipe text

		System.out.println(" Text is" + VG.findElement(By.className("fa-info")));
		//// String tooltipText = TTIP.getAttribute("hmtooltiptext");
		// System.out.println("title is : "+tooltipText);
		System.out.println("Test Case 20 : Text is received from tooltip-Test case is passed");

		// to logout the user and login edgar
///////////////To click on the Menu bar and ///////////////////////////////									

		WebElement Menudropdowniconforlogout = VG.findElement(By.className("fa-caret-down"));
		Thread.sleep(3000);
		Menudropdowniconforlogout.click();
		System.out.println("Test case 21 : Menu bar is opened and User is able to Check the Menu Bar");

////////////////////////////////To logout ////////////////////////////////									
		WebElement Logout = VG
				.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[2]/div/div[2]/div/div/ul/li[4]/a"));
		Logout.click();
		Thread.sleep(5000);
		System.out.println("Test Case 22 : Logout is selected-Test case Passed");
		WebElement Cancelicon = VG.findElement(By.className("bootbox-cancel"));
		Cancelicon.click();
		Thread.sleep(2000);
		System.out.println("Test Case 23  : Cancel icon is selected-Test case Passed");

		WebElement Menudropdowniconforlogout1 = VG.findElement(By.className("fa-caret-down"));
		Thread.sleep(3000);
		Menudropdowniconforlogout1.click();
		System.out.println("Test case 24 : Menu bar is opened and User is able to Check the Menu Bar-Test case Passed");
		WebElement logout1 = VG
				.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[2]/div/div[2]/div/div/ul/li[4]/a"));
		Thread.sleep(3000);
		logout1.click();
		System.out.println("Test case 25 : Menu bar is opened and User is able to Check the Menu Bar for logout ");
		Thread.sleep(5000);
		WebElement OK = VG.findElement(By.xpath("//button[normalize-space()='Yes']"));
		OK.click();

		System.out.println("Test Case 26 : Yes is selected -Test case passed ");

		////////////////////////////// To enter the email and password and check for the
		////////////////////////////// icon again
		VG.findElement(By.xpath("//input[@id='Email']")).clear();
		System.out.println("Test Case 27 : Previous email is cleared -Test case Passed");
		Thread.sleep(2000);
		VG.findElement(By.xpath("//input[@id='Email']")).sendKeys("edgar@biyac.com");
		System.out.println("Test Case 28 : Edgar reade credential are added ");
		VG.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		Thread.sleep(3500);

		System.out.println("Test Case 29 :Email and Password is entered Succesfully ");
		VG.findElement(By.xpath("//input[@id='loginBttn']")).click();
		Thread.sleep(5500);
		System.out.println("Test Case 30 :User is Logged in Succesfully ");

		///
		// to add the post
		// VG.findElement(By.Id("AddPostBtn").click();
		// Thread.sleep(8500);

		System.out.println(" Test Case 31 : Scheudle post for Kurt Vincent is added Succesfully");

		// to enter the edgar reade Social media profile
		// WebElement Social1=VG.findElement(By.className("VGHM");
		// Social1.click();
		// System.out.println("Test Case 26 : Healthy Media is Selected ");
		// Thread.sleep(4000);

		WebElement VGhome = VG.findElement(By.className("hmbbthome"));
		((JavascriptExecutor) VG).executeScript("arguments[0].scrollIntoView();", VGhome);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);

		System.out.println("Test Case 32 : Arrow down key is presseed-Test case Passed");
		Thread.sleep(2000);
		// to enter the scheduled post
		WebElement Spost = VG
				.findElement(By.xpath("//a[@class='hmbbtSCHEPOST schld-post']//p[contains(text(),'Scheduled Posts')]"));
		Spost.click();
		System.out.println("Test Case 33 : User Entered the Schedule post screen-Test case Passed ");

		String postcontent = VG.findElement(By.className("font-14")).getText();
		System.out.println("Content is " + postcontent);

		// to pick date

		String Date = VG.findElement(By.className("ScheduledPostDate")).getText();
		System.out.println(" Date is " + Date);
		// to click on the view post
		WebElement Viewposts = VG.findElement(By.linkText("View Post"));

		Viewposts.click();
		System.out.println("Test case 34 : View post page is opened-Test case Passed");
		// to enter the new page

		ArrayList SCPost = new ArrayList(VG.getWindowHandles());
		VG.switchTo().window((String) SCPost.get(1));
		Thread.sleep(2000);
		// String SCPURL=VG.getCurrentUrl();
		// assertEquals(SCPURL, "https://lemniska.com/my-scheduled-post");
		// System.out.println("Test case 29 : Assert for URL is passed");
		// ArrayList SCPostback=new ArrayList(VG.getWindowHandles());
		// VG.switchTo().window((String)SCPost.get(0));

		/// validate the icons

		// to validate the create post is there
		WebElement CreatePostSCP = VG.findElement(By.className("txtphvi-item"));
		CreatePostSCP.click();
		Thread.sleep(2500);
		System.out.println("Test Case 35 :Create Post is selected via text icon-Test case Passed");

		Thread.sleep(2500);
		VG.findElement(By.id("createPostPopUpClose")).click();

		// validate the content
		// pick post content from previous screen
		String viewpostcontent = VG.findElement(By.className("blogBody")).getText();
		System.out.println("Test " + viewpostcontent);
		// Assert.assertEquals(postcontent, "This is the Post for automation
		// validation");

		// back to the page
		ArrayList SCPostback = new ArrayList(VG.getWindowHandles());
		VG.switchTo().window((String) SCPost.get(0));

		WebElement Threedots = VG.findElement(By.className("fa-ellipsis-h"));
		Threedots.click();
		System.out.println("Test case 36 :three dots are selected-Test case Passed");

		// to verify the icons
		WebElement Publish = VG.findElement(By.linkText("Publish"));
		if (Publish.isEnabled()) {
			System.out.println("Test case 37 : Publish icon is present -Test case passed");
		} else {
			System.out.println("Test case 37 : Publish icon  is present-Test case Failled");

		}
		Thread.sleep(1000);

		// recehdule
		WebElement Reschedule = VG.findElement(By.linkText("Reschedule post"));
		if (Reschedule.isEnabled()) {
			System.out.println("Test case 38 : Reschedule is present -Test case passed");
		} else {
			System.out.println("Test case 38 : Reschedule is present-Test case Failled");

		}
		Thread.sleep(1000);

		// edit post
		WebElement EditPost = VG.findElement(By.linkText("Edit Post"));
		if (EditPost.isEnabled()) {
			System.out.println("Test case 39 : EditPost is present -Test case passed");
		} else {
			System.out.println("Test case 39 : EditPost is present-Test case Failled");

		}
		Thread.sleep(1000);

		//
		WebElement Delete = VG.findElement(By.linkText("Delete"));
		if (Delete.isEnabled()) {
			System.out.println("Test case 40 : Delete  is present -Test case passed");
		} else {
			System.out.println("Test case 40 : Delete  is present-Test case Failled");

		}
		Thread.sleep(1000);
		// Validate the URL before back icon is selcted
		String URLSCPlist = VG.getCurrentUrl();
		System.out.println("Test case 41 : URL is fetcheds -Test case passed");
		Thread.sleep(3500);
		// back icon
		VG.findElement(By.xpath("//a[@href='/social']//i[@class='fa fa-long-arrow-left']")).click();
		System.out.println("Test case 42 : Back icon is Selected -Test case passed");

		// again enter the scheudle post

		WebElement VGhome1 = VG.findElement(By.className("hmbbthome"));
		((JavascriptExecutor) VG).executeScript("arguments[0].scrollIntoView();", VGhome1);
		VGhome1.sendKeys(Keys.ARROW_DOWN);
		VGhome1.sendKeys(Keys.ARROW_DOWN);
		VGhome1.sendKeys(Keys.ARROW_DOWN);
		VGhome1.sendKeys(Keys.ARROW_DOWN);
		VGhome1.sendKeys(Keys.ARROW_DOWN);
		VGhome1.sendKeys(Keys.ARROW_DOWN);

		System.out.println("Test Case 43 : Arrow down key is pressed again -Test case Passed");
		Thread.sleep(2000);
		// to enter the scheduled post

		WebElement Spost1 = VG.findElement(By.className("schld-post"));
		Spost1.click();
		System.out.println("Test Case 44 : User Entered the Schedule post screen-Test case Passed ");
		// url validation

		Assert.assertEquals(URLSCPlist, "https://www.lemniska.com/my-scheduled-post");
		System.out.println("Test case 45 : Assert is passed -Test case Passed");
		// title check
		String SCPtitle = VG.findElement(By.className("schedule-post-title")).getText();
		Assert.assertEquals(SCPtitle, "Scheduled Post List");
		System.out.println("Test case 46 : Assert is Passed -Test case Passed");
		System.out.println("Schedule post module is working as expected");
		VG.quit();
	}

	//// To test the story views///////

	@Test
	public void D() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Amit\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver VG = new ChromeDriver();
		VG.get("https://www.lemniska.com/");
		VG.manage().window().maximize();
		Thread.sleep(5000);

		/// To click on get started
		WebElement GetStartedNow = VG
				.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));
		if (GetStartedNow.isEnabled()) {
			System.out.println("Test Case 1 :Get started icon is present -Test Case Passed");
		} else {
			System.out.println("Test Case 1 :Get started is Not present -Test Case Failled");
		}
		Thread.sleep(2000);

		WebElement okayicon = VG.findElement(By.className("LMokaybtnforal"));
		okayicon.click();
		Thread.sleep(2000);

		GetStartedNow.click();
		System.out.println("Test Case 2 :Get started icon is present and se3ected -Test Case Passed");
		Thread.sleep(5500);

//Dropdown is selected 
		WebElement Dropdown = VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Dropdown.click();
		System.out.println("Test Case 3 :Dropdown is selected  -Test Case Passed");

		Thread.sleep(2000);
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(8000);

// To enter the valid email and password 
		WebElement EmailAddress = VG.findElement(By.id("Email"));
		EmailAddress.sendKeys("kurt@biyac.com");
		System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
		Thread.sleep(2000);

		WebElement Password = VG.findElement(By.id("Password"));
		Password.sendKeys("123456789");
		System.out.println("Test Case 5 :password is added  -Test Case Passed");
		Thread.sleep(2500);

//To click on eye icon
		// To click on eye icon
		WebElement Eyeicon = VG.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/span[1]"));
		Eyeicon.click();
		Eyeicon.click();
		System.out.println("Test Case 6 :Eye icon is pressed  -Test Case Passed");

		Thread.sleep(2000);
		Eyeicon.click();
		System.out.println("Test Case 7 :Eye icon is pressed  -Test Case Passed");

		VG.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Test Case 8 :remember me is clicked  -Test Case Passed");

		WebElement Loginicon = VG.findElement(By.xpath("//input[@id='loginBttn']"));
		Loginicon.click();
		System.out.println("Test Case 9 :Login icon is selected -Test Case Passed");

		Thread.sleep(5000);
		VG.findElement(By.className("LMgoit")).click();
		Thread.sleep(2000);

		VG.findElement(By.className("hmactive-timeline")).click();
		Thread.sleep(2000);
		System.out.println("Stories of the user is selected");
		System.out.println("Test Case 10 : Stories of the User is Selected-Test Case Passed");
		VG.findElement(By.className("HMSTRDIV")).click();
		System.out.println("Test Case 11 : Stories of the User is Freezed -Test Case Passed");
		// to valildate the eye icon
		WebElement eye = VG.findElement(By.className("HM-viewerico"));
		System.out.println("Test Case 12 : Stories of the User is Selected -Test Case Passed");
		// to add the wait till the eye is seen

		// WebDriverWait wait = new WebDriverWait(VG,10);
		// wait.until(ExpectedConditions.visibilityOf(eye));
		System.out.println("Test Case 13 : Eye icon is selected -Test Case Passed");
		// to click on eye
		eye.click();
		System.out.println("Test Case 14 : eye icon is selected -Test Case Passed");
		Thread.sleep(2000);

		// to click on the cross icon
		VG.findElement(By.xpath("//*[@id=\"Stories_viewers_list\"]/div/div/div[3]/button")).click();
		System.out.println("cross icon is selected");
		System.out.println("Test Case 15 : Cross icon is selected-Test Case Passed");
		Thread.sleep(20000);

		WebElement storyendcontent = VG.findElement(By.xpath("//*[@id=\"stories-end-section\"]/div/div/div[2]"));
		// WebDriverWait wait101 = new WebDriverWait(VG,80);
		// wait101.until(ExpectedConditions.visibilityOf(storyendcontent));
		System.out.println("Test Case 16 : refresh icon is selected -Test Case Passed");

		// content after story
		WebElement storyendcontent1 = VG.findElement(By.xpath("//*[@id=\"stories-end-section\"]/div/div/div[2]"));
		System.out.println("Text is : " + storyendcontent1.getText());
		String Received = storyendcontent1.getText();

		System.out.println("Test Case 17 : Content is verified -Test Case Passed");
		Thread.sleep(4000);
		// String expectedStorycontent=()

		// to click on the story refresh icon
		// WebElement restartstories=VG.findElement(By.className("fa-repeat");
		// restartstories.click();
		VG.navigate().refresh();
		System.out.println("Test Case 18 : Refresh icon to restart stories is selected -Test Case Passed");
		Thread.sleep(50000);

		// share story button
		WebElement sharestorybutton = VG.findElement(By.xpath("//*[@id=\"stories-end-section\"]/div/div/div[3]/a"));
		Thread.sleep(5000);
		// WebDriverWait wait1 = new WebDriverWait(VG,30);
		// wait1.until(ExpectedConditions.visibilityOf(sharestorybutton));
		System.out.println("Test Case 19 : Share story icon is available -Test Case Passed");

		sharestorybutton.click();
		System.out.println("Test Case 20 : share story is selected -Test Case Passed");
		Thread.sleep(5000);

		// click on image section

		VG.findElement(By.xpath("//p[normalize-space()='Image/Video']")).click();
		System.out.println("Test Case 21 :Create Story image icon is Selected-Test Case Passed");
		Thread.sleep(2500);

		Runtime.getRuntime().exec("D:\\Amit\\Uploads\\Dogs\\D16.exe");
		Thread.sleep(2500);

		// Select Share Story
		VG.findElement(By.id("up-load-media-story")).click();
		System.out.println("Test Case 22 :Share Story icon is selected -Test Case Passed");
		Thread.sleep(10000);

		VG.findElement(By.className("home-div")).click();
		System.out.println("Test Case 23 :Home icon is selected -Test Case Passed");

		Thread.sleep(2500);

		// to to test the Home section from the menu bar

		WebElement VGhome = VG.findElement(By.className("hmbbthome"));
		((JavascriptExecutor) VG).executeScript("arguments[0].scrollIntoView();", VGhome);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);
		VGhome.sendKeys(Keys.ARROW_DOWN);

		// to click on profile icon
		VG.findElement(By.className("hhm-profile-icon")).click();
		System.out.println("Test Case 24 :Profile  icon is selected -Test Case Passed");
		Thread.sleep(2500);

		// to click on share story under the profile
		VG.findElement(By.className("HMFTCS")).click();
		System.out.println("Test Case 25 :Create story icon is selected -Test Case Passed");
		Thread.sleep(2500);

		// to validate the story section page
		String sharestorytext = VG.findElement(By.xpath("//h2[contains(text(),'Share a story')]")).getText();
		String Expectedtextstory = ("Share a story");
		Assert.assertEquals(sharestorytext, Expectedtextstory);
		System.out.println("Test Case 26 :Assert is Passed");
		Thread.sleep(2500);

		// to close the story page
		VG.findElement(By.className("hmcs-here-close")).click();
		System.out.println("Test Case 27 :Story page is closed -Test Case Passed");
		Thread.sleep(5000);
		System.out.println("Story Views Module is Working as Expected For Kurt");
		VG.quit();
	}

///////////////////////////////////////////////////
	@AfterTest
	public void Z() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Amit\\WebDrivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");

		FirefoxDriver VG = new FirefoxDriver();

		VG.get("https://www.lemniska.com/");
		VG.manage().window().maximize();
		Thread.sleep(5000);

		/// To click on get started
		WebElement GetStartedNow = VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));
		if (GetStartedNow.isEnabled()) {
			System.out.println("Test Case 0 :Get started icon is present -Test Case Passed");
		} else {
			System.out.println("Test Case 0:Get started is Not present -Test Case Failled");
		}
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement okayicon = VG.findElement(By.className("LMokaybtnforal"));
		okayicon.click();
		Thread.sleep(2000);

		GetStartedNow.click();
		System.out.println("Test Case 2 :Get started icon is present and se3ected -Test Case Passed");
		Thread.sleep(5500);

//Dropdown is selected 
		WebElement Dropdown = VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Dropdown.click();
		System.out.println("Test Case 3 :Dropdown is selected  -Test Case Passed");

		Thread.sleep(2000);
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(8000);

// To enter the valid email and password 
		WebElement EmailAddress = VG.findElement(By.id("Email"));
		EmailAddress.sendKeys("wj916137@gmail.com");
		System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
		Thread.sleep(2000);

		WebElement Password = VG.findElement(By.id("Password"));
		Password.sendKeys("Singh@123");
		System.out.println("Test Case 5 :password is added  -Test Case Passed");
		Thread.sleep(2500);

//To click on eye icon
		// To click on eye icon
		WebElement Eyeicon = VG.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/span[1]"));
		Eyeicon.click();
		Eyeicon.click();
		System.out.println("Test Case 6 :Eye icon is pressed  -Test Case Passed");

		Thread.sleep(2000);
		Eyeicon.click();
		System.out.println("Test Case 7 :Eye icon is pressed  -Test Case Passed");

		VG.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Test Case 8 :remember me is clicked  -Test Case Passed");

		WebElement Loginicon = VG.findElement(By.xpath("//input[@id='loginBttn']"));
		Loginicon.click();
		System.out.println("Test Case 9 :Login icon is selected -Test Case Passed");

		Thread.sleep(5000);
		VG.findElement(By.className("LMgoit")).click();
		Thread.sleep(2000);
		VG.quit();
	}
}