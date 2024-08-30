package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

		public class DoctorSignUp {
		
				public static void main(String[] args) throws InterruptedException {
					
					
					
			/////////////////To test the Doctor sign up  on QA ///////////////																
/*			System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");																																																								
			ChromeDriver driver=new ChromeDriver();														
			driver.get("https://www.lemniska.com/");	
*/
			WebDriver driver=new ChromeDriver();
			System.out.println("USA Doctor Sign Up");
			driver.get("https://qa.lemniska.com/");
			driver.manage().window().maximize();														
			Thread.sleep(5000);														
												
			// To click on get started 														
			WebElement GetStartedNow=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));												
			if(GetStartedNow.isEnabled()) {												
			System.out.println("Test Case 00A : Get started icon is present -Test Case Passed");											
			}												
			else {											
			System.out.println("Test Case 00A : Get started is Not present -Test Case Failed");										
			}											
			Thread.sleep(5000);
			
			/*// Banner
			WebElement okayicon = driver.findElement(By.className("LMokaybtnforal"));
			okayicon.click();
			System.out.println("Test Case 00-B :Pop-up is present -Test Case Passed");
			Thread.sleep(2000);
			--------------------------------------------------------	close comment from 35line	
			 */							
			GetStartedNow.click();												
			Thread.sleep(5000);												
			//////////////////									
			driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();														
			Thread.sleep(2000);														
			driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();														
			Thread.sleep(8000);														
			System.out.println("Test case 1 : Doctor sign up link is clicked");														
			//String DoctorSignuptitle=driver.findElement(By.xpath("//h2[contains(text(),'Doctor Sign Up')]")).getText();	
			String DoctorSignuptitle=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/h2")).getText();	 
			Assert.assertEquals(DoctorSignuptitle, "Doctor Sign Up");														
			System.out.println("Test case 2 : Assert for the Doctor sign up is passed");														
			WebElement Title=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]"));
			Title.click();
			///html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]
			//html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]
			Thread.sleep(2500);	
			WebElement Sup=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]"));
			Sup.click();
			System.out.println("Test case 3 : Title is Selected");														
			WebElement FirstName=driver.findElement(By.xpath("//input[@id='FirstName']"));														
			FirstName.sendKeys("346546456");														
			Thread.sleep(2000);														
			FirstName.clear();														
			Thread.sleep(2000);														
			FirstName.sendKeys("Anu");														
			System.out.println("Test case 4 : Random and Correct Keys are added to First Name");														
			WebElement LastName=driver.findElement(By.xpath("//input[@id='LastName']"));														
			LastName.sendKeys("6464646546");														
			Thread.sleep(2000);														
			LastName.clear();														
			Thread.sleep(2500);														
			LastName.sendKeys("Sharma");														
			System.out.println("Test case 5 : Random and Correct Keys are added to Last Name");														
			WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));														
			Email.sendKeys("3464646546");														
			Thread.sleep(2000);														
			Email.clear();														
			Thread.sleep(2500);														
			Email.sendKeys("anu_USA1@yopmail.com");														
			System.out.println("Test case 6 : Random and Correct Keys are added to Email");			
			
			
			WebElement PhoneNumber=driver.findElement(By.xpath("//input[@id='Phone']"));														
			PhoneNumber.sendKeys("@@%$%^$^$^$");														
			Thread.sleep(2000);														
			PhoneNumber.clear();														
			Thread.sleep(2500);														
			PhoneNumber.sendKeys("3532145698");		

			//driver.get("https://qa.lemniska.com/doctor-sign-up");
			
			
			Thread.sleep(2500);
			//WebElement Pref =driver.findElement(By.xpath("//input/li([@id='iti-0__item-us'])[1]"));
			//WebElement Pref =driver.findElement(By.xpath("//input([@id='iti-0__item-us'])[1]"));
			WebElement Pref = driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
			Pref.click();
			
			WebElement Country1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]"));
			Country1.click();
			
			Thread.sleep(2000);														
			System.out.println("Test case 7 : Random and Correct Keys are added to PhoneNumber");														
			WebElement Referral=driver.findElement(By.xpath("//input[@id='Mrcode']"));														
			Referral.sendKeys("3464646");														
			Referral.clear();														
			Thread.sleep(2500);														
			System.out.println("Test case 8 : Correct Keys are added to Referral");														
			WebElement privacy=driver.findElement(By.xpath("//input[@id='IsVerified']"));														
			privacy.click();														
			Thread.sleep(2500);														
			privacy.click();														
			Thread.sleep(2500);														
			privacy.click();														
			System.out.println("Test case 9 : Lemniska's Terms & Conditions and Privacy Policy checked & unchecked.");														
			WebElement Save=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save.click();														
			Thread.sleep(2500);														
			String HippaError=driver.findElement(By.xpath("//span[contains(text(),'Please agree to HIPAA Authorization.')]")).getText();														
			System.out.println("Test case 10 : Hippa not clicked error received "+HippaError);														
			WebElement Hippa=driver.findElement(By.xpath("//input[@id='IsVerifiedHippa']"));														
			Hippa.click();														
			Thread.sleep(2500);														
			System.out.println("Test case 11 : HIPAA icon is checked");														
			WebElement Save1=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save1.click();														
			System.out.println("Test case 12 : Save icon is selected");														
			Thread.sleep(5000);														
							
			// To check the plan screen and purchase 														
			
			Thread.sleep(5000);	
			
			//String Plantitlepage=driver.findElement(By.xpath("//h2[contains(text(),'Simple Pricing that scales with your business')]")).getText();		
			String Plantitlepage=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]")).getText();
            Assert.assertEquals(Plantitlepage, "Simple pricing that scales with your business");														
			System.out.println("Test case 13 : Assert for Subscription Title Text is passed");														
			Thread.sleep(2500);														
			// to switch betweeb Quarterly and annual plans														
												
			//WebElement Annual=driver.findElement(By.xpath("//a[contains(text(),'Annual')]"));														
			//Annual.click();														
			Thread.sleep(5500);														
			
			//WebElement silverbuyannnu=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));	
			WebElement silverbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));
			if(silverbuyannnu.isEnabled()) {														
			System.out.println("Test case 14 : silver buy annnual is present-Test case passed");													
			}													
			else {													
			System.out.println("Test case 14 : silver buy annnual is Not present-Test case Failed");													
			}													
			Thread.sleep(1000);													
												
			WebElement Goldbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(Goldbuyannnu.isEnabled()) {													
			System.out.println("Test case 15 : Gold buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 15 : Gold buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
			WebElement platinumbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(platinumbuyannnu.isEnabled()) {													
			System.out.println("Test case 16 : Platinum buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 16 : Platinum buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
												
												
												
			// to check and validate the quarterly plan 																
												
			//WebElement Quarterly=driver.findElement(By.xpath("//a[contains(text(),'Quarterly')]"));	
			WebElement Quarterly=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]	"));										
			Quarterly.click();												
			Thread.sleep(5500);												
												
			WebElement silverbuyQuar=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));												
			if(silverbuyQuar.isEnabled()) {												
			System.out.println("Test case 17 : silver buy Quar is present-Test case passed");											
			}											
			else {											
			System.out.println("Test case 17 : silver buy Quar is Not present-Test case Failed");											
			}											
			Thread.sleep(1000);											
												
			WebElement GoldbuyQuar=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));											
			if(GoldbuyQuar.isEnabled()) {											
			System.out.println("Test case 18 : Gold buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 18 : Gold buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
			WebElement platinumbuyQuar=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));											
			if(platinumbuyQuar.isEnabled()) {											
			System.out.println("Test case 19 : Platinum buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 19 : Platinum buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
												
			//driver.get("https://qa.lemniska.com/pricing/1/300b9964-5293-4a0c-bfeb-3004d2f24984");									
			// to purchase the gold quarterly plan 										
			WebElement Goldbuy=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));										
			Goldbuy.click();										
			Thread.sleep(4500);										
												
												
			// to validate the plan purchase screen										
			String Plandetails=driver.findElement(By.xpath("//h2[contains(text(),'Plan Details')]")).getText();										
			Assert.assertEquals(Plandetails, "Plan Details");										
			System.out.println("Test case 20 : Assert for Subscription Title Text is passed");										
			Thread.sleep(2500);										
												
			WebElement plancancel=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));										
			if(plancancel.isEnabled()) {										
			System.out.println("Test case 21 : Plan Cancel is present-Test case passed");									
			}									
			else {									
			System.out.println("Test case 21 : Plan Cancel is Not present-Test case Failed");									
			}									
			Thread.sleep(1000);									
												
												
			// to check the proceed icon										
			WebElement proceed=driver.findElement(By.xpath("//input[@id='checkout-button']"));									
			if(proceed.isEnabled()) {									
				System.out.println("Test case 22 : Proceed Icon is present-Test case passed");								
				}								
				else {								
				System.out.println("Test case 22 : Proceed Icon is Not present-Test case Failed");								
				}								
				Thread.sleep(1000);								
			// to check the note										
												
				String notedetails=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[2]/p")).getText();								
				Assert.assertEquals(notedetails, "Note- Please do not change or refresh the page language during the payment process.");								
				System.out.println("Test case 23 : Assert for note Text is passed");								
				Thread.sleep(2500);								
												
				//to cancel the plan 								
				WebElement plancancel1=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				plancancel1.click();								
				Thread.sleep(2500);								
												
			// to purchase the plan again 										
				WebElement platinumbuy=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div[4]/div/div/div/div[1]/div/div[3]/div/form/div/div/h1/button"));								
				platinumbuy.click();								
				Thread.sleep(4500);								
				String Plandetails1=driver.findElement(By.xpath("//h2[contains(text(),'Plan Details')]")).getText();								
				Assert.assertEquals(Plandetails1, "Plan Details");								
				System.out.println("Test case 24 : Assert for Subscription Title Text is passed");								
				Thread.sleep(2500);								
												
				WebElement plancancel2=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				if(plancancel2.isEnabled()) {								
					System.out.println("Test case 25 : Plan Cancel is present-Test case passed");							
					}							
					else {							
					System.out.println("Test case 25 : Plan Cancel is Not present-Test case Failed");							
					}							
					Thread.sleep(1000);							
												
												
				// to check the proceed icon								
					WebElement proceed1=driver.findElement(By.xpath("//input[@id='checkout-button']"));							
					if(proceed1.isEnabled()) {							
						System.out.println("Test case 26 : Proceed Icon is present-Test case passed");						
						}						
						else {						
						System.out.println("Test case 26 : Proceed Icon  is Not present-Test case Failed");						
						}						
						Thread.sleep(1000);						
												
						proceed1.click();						
						Thread.sleep(4500);						
						System.out.println("Test case 27 : User is now on the payment page");						
						System.out.println("Test case 28 : Doctor Sign up on the live is completed Successfully");						
						//driver.quit();			
						
			// to add card details 										
						
						
			// Indian Doctor Code
			System.out.println("Indian Doctor Sign Up");
			//WebDriver driver=new ChromeDriver();
            driver.get("https://qa.lemniska.com/");
			//driver.manage().window().maximize();														
			Thread.sleep(5000);														
												
			// To click on get started 														
			WebElement GetStartedNow1=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));												
			if(GetStartedNow1.isEnabled()) {												
			System.out.println("Test Case 00A : Get started icon is present -Test Case Passed");											
			}												
			else {											
			System.out.println("Test Case 00A : Get started is Not present -Test Case Failed");										
			}											
			Thread.sleep(5000);
			
			/*
			WebElement okayicon = driver.findElement(By.className("LMokaybtnforal"));
			okayicon.click();
			System.out.println("Test Case 00-B :Pop-up is present -Test Case Passed");
			Thread.sleep(2000);
			--------------------------------------------------------	close comment from 35line	
			*/						
			GetStartedNow1.click();												
			Thread.sleep(5000);												
			//////////////////									
			driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();														
			Thread.sleep(2000);														
			driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();														
			Thread.sleep(8000);														
			System.out.println("Test case 1 : Doctor sign up link is clicked");														
			//String DoctorSignuptitle=driver.findElement(By.xpath("//h2[contains(text(),'Doctor Sign Up')]")).getText();	
			String DoctorSignuptitle1=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/h2")).getText();	 
			Assert.assertEquals(DoctorSignuptitle1, "Doctor Sign Up");														
			System.out.println("Test case 2 : Assert for the Doctor sign up is passed");														
			WebElement Title1=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]"));	
			Title1.click();
			Thread.sleep(2500);	
			WebElement Sup1=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[3]"));
			Sup1.click();
			/*
			 WebElement Title=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]"));
			Title.click();
			///html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]
			//html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]
			Thread.sleep(2500);	
			WebElement Sup=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]"));
			Sup.click(); 
			 */
			Thread.sleep(2500);														
			System.out.println("Test case 3 : Title is Selected");														
			WebElement FirstName1=driver.findElement(By.xpath("//input[@id='FirstName']"));														
			FirstName1.sendKeys("346546456");														
			Thread.sleep(2000);														
			FirstName1.clear();														
			Thread.sleep(2000);														
			FirstName1.sendKeys("Anu");														
			System.out.println("Test case 4 : Random and Correct Keys are added to First Name");														
			WebElement LastName1=driver.findElement(By.xpath("//input[@id='LastName']"));														
			LastName1.sendKeys("6464646546");														
			Thread.sleep(2000);														
			LastName1.clear();														
			Thread.sleep(2500);														
			LastName1.sendKeys("Sharma");														
			System.out.println("Test case 5 : Random and Correct Keys are added to Last Name");														
			WebElement Email1=driver.findElement(By.xpath("//input[@id='Email']"));														
			Email1.sendKeys("3464646546");														
			Thread.sleep(2000);														
			Email1.clear();														
			Thread.sleep(2500);														
			Email1.sendKeys("anu_India1@yopmail.com");														
			System.out.println("Test case 6 : Random and Correct Keys are added to Email");			
			
			
			WebElement PhoneNumber1=driver.findElement(By.xpath("//input[@id='Phone']"));														
			PhoneNumber1.sendKeys("@@%$%^$^$^$");														
			Thread.sleep(2000);														
			PhoneNumber1.clear();														
			Thread.sleep(2500);														
			PhoneNumber1.sendKeys("3532145698");		

			//driver.get("https://qa.lemniska.com/doctor-sign-up");
			
			
			Thread.sleep(2500);
			
			WebElement Pref1 = driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
			Pref1.click();
			
			
			//India - default 
			WebElement Country11 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
			Country11.click();
			
			// Mexico below 2 lines
			/*WebElement Country1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
			Country1.click();
			*/
			
			Thread.sleep(2000);														
			System.out.println("Test case 7 : Random and Correct Keys are added to PhoneNumber");														
			WebElement Referral1=driver.findElement(By.xpath("//input[@id='Mrcode']"));														
			Referral1.sendKeys("3464646");														
			Referral1.clear();														
			Thread.sleep(2500);														
			System.out.println("Test case 8 : Correct Keys are added to Referral");														
			WebElement privacy1=driver.findElement(By.xpath("//input[@id='IsVerified']"));														
			privacy1.click();														
			Thread.sleep(2500);														
			privacy1.click();														
			Thread.sleep(2500);														
			privacy1.click();														
			System.out.println("Test case 9 : Lemniska's Terms & Conditions and Privacy Policy checked & unchecked.");														
			WebElement Save11=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save11.click();														
			Thread.sleep(2500);														
			String HippaError1=driver.findElement(By.xpath("//span[contains(text(),'Please agree to HIPAA Authorization.')]")).getText();														
			System.out.println("Test case 10 : Hippa not clicked error received "+HippaError1);														
			WebElement Hippa1=driver.findElement(By.xpath("//input[@id='IsVerifiedHippa']"));														
			Hippa1.click();														
			Thread.sleep(2500);														
			System.out.println("Test case 11 : HIPAA icon is checked");														
			WebElement Save111=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save111.click();														
			System.out.println("Test case 12 : Save icon is selected");														
			Thread.sleep(5000);														
							
			// To check the plan screen and purchase 														
			
			Thread.sleep(5000);	
			
			//String Plantitlepage=driver.findElement(By.xpath("//h2[contains(text(),'Simple Pricing that scales with your business')]")).getText();		
			
			
			//driver.get("https://qa.lemniska.com/pricing/Quarterly/bebc0e48-a09d-4a49-aed9-72d6fe753439");
			
			String Plantitlepage1=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]")).getText();
            Assert.assertEquals(Plantitlepage1, "Simple pricing that scales with your business");														
			System.out.println("Test case 13 : Assert for Subscription Title Text is passed");														
			Thread.sleep(2500);														
			// to switch betweeb Quarterly and annual plans														
												
			//WebElement Annual=driver.findElement(By.xpath("//a[contains(text(),'Annual')]"));														
			//Annual.click();														
			Thread.sleep(5500);														

			
/*			
			//WebElement silverbuyannnu=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));	
			WebElement silverbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));
			if(silverbuyannnu.isEnabled()) {														
			System.out.println("Test case 14 : silver buy annnual is present-Test case passed");													
			}													
			else {													
			System.out.println("Test case 14 : silver buy annnual is Not present-Test case Failed");													
			}													
			Thread.sleep(1000);													
												
			WebElement Goldbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(Goldbuyannnu.isEnabled()) {													
			System.out.println("Test case 15 : Gold buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 15 : Gold buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
			WebElement platinumbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(platinumbuyannnu.isEnabled()) {													
			System.out.println("Test case 16 : Platinum buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 16 : Platinum buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
												
												
												
			// to check and validate the quarterly plan 																
												
			//WebElement Quarterly=driver.findElement(By.xpath("//a[contains(text(),'Quarterly')]"));	
			WebElement Quarterly=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));									
			Quarterly.click();												
			Thread.sleep(5500);												
	
												
*/
			WebElement silverbuyQuar1=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));												
			if(silverbuyQuar1.isEnabled()) {												
			System.out.println("Test case 14 : silver buy Quar is present-Test case passed");											
			}											
			else {											
			System.out.println("Test case 14 : silver buy Quar is Not present-Test case Failed");											
			}											
			Thread.sleep(1000);											
												
			WebElement GoldbuyQuar1=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(GoldbuyQuar1.isEnabled()) {											
			System.out.println("Test case 15 : Gold buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 15 : Gold buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
			WebElement platinumbuyQuar1=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(platinumbuyQuar1.isEnabled()) {											
			System.out.println("Test case 16 : Platinum buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 16 : Platinum buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
												
			//driver.get("https://qa.lemniska.com/pricing/1/300b9964-5293-4a0c-bfeb-3004d2f24984");									
			// to purchase the gold quarterly plan 										
			WebElement Goldbuy1=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));										
			Goldbuy1.click();										
			Thread.sleep(4500);										
																					
			// //h2[contains(text(),'Plan Details')]\"  to validate the plan purchase screen			/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]				--- 					
			String Plandetails11=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText();										
			Assert.assertEquals(Plandetails11, "Plan Details");										
			System.out.println("Test case 17 : Assert for Subscription Title Text is passed");										
			Thread.sleep(2500);										
			// /html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/form[1]/div[1]/input[1]		
			WebElement plancancel11=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));										
			if(plancancel11.isEnabled()) {										
			System.out.println("Test case 18 : Plan Cancel is present-Test case passed");									
			}									
			else {									
			System.out.println("Test case 18 : Plan Cancel is Not present-Test case Failed");									
			}									
			Thread.sleep(1000);									
												
												
			// to check the proceed icon										
			WebElement proceed11=driver.findElement(By.xpath("//input[@id='checkout-button']"));									
			if(proceed11.isEnabled()) {									
				System.out.println("Test case 19 : Proceed Icon is present-Test case passed");								
				}								
				else {								
				System.out.println("Test case 19 : Proceed Icon is Not present-Test case Failed");								
				}								
				Thread.sleep(1000);								
			// to check the note										
												
				String notedetails1=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[2]/p")).getText();								
				Assert.assertEquals(notedetails1, "Note- Please do not change or refresh the page language during the payment process.");								
				System.out.println("Test case 20 : Assert for note Text is passed");								
				Thread.sleep(2500);								
												
				//to cancel the plan 								
				WebElement plancancel111=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				plancancel111.click();								
				Thread.sleep(2500);								
												
			// to purchase the plan again 	/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]									
				WebElement platinumbuy1=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));								
				platinumbuy1.click();								
				Thread.sleep(4500);								
				String Plandetails111=driver.findElement(By.xpath("//h2[contains(text(),'Plan Details')]")).getText();								
				Assert.assertEquals(Plandetails111, "Plan Details");								
				System.out.println("Test case 21 : Assert for Subscription Title Text is passed");								
				Thread.sleep(2500);								
												
				WebElement plancancel21=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				if(plancancel21.isEnabled()) {								
					System.out.println("Test case 22 : Plan Cancel is present-Test case passed");							
					}							
					else {							
					System.out.println("Test case 22 : Plan Cancel is Not present-Test case Failed");							
					}							
					Thread.sleep(1000);							
												
												
				// to check the proceed icon								
					WebElement proceed111=driver.findElement(By.xpath("//input[@id='checkout-button']"));							
					if(proceed111.isEnabled()) {							
						System.out.println("Test case 23 : Proceed Icon is present-Test case passed");						
						}						
						else {						
						System.out.println("Test case 23 : Proceed Icon  is Not present-Test case Failed");						
						}						
						Thread.sleep(1000);						
												
						proceed111.click();						
						Thread.sleep(4500);						
						System.out.println("Test case 24 : User is now on the payment page");						
						System.out.println("Test case 25 : Doctor Sign up on the live is completed Successfully");						
						//driver.quit();						
			// to add card details 										
						
			
						
						
						
			// Indian Doctor Code
			System.out.println("Mexicon Doctor Sign Up in English");
			//WebDriver driver=new ChromeDriver();
            driver.get("https://qa.lemniska.com/");
            
            
            
			//driver.manage().window().maximize();														
			Thread.sleep(5000);														
												
			// To click on get started 														
			WebElement GetStartedNow4=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));												
			if(GetStartedNow4.isEnabled()) {												
			System.out.println("Test Case 00A : Get started icon is present -Test Case Passed");											
			}												
			else {											
			System.out.println("Test Case 00A : Get started is Not present -Test Case Failed");										
			}											
			Thread.sleep(5000);
			
			/*
			WebElement okayicon = driver.findElement(By.className("LMokaybtnforal"));
			okayicon.click();
			System.out.println("Test Case 00-B :Pop-up is present -Test Case Passed");
			Thread.sleep(2000);
			--------------------------------------------------------	close comment from 35line	
			*/						
			GetStartedNow4.click();												
			Thread.sleep(5000);												
			//////////////////									
			driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();														
			Thread.sleep(2000);														
			driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();														
			Thread.sleep(8000);														
			System.out.println("Test case 1 : Doctor sign up link is clicked");														
			//String DoctorSignuptitle=driver.findElement(By.xpath("//h2[contains(text(),'Doctor Sign Up')]")).getText();	
			String DoctorSignuptitle4=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/h2")).getText();	 
			Assert.assertEquals(DoctorSignuptitle4, "Doctor Sign Up");														
			System.out.println("Test case 2 : Assert for the Doctor sign up is passed");														
			WebElement Title4=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]"));	
			Title4.click();
			Thread.sleep(2500);	
			WebElement Sup4=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[4]"));
			Sup4.click();
			/*
			 WebElement Title=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]"));
			Title.click();
			///html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]
			//html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]
			Thread.sleep(2500);	
			WebElement Sup=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]"));
			Sup.click(); 
			 */
			Thread.sleep(2500);														
			System.out.println("Test case 3 : Title is Selected");														
			WebElement FirstName4=driver.findElement(By.xpath("//input[@id='FirstName']"));														
			FirstName4.sendKeys("346546456");														
			Thread.sleep(2000);														
			FirstName4.clear();														
			Thread.sleep(2000);														
			FirstName4.sendKeys("Anu");														
			System.out.println("Test case 4 : Random and Correct Keys are added to First Name");														
			WebElement LastName4=driver.findElement(By.xpath("//input[@id='LastName']"));														
			LastName4.sendKeys("6464646546");														
			Thread.sleep(2000);														
			LastName4.clear();														
			Thread.sleep(2500);														
			LastName4.sendKeys("Sharma");														
			System.out.println("Test case 5 : Random and Correct Keys are added to Last Name");														
			WebElement Email4=driver.findElement(By.xpath("//input[@id='Email']"));														
			Email4.sendKeys("3464646546");														
			Thread.sleep(2000);														
			Email4.clear();														
			Thread.sleep(2500);														
			Email4.sendKeys("anu_MexicoEnglish@yopmail.com");														
			System.out.println("Test case 6 : Random and Correct Keys are added to Email");			
			
			
			WebElement PhoneNumber4=driver.findElement(By.xpath("//input[@id='Phone']"));														
			PhoneNumber4.sendKeys("@@%$%^$^$^$");														
			Thread.sleep(2000);														
			PhoneNumber4.clear();														
			Thread.sleep(2500);														
			PhoneNumber4.sendKeys("3532145698");		

			//driver.get("https://qa.lemniska.com/doctor-sign-up");
			
			
			Thread.sleep(2500);
			
			WebElement Pref4 = driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
			Pref4.click();
			
			
			
			
			// Mexico below 2 lines
			WebElement Country44 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
			Country44.click();
			
			
			Thread.sleep(2000);														
			System.out.println("Test case 7 : Random and Correct Keys are added to PhoneNumber");														
			WebElement Referral4=driver.findElement(By.xpath("//input[@id='Mrcode']"));														
			Referral4.sendKeys("3464646");														
			Referral4.clear();														
			Thread.sleep(2500);														
			System.out.println("Test case 8 : Correct Keys are added to Referral");														
			WebElement privacy4=driver.findElement(By.xpath("//input[@id='IsVerified']"));														
			privacy4.click();														
			Thread.sleep(2500);														
			privacy4.click();														
			Thread.sleep(2500);														
			privacy4.click();														
			System.out.println("Test case 9 : Lemniska's Terms & Conditions and Privacy Policy checked & unchecked.");														
			WebElement Save44=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save44.click();														
			Thread.sleep(2500);														
			String HippaError4=driver.findElement(By.xpath("//span[contains(text(),'Please agree to HIPAA Authorization.')]")).getText();														
			System.out.println("Test case 10 : Hippa not clicked error received "+HippaError4);														
			WebElement Hippa4=driver.findElement(By.xpath("//input[@id='IsVerifiedHippa']"));														
			Hippa4.click();														
			Thread.sleep(2500);														
			System.out.println("Test case 11 : HIPAA icon is checked");														
			WebElement Save444=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save444.click();														
			System.out.println("Test case 12 : Save icon is selected");														
			Thread.sleep(5000);														
							
			// To check the plan screen and purchase 														
			
			Thread.sleep(5000);	
			
			//String Plantitlepage=driver.findElement(By.xpath("//h2[contains(text(),'Simple Pricing that scales with your business')]")).getText();		
			
			
			//driver.get("https://qa.lemniska.com/pricing/Quarterly/bebc0e48-a09d-4a49-aed9-72d6fe753439");
			
			String Plantitlepage4=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]")).getText();
            Assert.assertEquals(Plantitlepage4, "Simple pricing that scales with your business");														
			System.out.println("Test case 13 : Assert for Subscription Title Text is passed");														
			Thread.sleep(2500);														
			// to switch betweeb Quarterly and annual plans														
												
			//WebElement Annual=driver.findElement(By.xpath("//a[contains(text(),'Annual')]"));														
			//Annual.click();														
			Thread.sleep(5500);														

			
/*			
			//WebElement silverbuyannnu=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));	
			WebElement silverbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));
			if(silverbuyannnu.isEnabled()) {														
			System.out.println("Test case 14 : silver buy annnual is present-Test case passed");													
			}													
			else {													
			System.out.println("Test case 14 : silver buy annnual is Not present-Test case Failed");													
			}													
			Thread.sleep(1000);													
												
			WebElement Goldbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(Goldbuyannnu.isEnabled()) {													
			System.out.println("Test case 15 : Gold buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 15 : Gold buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
			WebElement platinumbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(platinumbuyannnu.isEnabled()) {													
			System.out.println("Test case 16 : Platinum buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 16 : Platinum buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
												
												
												
			// to check and validate the quarterly plan 																
												
			//WebElement Quarterly=driver.findElement(By.xpath("//a[contains(text(),'Quarterly')]"));	
			WebElement Quarterly=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));									
			Quarterly.click();												
			Thread.sleep(5500);												
	
												
*/
			WebElement silverbuyQuar4=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));												
			if(silverbuyQuar4.isEnabled()) {												
			System.out.println("Test case 14 : silver buy Quar is present-Test case passed");											
			}											
			else {											
			System.out.println("Test case 14 : silver buy Quar is Not present-Test case Failed");											
			}											
			Thread.sleep(1000);											
												
			WebElement GoldbuyQuar4=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(GoldbuyQuar4.isEnabled()) {											
			System.out.println("Test case 15 : Gold buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 15 : Gold buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
			WebElement platinumbuyQuar4=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(platinumbuyQuar4.isEnabled()) {											
			System.out.println("Test case 16 : Platinum buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 16 : Platinum buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
												
			//driver.get("https://qa.lemniska.com/pricing/1/300b9964-5293-4a0c-bfeb-3004d2f24984");									
			// to purchase the gold quarterly plan 										
			WebElement Goldbuy4=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));										
			Goldbuy4.click();										
			Thread.sleep(4500);										
																					
			// //h2[contains(text(),'Plan Details')]\"  to validate the plan purchase screen			/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]				--- 					
			String Plandetails44=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText();										
			Assert.assertEquals(Plandetails44, "Plan Details");										
			System.out.println("Test case 17 : Assert for Subscription Title Text is passed");										
			Thread.sleep(2500);										
			// /html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/form[1]/div[1]/input[1]		
			WebElement plancancel44=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));										
			if(plancancel44.isEnabled()) {										
			System.out.println("Test case 18 : Plan Cancel is present-Test case passed");									
			}									
			else {									
			System.out.println("Test case 18 : Plan Cancel is Not present-Test case Failed");									
			}									
			Thread.sleep(1000);									
												
												
			// to check the proceed icon										
			WebElement proceed44=driver.findElement(By.xpath("//input[@id='checkout-button']"));									
			if(proceed44.isEnabled()) {									
				System.out.println("Test case 19 : Proceed Icon is present-Test case passed");								
				}								
				else {								
				System.out.println("Test case 19 : Proceed Icon is Not present-Test case Failed");								
				}								
				Thread.sleep(1000);								
			// to check the note										
												
				String notedetails4=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[2]/p")).getText();								
				Assert.assertEquals(notedetails4, "Note- Please do not change or refresh the page language during the payment process.");								
				System.out.println("Test case 20 : Assert for note Text is passed");								
				Thread.sleep(2500);								
												
				//to cancel the plan 								
				WebElement plancancel444=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				plancancel444.click();								
				Thread.sleep(2500);								
												
			// to purchase the plan again 	/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]									
				WebElement platinumbuy4=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));								
				platinumbuy4.click();								
				Thread.sleep(4500);								
				String Plandetails444=driver.findElement(By.xpath("//h2[contains(text(),'Plan Details')]")).getText();								
				Assert.assertEquals(Plandetails444, "Plan Details");								
				System.out.println("Test case 21 : Assert for Subscription Title Text is passed");								
				Thread.sleep(2500);								
												
				WebElement plancancel41=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				if(plancancel41.isEnabled()) {								
					System.out.println("Test case 22 : Plan Cancel is present-Test case passed");							
					}							
					else {							
					System.out.println("Test case 22 : Plan Cancel is Not present-Test case Failed");							
					}							
					Thread.sleep(1000);							
												
												
				// to check the proceed icon								
					WebElement proceed444=driver.findElement(By.xpath("//input[@id='checkout-button']"));							
					if(proceed444.isEnabled()) {							
						System.out.println("Test case 23 : Proceed Icon is present-Test case passed");						
						}						
						else {						
						System.out.println("Test case 23 : Proceed Icon  is Not present-Test case Failed");						
						}						
						Thread.sleep(1000);						
												
						proceed444.click();						
						Thread.sleep(4500);						
						System.out.println("Test case 24 : User is now on the payment page");						
						System.out.println("Test case 25 : Doctor Sign up on the live is completed Successfully");						
						//driver.quit();						
			// to add card details 			
						
// Maxican Doctor Code
			System.out.println("Maxican Doctor Sign Up in Spanish");
			//WebDriver driver=new ChromeDriver();
            driver.get("https://qa.lemniska.com/");
			//driver.manage().window().maximize();														
			Thread.sleep(5000);														
												
			// To click on get started 														
			WebElement GetStartedNow2=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));												
			if(GetStartedNow2.isEnabled()) {												
			System.out.println("Test Case 00A : Get started icon is present -Test Case Passed");											
			}												
			else {											
			System.out.println("Test Case 00A : Get started is Not present -Test Case Failed");										
			}											
			Thread.sleep(5000);
			
			/*
			WebElement okayicon = driver.findElement(By.className("LMokaybtnforal"));
			okayicon.click();
			System.out.println("Test Case 00-B :Pop-up is present -Test Case Passed");
			Thread.sleep(2000);
			--------------------------------------------------------	close comment from 35line	
			*/						
			GetStartedNow2.click();												
			Thread.sleep(5000);												
			//////////////////									
			driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();														
			Thread.sleep(2000);														
			driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();														
			Thread.sleep(8000);														
			System.out.println("Test case 1 : Doctor sign up link is clicked");														
			//String DoctorSignuptitle=driver.findElement(By.xpath("//h2[contains(text(),'Doctor Sign Up')]")).getText();	
			String DoctorSignuptitle2=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/h2")).getText();	 
			Assert.assertEquals(DoctorSignuptitle2, "Doctor Sign Up");														
			System.out.println("Test case 2 : Assert for the Doctor sign up is passed");
			
			WebElement LangOp=driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[1]/select"));
			LangOp.click();
			
			WebElement Lang2=driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[1]/select/option[2]"));
			Lang2.click();
			
			
			WebElement Title2=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]"));	
			Title2.click();
			Thread.sleep(2500);	
			WebElement Sup2=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[4]"));
			Sup2.click();
			/*
			 WebElement Title=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]"));
			Title.click();
			///html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]
			//html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]
			Thread.sleep(2500);	
			WebElement Sup=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/select/option[2]"));
			Sup.click(); 
			 */
			Thread.sleep(2500);														
			System.out.println("Test case 3 : Title is Selected");														
			WebElement FirstName2=driver.findElement(By.xpath("//input[@id='FirstName']"));														
			FirstName2.sendKeys("346546456");														
			Thread.sleep(2000);														
			FirstName2.clear();														
			Thread.sleep(2000);														
			FirstName2.sendKeys("Anu");														
			System.out.println("Test case 4 : Random and Correct Keys are added to First Name");														
			WebElement LastName2=driver.findElement(By.xpath("//input[@id='LastName']"));														
			LastName2.sendKeys("6464646546");														
			Thread.sleep(2000);														
			LastName2.clear();														
			Thread.sleep(2500);														
			LastName2.sendKeys("Sharma");														
			System.out.println("Test case 5 : Random and Correct Keys are added to Last Name");														
			WebElement Email2=driver.findElement(By.xpath("//input[@id='Email']"));														
			Email2.sendKeys("3464646546");														
			Thread.sleep(2000);														
			Email2.clear();														
			Thread.sleep(2500);														
			Email2.sendKeys("anu_MexicoEnglish@yopmail.com");														
			System.out.println("Test case 6 : Random and Correct Keys are added to Email");			
			
			
			WebElement PhoneNumber2=driver.findElement(By.xpath("//input[@id='Phone']"));														
			PhoneNumber2.sendKeys("@@%$%^$^$^$");														
			Thread.sleep(2000);														
			PhoneNumber2.clear();														
			Thread.sleep(2500);														
			PhoneNumber2.sendKeys("3532145698");		

			//driver.get("https://qa.lemniska.com/doctor-sign-up");
			
			
			Thread.sleep(2500);
			
			WebElement Pref2 = driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
			Pref2.click();
			
			
			//India - default 
			/*WebElement Country22 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
			Country22.click();
			*/
			// Mexico below 2 lines
			WebElement Country22 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
			Country22.click();
			
			
			Thread.sleep(2000);														
			System.out.println("Test case 7 : Random and Correct Keys are added to PhoneNumber");														
			WebElement Referral2=driver.findElement(By.xpath("//input[@id='Mrcode']"));														
			Referral2.sendKeys("3464646");														
			Referral2.clear();														
			Thread.sleep(2500);														
			System.out.println("Test case 8 : Correct Keys are added to Referral");														
			WebElement privacy2=driver.findElement(By.xpath("//input[@id='IsVerified']"));														
			privacy2.click();														
			Thread.sleep(2500);														
			privacy2.click();														
			Thread.sleep(2500);														
			privacy2.click();														
			System.out.println("Test case 9 : Lemniska's Terms & Conditions and Privacy Policy checked & unchecked.");														
			WebElement Save22=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save22.click();														
			Thread.sleep(2500);														
			String HippaError2=driver.findElement(By.xpath("//span[contains(text(),'Acepte la autorización de HIPAA.')]")).getText();														
			System.out.println("Test case 10 : Hippa not clicked error received "+HippaError2);														
			WebElement Hippa2=driver.findElement(By.xpath("//input[@id='IsVerifiedHippa']"));														
			Hippa2.click();														
			Thread.sleep(2500);														
			System.out.println("Test case 11 : HIPAA icon is checked");														
			WebElement Save222=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save222.click();														
			System.out.println("Test case 12 : Save icon is selected");														
			Thread.sleep(5000);														
							
			// To check the plan screen and purchase 														
			
			Thread.sleep(5000);	
			
			//String Plantitlepage=driver.findElement(By.xpath("//h2[contains(text(),'Simple Pricing that scales with your business')]")).getText();		
			
			
			//driver.get("https://qa.lemniska.com/pricing/Quarterly/bebc0e48-a09d-4a49-aed9-72d6fe753439");
			
			String Plantitlepage2=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]")).getText();
            Assert.assertEquals(Plantitlepage2, "Precios simples que se adaptan a su negocio");														
			System.out.println("Test case 13 : Assert for Subscription Title Text is passed");														
			Thread.sleep(2500);														
			// to switch betweeb Quarterly and annual plans														
												
			//WebElement Annual=driver.findElement(By.xpath("//a[contains(text(),'Annual')]"));														
			//Annual.click();														
			Thread.sleep(5500);														

			
/*			
			//WebElement silverbuyannnu=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));	
			WebElement silverbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));
			if(silverbuyannnu.isEnabled()) {														
			System.out.println("Test case 14 : silver buy annnual is present-Test case passed");													
			}													
			else {													
			System.out.println("Test case 14 : silver buy annnual is Not present-Test case Failed");													
			}													
			Thread.sleep(1000);													
												
			WebElement Goldbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(Goldbuyannnu.isEnabled()) {													
			System.out.println("Test case 15 : Gold buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 15 : Gold buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
			WebElement platinumbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(platinumbuyannnu.isEnabled()) {													
			System.out.println("Test case 16 : Platinum buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 16 : Platinum buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
												
												
												
			// to check and validate the quarterly plan 																
												
			//WebElement Quarterly=driver.findElement(By.xpath("//a[contains(text(),'Quarterly')]"));	
			WebElement Quarterly=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));									
			Quarterly.click();												
			Thread.sleep(5500);												
	
												
*/
			WebElement silverbuyQuar2=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));												
			if(silverbuyQuar2.isEnabled()) {												
			System.out.println("Test case 14 : silver buy Quar is present-Test case passed");											
			}											
			else {											
			System.out.println("Test case 14 : silver buy Quar is Not present-Test case Failed");											
			}											
			Thread.sleep(1000);											
												
			WebElement GoldbuyQuar2=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(GoldbuyQuar2.isEnabled()) {											
			System.out.println("Test case 15 : Gold buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 15 : Gold buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
			WebElement platinumbuyQuar2=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(platinumbuyQuar2.isEnabled()) {											
			System.out.println("Test case 16 : Platinum buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 16 : Platinum buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
												
			//driver.get("https://qa.lemniska.com/pricing/1/300b9964-5293-4a0c-bfeb-3004d2f24984");									
			// to purchase the gold quarterly plan 										
			WebElement Goldbuy2=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));										
			Goldbuy2.click();										
			Thread.sleep(4500);										
																					
			// //h2[contains(text(),'Plan Details')]\"  to validate the plan purchase screen			/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]				--- 					
			String Plandetails22=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText();										
			Assert.assertEquals(Plandetails22, "Detalles del plan");										
			System.out.println("Test case 17 : Assert for Subscription Title Text is passed");										
			Thread.sleep(2500);										
			// /html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/form[1]/div[1]/input[1]		
			WebElement plancancel22=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));										
			if(plancancel22.isEnabled()) {										
			System.out.println("Test case 18 : Plan Cancel is present-Test case passed");									
			}									
			else {									
			System.out.println("Test case 18 : Plan Cancel is Not present-Test case Failed");									
			}									
			Thread.sleep(1000);									
												
												
			// to check the proceed icon										
			WebElement proceed22=driver.findElement(By.xpath("//input[@id='checkout-button']"));									
			if(proceed22.isEnabled()) {									
				System.out.println("Test case 19 : Proceed Icon is present-Test case passed");								
				}								
				else {								
				System.out.println("Test case 19 : Proceed Icon is Not present-Test case Failed");								
				}								
				Thread.sleep(1000);								
			// to check the note										
												
				String notedetails2=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[2]/p")).getText();								
				Assert.assertEquals(notedetails2, "Nota- No cambie ni actualice el idioma de la página durante el proceso de pago.");
				// No cambie ni actualice el idioma de la página durante el proceso de pago.
				System.out.println("Test case 20 : Assert for note Text is passed");								
				Thread.sleep(2500);								
												
				//to cancel the plan 								
				WebElement plancancel222=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				plancancel222.click();								
				Thread.sleep(2500);								
												
			// to purchase the plan again 	/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]									
				WebElement platinumbuy2=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));								
				platinumbuy2.click();								
				Thread.sleep(4500);								
				String Plandetails222=driver.findElement(By.xpath("//h2[contains(text(),'Detalles del plan')]")).getText();								
				Assert.assertEquals(Plandetails222, "Detalles del plan");								
				System.out.println("Test case 21 : Assert for Subscription Title Text is passed");								
				Thread.sleep(2500);								
												
				WebElement plancancel1222=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				if(plancancel1222.isEnabled()) {								
					System.out.println("Test case 22 : Plan Cancel is present-Test case passed");							
					}							
					else {							
					System.out.println("Test case 22 : Plan Cancel is Not present-Test case Failed");							
					}							
					Thread.sleep(1000);							
												
												
				// to check the proceed icon								
					WebElement proceed222=driver.findElement(By.xpath("//input[@id='checkout-button']"));							
					if(proceed222.isEnabled()) {							
						System.out.println("Test case 23 : Proceed Icon is present-Test case passed");						
						}						
						else {						
						System.out.println("Test case 23 : Proceed Icon  is Not present-Test case Failed");						
						}						
						Thread.sleep(1000);						
												
						proceed222.click();						
						Thread.sleep(4500);						
						System.out.println("Test case 24 : User is now on the payment page");						
						System.out.println("Test case 25 : Doctor Sign up on the live is completed Successfully");						
						//driver.quit();						
			// to add card details 

						

						
			}															
											
		
		
			}

