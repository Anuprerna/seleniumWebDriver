

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import WebTesting.WebElement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.Assert;

import java.util.Scanner;


public class MemberProfile {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","D:\\Amit\\WebDrivers\\chromedriver_win32\\chromedriver.exe");																																											
			//ChromeDriver VG=new ChromeDriver();	
			WebDriver VG=new ChromeDriver();
			WebDriver driver=new ChromeDriver();
			VG.get("https://qa.lemniska.com/");																																												
			VG.manage().window().maximize();																																												
			Thread.sleep(5000);	
			
			
			/// To click on get started 																																												
			WebElement GetStartedNow=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));																																												
			if(GetStartedNow.isEnabled()) {																																												
				System.out.println("Test Case 1 :Get started icon is present -Test Case Passed");																																											
			}																																												
				else {																																											
					System.out.println("Test Case 1 :Get started is Not present -Test Case Failled");																																										
				}																																											
			Thread.sleep(2000);																																												
																																															
			GetStartedNow.click();		
			System.out.println("Test Case 2 :Get started icon is present and se3ected -Test Case Passed");
			Thread.sleep(5500);																																												
									
			//Dropdown is selected 
			WebElement Dropdown=VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
					Dropdown.click();	
					System.out.println("Test Case 3 :Dropdown is selected  -Test Case Passed");

			Thread.sleep(2000);																																												
			VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();																																												
			Thread.sleep(8000);	
			
			// To enter the valid email and password 
			WebElement EmailAddress=VG.findElement(By.xpath("//input[@id='Email']"));
			EmailAddress.sendKeys("priya00@yopmail.com");		
			System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
		    Thread.sleep(2000);		
		    
		    WebElement Password= VG.findElement(By.xpath("//input[@id='Password']"));
		    Password.sendKeys("Priya@6767");	
		     System.out.println("Test Case 5 :password is added  -Test Case Passed");
		    Thread.sleep(2500);	
		    
		    //To click on eye icon
		    WebElement Eyeicon=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));
		    //old value //body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/span[1]
		    
		    Eyeicon.click();	
		     System.out.println("Test Case 6 :password is added  -Test Case Passed");

		    Thread.sleep(2000);																																													
		    Eyeicon.click();
		     System.out.println("Test Case 7 :password is added  -Test Case Passed");

		    VG.findElement(By.xpath("//input[@id='RememberMe']")).click();	
		     System.out.println("Test Case 8 :password is added  -Test Case Passed");

		    WebElement Loginicon= VG.findElement(By.xpath("//input[@id='loginBttn']"));
		    Loginicon.click();			
		     System.out.println("Test Case 9 :login icon is selected   -Test Case Passed");

		    Thread.sleep(5000);																																													
		    																																													
		  //to go to manage appointment 																																													
		  		VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/a")).click();		// old dropdownMenuLink																																									
		  		Thread.sleep(1000);																																											
		  							
			     System.out.println("Test Case 10 :manage appointment is selected  -Test Case Passed");

		  		VG.findElement(By.partialLinkText("Dashboard")).click();																																											
		  		Thread.sleep(1500);
			     System.out.println("Test Case 11 : Dashboard icon is selected  -Test Case Passed");

		  																																													
		    String MA=VG.findElement(By.xpath("//h2[contains(text(),'Manage Member Appointment')]")).getText();																																													
		    System.out.println("User landed on to page "+MA);																																													
		    																																													
		//All sections are displayed																																													
																																															
					String Pendingtab=VG.findElement(By.className("pending-button")).getText();																																										
					System.out.println("Tab is :"+Pendingtab);																																										
					VG.findElement(By.className("pending-button")).click();																																										
					Thread.sleep(8000);																																										
					String Confirmedtab=VG.findElement(By.className("confirm-button")).getText();																																										
					System.out.println("Tab is :"+Confirmedtab);																																										
					VG.findElement(By.className("confirm-button")).click();																																										
					Thread.sleep(8000);																																										
					String Completetab=VG.findElement(By.className("complete-button")).getText();																																										
					System.out.println("Tab is :"+Completetab);																																										
					VG.findElement(By.className("complete-button")).click();																																										
					Thread.sleep(9000);																																										
					String CanceleedTab=VG.findElement(By.className("cancel-button")).getText();																																										
					System.out.println("Tab is :"+CanceleedTab);																																										
					VG.findElement(By.className("cancel-button")).click();																																										
					System.out.println(" Test Case 12 : All Tabs are Displayed  -Test Case Passed");																																										
					Thread.sleep(9000);																																										
																																															
																																															
		//To Check the Footer																																													
																																															
		//ABOUT US 																																													
								WebElement ABOUTUS=VG.findElement(By.xpath("//div[@id='header-nav']//a[contains(text(),'About Us')]"));																																							
								if(ABOUTUS.isEnabled()) {																																							
									System.out.println("Test Case 13 :ABOUT US icon is present -Test Case Passed");																																						
								}																																							
									else {																																						
										System.out.println("Test Case 13: ABOUT US icon is Not present -Test Case Failled");																																					
									}																																						
								Thread.sleep(1000);																																							
		//HOW IT WORKS 																																													
																																															
								WebElement HOWITWORKS=VG.findElement(By.xpath("//div[@id='header-right-side']//li[3]"));																																							
								if(HOWITWORKS.isEnabled()) {																																							
									System.out.println("Test Case 14 : HOW IT WORKS icon is present -Test Case Passed");																																						
								}																																							
									else {																																						
										System.out.println("Test Case 14 : HOW IT WORKS icon is Not present -Test Case Failled");																																					
									}																																						
								Thread.sleep(1000);																																							
		//FIND DOCTORS 																																													
								WebElement FINDDOCTORS =VG.findElement(By.xpath("//a[contains(text(),'Find Doctors')]"));																																							
								if(FINDDOCTORS.isEnabled()) {																																							
									System.out.println("Test Case 15 :FIND DOCTORS icon is present -Test Case Passed");																																						
								}																																							
									else {																																						
										System.out.println("Test Case 15 :FIND DOCTORS icon is Not present -Test Case Failled");																																					
									}																																						
								Thread.sleep(1000);																																							
		//CONTACT US 																																													
																																															
								WebElement CONTACTUS =VG.findElement(By.xpath("//div[@id='header-nav']//a[contains(text(),'Contact Us')]"));																																							
								if(CONTACTUS.isEnabled()) {																																							
									System.out.println("Test Case 16 :CONTACT US icon is present -Test Case Passed");																																						
								}																																							
									else {																																						
										System.out.println("Test Case 16 : CONTACT US icon is present -Test Case Passed");																																					
									}																																						
								Thread.sleep(1000);																																							
		//Security and Privacy icon is Available																																													
								WebElement SecurityandPrivacy=VG.findElement(By.xpath("//a[contains(text(),'Security & Privacy')]"));																																							
								if(SecurityandPrivacy.isEnabled()) {																																							
									System.out.println("Test Case 17 : Security and Privacy icon is present -Test Case Passed");																																						
								}																																							
									else {																																						
										System.out.println("Test Case 17 :  Security and Privacy icon is Not present -Test Case Failled");																																					
									}																																						
								Thread.sleep(1000);																																							
																																															
		//Terms and conditions icon is Available																																													
								WebElement Termsandconditions=VG.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]"));																																							
								if(Termsandconditions.isEnabled()) {																																							
									System.out.println("Test Case 18 : Terms and conditions icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 18 :  Terms and conditions icon is Not present -Test Case Failled");																																						
								}																																							
																																															
								Thread.sleep(1000);																																							
		//Hippa icon is Available																																													
								WebElement Hippa =VG.findElement(By.xpath("//a[contains(text(),'HIPAA')]"));																																							
								if(Hippa.isEnabled()) {																																							
									System.out.println("Test Case 19 : Hippa icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 19 :  Hippa icon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);																																							
		//Social icon: 																																													
		//FB																																													
				/*																																											
								WebElement FB =VG.findElement(ByXPath("//body/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");																																							
								if(Hippa.isEnabled()) {																																							
									System.out.println("Test Case 20 : Facebook icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 20 :  Facebook icon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);																																							
																																															
		//Insta																																													
																																															
								WebElement Insta =VG.findElement(ByXPath("//body/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]");																																							
								if(Hippa.isEnabled()) {																																							
									System.out.println("Test Case 21 : Insta icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 21 : Insta  icon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);																																							
		//Twitter																																													
																																															
								WebElement Twitter =VG.findElement(ByXPath("//body/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]/img[1]");																																							
								if(Hippa.isEnabled()) {																																							
									System.out.println("Test Case 22 : Twitter icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 22 :  Twitter icon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);																																							
		//Left side view																																													
																																															
								/*WebElement SocialConnection =VG.findElement(ByXPath("//a[contains(text(),'Social Connection')]");																																							
								if(SocialConnection.isEnabled()) {																																							
									System.out.println("Test Case 23 : Social Connection icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 23 :  Social Connection icon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);*/																																							
																																															
								WebElement MemberProfile =VG.findElement(By.xpath("//a[contains(text(),'Member Profile')]"));																																							
								if(MemberProfile.isEnabled()) {																																							
									System.out.println("Test Case 24 :Member Profile icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 24 :  Member Profile icon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);																																							
								WebElement BookAppointment =VG.findElement(By.xpath("//a[contains(text(),'BOOK A NEW APPOINTMENT')]"));																																							
								if(BookAppointment.isEnabled()) {																																							
									System.out.println("Test Case 25 : Book new appointment icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 25 :  Book new appointment icon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);																																							
								WebElement ReferLemniska =VG.findElement(By.xpath("//a[contains(text(),'Refer Lemniska')]"));																																							
								if(ReferLemniska .isEnabled()) {																																							
									System.out.println("Test Case 26 : ReferLemniska icon is present -Test Case Passed");																																						
								}																																							
								else {																																							
									System.out.println("Test Case 26 :  ReferLemniskaicon is Not present -Test Case Failled");																																						
																																															
								}																																							
								Thread.sleep(1000);																																							
																																															
																																															
		//To Click on the Home icon and working																																													
																																															
								WebElement Homeicon=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));																																							
								Homeicon.click();																																							
								Thread.sleep(5000);																																							
								String HomePageURL=VG.getCurrentUrl();																																							
								assertEquals(HomePageURL, "https://www.lemniska.com/home");																																							
								System.out.println("Test case 27 : Assert for Lemniska Credits URL is passed");																																							
																																															
																																															
		//To check the Homepageicons and titles																																													
								String Tagline1=VG.findElement(By.xpath("//h2[contains(text(),'Consult A Doctor From Anywhere')]")).getText();																																							
								assertEquals(Tagline1, "Consult A Doctor From Anywhere");																																							
								String Tagline2=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText();																																							
								assertEquals(Tagline2, "Access an exclusive network of healthcare professionals and businesses.");																																							
								System.out.println("Test case 28 : Assert for HomePage Text is passed");																																							
																																															
		//To search speciality 																																													
								WebElement selectspeciality=VG.findElement(By.xpath("//select[@id='search_SpecId']"));																																							
								selectspeciality.sendKeys("General Dentist");		
								System.out.println("Test case 29 : Detist is selected : Test case passed");																																							

								Thread.sleep(2000);																																							
								WebElement Searchicon=VG.findElement(By.cssSelector("#btn-search"));																																							
								Searchicon.click();																																							
								Thread.sleep(2000);																																							
								//WebElement timeslot=VG.findElement(ByClassName("vg-weekly-slot");																																							
								//if(timeslot.isEnabled()) {																																							
									//System.out.println("Test case 53 : slots are displayed-Test case passed");																																						
									//}																																						
									//else {																																						
										//System.out.println("Test case 53 : slots are not displayed-Test case passed");																																					
									//}																																						
																																															
								VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]")).click();																																							
																																															
		//To check the Next page for store 																																													
						/*																																									
								WebElement Googleplaystore=VG.findElement(ByXPath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/div[3]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");																																							
								Googleplaystore.click();																																							
								Thread.sleep(2000);																																							
								ArrayList Googlestore=new ArrayList(VG.getWindowHandles());																																							
								VG.switchTo().window((String)Googlestore.get(1));																																							
								Thread.sleep(2000);																																							
								String Content=VG.findElement(ByXPath("//span[contains(text(),'Lemniska - Doctor Appointment App')]").getText();																																							
								System.out.println("Content Received is "+Content);																																							
								//WebElement Install=VG.findElement(ByXPath("//body/div[@id='fcxH9b']/div[4]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/main[1]/c-wiz[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/c-wiz[1]/c-wiz[1]/div[1]/span[1]/button[1]");																																							
								//if(Install.isEnabled()) {																																							
									//System.out.println("Test Case 30 :Install icon is present -Test Case Passed");																																						
							//	}																																							
									//else {																																						
										//System.out.println("Test Case 30: install icon is Not present -Test Case Failled");																																					
									//}																																						
																																															
								Thread.sleep(2000);																																							
								ArrayList Googlestoreb=new ArrayList(VG.getWindowHandles());																																							
								VG.switchTo().window((String)Googlestore.get(0));																																							
								Thread.sleep(2000);																																							
																																															
								WebElement playstore=VG.findElement(ByXPath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/div[3]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]");																																							
								playstore.click();																																							
								ArrayList Playstore=new ArrayList(VG.getWindowHandles());																																							
								VG.switchTo().window((String)Playstore.get(2));																																							
								VG.navigate().refresh();																																							
								VG.navigate().refresh();																																							
								//WebDriverWait wait = new WebDriverWait(VG, 15);																																							
								//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Open the Mac App Store to buy and download apps.')]")));																																							
								ArrayList Playstoreback=new ArrayList(VG.getWindowHandles());																																							
								VG.switchTo().window((String)Googlestore.get(0));																																							
																																															
						*/																																									
		//To check the Links are opening to the new page or not from the footer																																													
		//Security and Privacy icon is Available																																													
											WebElement SecurityandPrivacyy=VG.findElement(By.xpath("//a[contains(text(),'Security & Privacy')]"));																																				
											if(SecurityandPrivacyy.isEnabled()) {																																				
												System.out.println("Test Case 31 : Security and Privacy icon is present -Test Case Passed");																																			
											}																																				
												else {																																			
													System.out.println("Test Case 31 :  Security and Privacy icon is Not present -Test Case Failled");																																		
												}																																			
											Thread.sleep(1000);																																				
											SecurityandPrivacyy.click();																																				
											ArrayList SP=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)SP.get(1));																																				
											Thread.sleep(2000);																																				
											String PrivacyURL=VG.getCurrentUrl();
											
											assertEquals(PrivacyURL, "https://www.lemniska.com/policy/security-and-privacy.pdf");																																				
											System.out.println("Test case 32 : Assert for Lemniska Security and priacy URL is passed");																																				
											ArrayList SPback=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)SP.get(0));																																				
																																															
																																															
		//Terms and conditions icon is Available																																													
											WebElement Termsandconditionss=VG.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]"));																																				
											if(Termsandconditionss.isEnabled()) {																																				
												System.out.println("Test Case 33 : Terms and conditions icon is present -Test Case Passed");																																			
											}																																				
											else {																																				
												System.out.println("Test Case 33 :  Terms and conditions icon is Not present -Test Case Failled");																																			
											}																																				
																																															
											Thread.sleep(1000);																																				
											Termsandconditionss.click();																																				
											ArrayList Terms=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)Terms.get(2));																																				
											Thread.sleep(2000);																																				
											String TermsURL=VG.getCurrentUrl();																																				
											assertEquals(TermsURL, "https://www.lemniska.com/policy/terms-and-conditions.pdf");																																				
											System.out.println("Test case 34 : Assert for Terms URL is passed");																																				
											ArrayList Termsback=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)Terms.get(0));																																				
																																															
		//Hippa icon is Available																																													
											WebElement Hippaa =VG.findElement(By.xpath("//a[contains(text(),'HIPAA')]"));																																				
											if(Hippaa.isEnabled()) {																																				
												System.out.println("Test Case 35 : Hippa icon is present -Test Case Passed");																																			
											}																																				
											else {																																				
												System.out.println("Test Case 35 :  Hippa icon is Not present -Test Case Failled");																																			
																																															
											}																																				
											Thread.sleep(1000);																																				
											Hippaa.click();																																				
											ArrayList HippaPage=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)HippaPage.get(3));																																				
											Thread.sleep(2000);																																				
											String HippaURL=VG.getCurrentUrl();																																				
											assertEquals(HippaURL, "https://www.lemniska.com/policy/lemniska-hipaa-authorization.pdf");																																				
											System.out.println("Test case 36 : Assert for Hippa URL is passed");																																				
											ArrayList HippaPageback=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)HippaPage.get(0));																																				
		//Social icon: 																																													
		//FB																																													
		/*																																													
											WebElement FaceBook =VG.findElement(ByXPath("//body/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");																																				
											if(FaceBook.isEnabled()) {																																				
												System.out.println("Test Case 37 : Facebook icon is present -Test Case Passed");																																			
											}																																				
											else {																																				
												System.out.println("Test Case 37 :  Facebook icon is Not present -Test Case Failled");																																			
																																															
											}																																				
											Thread.sleep(1000);																																				
											FaceBook.click();																																				
											ArrayList facebook=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)facebook.get(6));																																				
											Thread.sleep(2000);																																				
											String facebookURL=VG.getCurrentUrl();																																				
											//assertEquals(facebookURL, "https://www.facebook.com/Lemniskahealth/");																																				
											System.out.println("Test case 38 : Assert for facebok URL is passed");																																				
											ArrayList FBback=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)facebook.get(0));																																				
																																															
																																															
		//Insta																																													
																																															
											WebElement Instag =VG.findElement(ByXPath("//body/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]");																																				
											if(Instag.isEnabled()) {																																				
												System.out.println("Test Case 39 : Insta icon is present -Test Case Passed");																																			
											}																																				
											else {																																				
												System.out.println("Test Case 39 : Insta  icon is Not present -Test Case Failled");																																			
																																															
											}																																				
											Thread.sleep(1000);																																				
											Instag.click();																																				
											ArrayList Instagram=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)Instagram.get(7));																																				
											Thread.sleep(2000);																																				
											String InstagramURL=VG.getCurrentUrl();																																				
											//assertEquals(InstagramURL, "https://www.instagram.com/Lemniska.health/");																																				
											System.out.println("Test case 40 : Assert for insta URL is passed");																																				
											ArrayList Instagramback=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)Instagram.get(0));																																				
		//Twitter																																													
																																															
											WebElement Twitterr =VG.findElement(ByXPath("//body/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]/img[1]");																																				
											if(Twitterr.isEnabled()) {																																				
												System.out.println("Test Case 41 : Twitter icon is present -Test Case Passed");																																			
											}																																				
											else {																																				
												System.out.println("Test Case 41 :  Twitter icon is Not present -Test Case Failled");																																			
																																															
											}																																				
											Thread.sleep(1000);																																				
											Twitterr.click();																																				
											ArrayList Twitteerr=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)Twitteerr.get(8));																																				
											Thread.sleep(2000);																																				
											String TwitterrURL=VG.getCurrentUrl();																																				
											assertEquals(TwitterrURL, "https://twitter.com/Lemniska");																																				
											System.out.println("Test case 42 : Assert for twitter  URL is passed");																																				
											ArrayList Twitterrback=new ArrayList(VG.getWindowHandles());																																				
											VG.switchTo().window((String)Twitteerr.get(0));																																				
																																															
																																															
				*/																																											
		//To Find the doctor using the Link from the footer 																																													
										//	WebElement FindDoctor=VG.findElement(ByXPath("//a[contains(text(),'Find a Doctor')]");																																				
										//	FindDoctor.click();																																				
										//	Thread.sleep(4000);																																				
										//	System.out.println("Test case 43 : Find Doctor list is opened");																																				
																																															
																																															
		//To check the clinic name																																													
																																															
		//Clinic search Id 																																													
		//To check Search of the Doctor nanva																																													
											WebElement ClinicSearch=VG.findElement(By.xpath("//*[@id=\"PName\"]"));																																				
											ClinicSearch.sendKeys("nanva");																																				
											Thread.sleep(1000);																																				
											//WebElement Search=VG.findElement(ByXPath("//button[@id='btn-search']");																																				
											//Search.click();																																				
											Thread.sleep(1000);																																				
											ClinicSearch.clear();																																				
											Thread.sleep(1000);																																				
		//To check Search of the Doctor nanva																																													
											ClinicSearch.sendKeys("@1231231232323");																																				
											Thread.sleep(1000);																																				
											ClinicSearch.clear();																																				
											//To check Search of the Doctor nanva																																				
											ClinicSearch.sendKeys("sdfasdhfjksdfsua uiasdfdf");																																				
											ClinicSearch.clear();																																				
											System.out.println("Test case 44 : Find Doctor list is opened : Test case passed");																																				
																																															
																																															
		//To Click on the Home icon and working																																													
																																															
											WebElement Homeiconn=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));																																				
											Homeiconn.click();	
											System.out.println("Test case 45 : Find Doctor list is opened : Test case passed");	
											Thread.sleep(5000);																																				
																																															
		//To click on the Book appointment 																																													
											WebElement Bookappointment=VG.findElement(By.xpath("//a[contains(text(),'Book an Appointment')]"));																																				
											Bookappointment.click();
											System.out.println("Test case 46 : Book appointment is selected : Test case passed");	
											Thread.sleep(5000);																																				
											String BookappointmentURL=VG.getCurrentUrl();																																				
																																															
																																															
																																															
																																															
		//To check the menu bar																																													
											WebElement MenuBar1=VG.findElement(By.xpath("//div[@class='dropdown']//a[@class='dropdown-toggle']"));																																				
											MenuBar1.click();																																				
										    Thread.sleep(10000);																																					
											WebElement MenuBarManageAppointment=VG.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/div/ul/li[1]/a"));																																				
											if(MenuBarManageAppointment.isEnabled()) {																																				
											System.out.println("Test case 47 : Manage Appointment is present-Test case passed");																																				
											}																																				
											else {																																				
											System.out.println("Test case 47 : Manage Appointment is Not present-Test case Failled");																																				
											}																																				
											Thread.sleep(1000);																																				
																																															
		//To check the menu bar-My Dash-board																																													
											WebElement MyDashboard=VG.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/div/ul/li[2]/a"));																																				
											if(MyDashboard.isEnabled()) {																																				
											System.out.println("Test case 48 : My Dashboard is present-Test case passed");																																				
											}																																				
											else {																																				
											System.out.println("Test case 48 : My Dashboard is Not present-Test case Failled");																																				
											}																																				
											Thread.sleep(1000);																																				
																																															
		//To check the menu bar-Change Password																																													
												WebElement ChangePassword=VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]"));																																			
												if(ChangePassword.isEnabled()) {																																			
												System.out.println("Test case 49 : Change Password is present -Test case passed");																																			
												}																																			
												else {																																			
												System.out.println("Test case 49 : Change Password is present-Test case Failled");																																			
																																															
												}																																			
												Thread.sleep(1000);																																			
																																															
		//To check the menu bar-LemniskaCredit																																													
													WebElement LemniskaCredit=VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[4]/a[1]"));																																		
													if(LemniskaCredit.isEnabled()) {																																		
													System.out.println("Test case 50 : Lemniska Credit is present-Test case passed");																																		
													}																																		
													else {																																		
													System.out.println("Test case 50 : Lemniska Credit is Not  present-Test case Failled");																																		
																							}																								
													Thread.sleep(1000);																																		
		//To check the menu bar-Manage appointments																																													
														WebElement Logout=VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[5]/a[1]"));																																	
														if(Logout.isEnabled()) {																																	
														System.out.println("Test case 51 : Logout is present-Test case passed");																																	
														}																																	
														else {																																	
														System.out.println("Test case 51 : Logout is present-Test case Failled");																																	
														}																																	
														Thread.sleep(1000);																																	
																															
																																															
		//To check the clinic name																																													
																																															
		//Clinic search Id 																																													
		//To check Search of the Doctor nanva																																													
														WebElement ClinicSearchh=VG.findElement(By.xpath("//*[@id=\"PName\"]"));																																	
														ClinicSearchh.sendKeys("nanva");																																	
														Thread.sleep(1000);																																	
														//WebElement Search=VG.findElement(ByXPath("//button[@id='btn-search']");																																	
														//Search.click();																																	
														Thread.sleep(1000);																																	
														ClinicSearchh.clear();																																	
														Thread.sleep(1000);			
														System.out.println("Test case 52 : Doctor is searched and data is cleared : Test case passed");	
		//To check Search of the Doctor nanva																																													
														ClinicSearchh.sendKeys("@1231231232323");																																	
														Thread.sleep(1000);																																	
													    ClinicSearchh.clear();																																		
														//To check Search of the Doctor nanva																																	
														ClinicSearchh.sendKeys("sdfasdhfjksdfsua uiasdfdf");																																	
														ClinicSearchh.clear();																																	
														System.out.println("Test case 53 :Numeric data- Doctor is searched and data is cleared for  : Test case passed");	
																																
		//To check the Menu bar 																																													
														//WebElement MenuBarDown=VG.findElement(ByXPath("//div[@class='dropdown']//a[@class='dropdown-toggle']");																																	
																																															
														//MenuBarDown.click();																																	
													    Thread.sleep(4000);																																		
																																															
																																															
		//To check the Manage appointment																																													
																																															
																																															
													    WebElement ManageAppointmentmenubar=VG.findElement(By.className("VGMA"));																																		
													ManageAppointmentmenubar.click();																																		
													Thread.sleep(5000);																																		
												    String Mappointment=VG.findElement(By.xpath("//h2[contains(text(),'Manage Member Appointment')]")).getText();																																			
												    System.out.println("Test case 54 : User landed on to page "+Mappointment);																																			
												    Thread.sleep(5000);																																			
																																															
												    WebElement MenuBarDown1=VG.findElement(By.xpath("//div[@class='dropdown']//a[@class='dropdown-toggle']"));																																			
													MenuBarDown1.click();																																		
												    Thread.sleep(4000);																																			
													WebElement MyProfile=VG.findElement(By.linkText("My Profile"));																																		
													MyProfile.click();																																		
													System.out.println("Test Case 55 : My Profile is clickable : Test case passed");																																		
													 																																		
																																															
		//to click on edit																																													
																																															
													WebElement Edit=VG.findElement(By.xpath("//a[@id='btn-search']"));																																		
													Edit.click();		
													System.out.println("Test Case 56 : Edit icon is selected : Test case passed");																																		

													Thread.sleep(4000);																																		
																																															
		//To enter the First name and last name 																																													
													VG.findElement(By.id("FirstName")).clear();																																		
													Thread.sleep(4000);																																		
													VG.findElement(By.id("FirstName")).sendKeys("John");																																		
													Thread.sleep(2000);																																		
													VG.findElement(By.id("LastName")).clear();																																		
													Thread.sleep(4000);																																		
													VG.findElement(By.id("LastName")).sendKeys("Snow");																																		
													Thread.sleep(2000);		
													System.out.println("Test Case 57 : First name and last name validation is tested : Test case passed");																																		

																																															
		//To change the Gender																																													
													VG.findElement(By.id("GenderId")).click();																																		
													Thread.sleep(2000);																																		
													VG.findElement(By.id("GenderId")).click();																																		
													System.out.println("Test Case 58 : Gender validation is tested : Test case passed");																																		
																																	
		//To change the address																																													
													VG.findElement(By.id("Address1")).clear();																																		
													Thread.sleep(2000);																																		
													VG.findElement(By.id("Address1")).sendKeys("Near Fountain Park,GMT Building");																																		
													System.out.println("Test Case 59 : Address name validation is tested : Test case passed");																																		
																																	
		//To change the State 																																													
													VG.findElement(By.id("StateProvinceId")).click();																																		
													Thread.sleep(2000);																																		
													VG.findElement(By.xpath("//option[contains(text(),'Texas')]")).click();																																		
													Thread.sleep(2000);																																		
													VG.findElement(By.id("CityName")).click();																																		
													Thread.sleep(2000);																																		
													System.out.println("Test Case 60 : City add validation is tested : Test case passed");																																		
																																	
																																															
																																															
																																															
		//To check the Lemniska Credit 																																													
		//To click on the menu bar																																													
													WebElement MnuBar=VG.findElement(By.xpath("//div[@class='dropdown']//a[@class='dropdown-toggle']"));																																		
														//WebElement =VG.findElement(ByXPath("//*[@id=\"header-right-button\"]/div[2]/div");																																	
														MnuBar.click();																																	
														Thread.sleep(4000); 																																	
														System.out.println("Test Case 61 : Menu bar is selected : Test case passed");																																		
																																
		//To click on the Lemniska Credit																																													
												        VG.findElement(By.linkText("Lemniska Credits")).click();																																			
														Thread.sleep(4000);																																	
														System.out.println("Test Case 62 : Lemniska Credits is selected : Test case passed");																																		
																																
		//To Check the Entered Window																																													
														String Title=VG.findElement(By.xpath("//h2[contains(text(),'Lemniska Credits')]")).getText();																																	
														if(Title.contains("Lemniska Credits")) {																																	
															System.out.println("Test case 63 : We are on the Lemniska Credits Credit window");																																
														}																																	
														else {																																	
															System.out.println("Test case 63 : We are Not on the Lemniska Credits Credit window");																																
																																															
																}																															
																																															
		//TO check the FIND DOCTOR																																													
		//To check the Entered window																																													
																																															
		//To enter the manage appointment and check the title and book appointment 																																													
																																															
														WebElement MGAppointment=VG.findElement(By.xpath("//div[@class='profile-leftbar']//a[contains(text(),'Manage Appointments')]"));																																	
														MGAppointment.click();	
														System.out.println("Test Case 64 : Manage appointment icon is selected : Test case passed");																																		

														Thread.sleep(5000);																																	
														String Title1=VG.findElement(By.xpath("//h2[contains(text(),'Manage Member Appointment')]")).getText();																																	
														System.out.println("Window Entered is : "+Title1);																																	
																																															
		//To click on the book appointment																																													
														VG.findElement(By.linkText("BOOK A NEW APPOINTMENT")).click();	
														System.out.println("Test Case 65 : Book New appointment is selected : Test case passed");																																		

															Thread.sleep(2000);																																
																																															
		//Enter the numeric and alphanumeric keys																																													
															VG.findElement(By.id("PName")).sendKeys("@");																																
															VG.findElement(By.id("btn-search")).click();																																
															//String Errorforalphanumerickeys =VG.findElement(ByXPath("//span[contains(text(),'Please enter valid name.')]").getText();																																
															//System.out.println("Error for the Symbols keys is : "+Errorforalphanumerickeys);																																
															VG.findElement(By.id("PName")).clear();																																
															Thread.sleep(2000);																																
																																															
		//Enter the numeric characters																																													
															VG.findElement(By.id("PName")).sendKeys("123");																																
															VG.findElement(By.id("btn-search")).click();																																
															String Errorfornumeric =VG.findElement(By.xpath("//span[contains(text(),'Please enter valid name.')]")).getText();																																
															Thread.sleep(2000);																																
															System.out.println("Test case for symbol : Error for the alphanumeric keys is : "+Errorfornumeric);																																
															VG.findElement(By.id("PName")).clear();																																
															Thread.sleep(2000);																																
															System.out.println("Test case 66 : All validations are Checked-Test Case Passed ");																																
																																															
																																															
		//To Click on the Home icon and working																																													
																																															
															WebElement Homeiconagain=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));																																
															Homeiconagain.click();	
															System.out.println("Test Case 67 : Home icon is selected : Test case passed");																																		

															Thread.sleep(5000);																																
																																															
		//To check the Lemniska Download icon 																																													
																																															
															/*WebElement DownloadLemniskacion=VG.findElement(ByXPath("//a[contains(text(),'Download Lemniska App')]");																																
															DownloadLemniskacion.click();																																
															System.out.println("user is landed on the Get Lemniska app ");																																
															String Receviedgetapptext=VG.findElement(ByXPath("//h1[contains(text(),'Get The Lemniska App !')]").getText();																																
															Assert.assertEquals(Receviedgetapptext, "Get The Lemniska App !");*/																																
																																															
																																															
		//To go to  menu bar and enter manage appointmnent and enter the refer Lemniska member side 																																													
															WebElement MenuBarDownrefercheck=VG.findElement(By.xpath("//div[@class='dropdown']//a[@class='dropdown-toggle']"));																																
															MenuBarDownrefercheck.click();
															System.out.println("Test Case 68 : Menu drop down is selected : Test case passed");																																		

														Thread.sleep(4000);																																	
																																															
		//To go to manage appointment																																													
														VG.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/div/ul/li[1]/a")).click();																																	
																																															
		//To check the refer 																																													
															// Refer Lemniska icon is Available																																
															WebElement ReferVigortmember=VG.findElement(By.xpath("//a[contains(text(),'Refer Lemniska')]"));																																
															if(ReferVigortmember.isEnabled()) {																																
																System.out.println("Test Case 69 : REFER Lemniska is present -Test Case Passed");																															
															}																																
															else {																																
																System.out.println("Test Case 69 :  REFER Lemniska is Not present -Test Case Failled");																															
															}																																
																																															
															Thread.sleep(1000);																																
															ReferVigortmember.click();																																
															System.out.println("Test Case 70 : REFER Lemniska is selected -Test Case Passed");																															
																																															
																																															
															//to Refer Lemniska																																
																																															
																																															
																										String HeadingReferal=VG.findElement(By.xpath("//h2[contains(text(),'Reward & Referral')]")).getText();																					
																										System.out.println("HeadingReferal Text is : "+HeadingReferal);																					
																										if(HeadingReferal.contains("Reward & Referral")){																					
																											System.out.println("Test Case 71 : You Enter the Referal window -Test Case Passed");																				
																										}																					
																										else {																					
																											System.out.println("Test Case 71 : Not on the Referal window-Test Case Failled");																				
																																															
																										}																					
																										String SubHeadingReferal=VG.findElement(By.xpath("//span[contains(text(),'& EARN')]")).getText();																					
																										System.out.println("Sub Heading Texts is REFER & : "+SubHeadingReferal);																					
																																															
																																															
																																															
															//To check invitation medium																																
																										String Refermedium1=VG.findElement(By.xpath("//div[@class='invitie-sec']//img")).getText();																					
																										System.out.println("Refermedium1 is Email : "+Refermedium1);																					
																																															
																										WebElement Referbyemail=VG.findElement(By.id("Email"));																					
															//case 1-incorrect email 																																
																																															
																										JavascriptExecutor js = (JavascriptExecutor) VG;																					
																										js.executeScript("window.scrollBy(0,10000)");																					
																																															
																										Referbyemail.sendKeys("amitkumar");																					
																										Thread.sleep(2000);																					
																										VG.findElement(By.id("btn_email")).click();																					
																										Thread.sleep(1000);																					
																										String errorincorrectemail=VG.findElement(By.className("error")).getText();																					
																										System.out.println("Text is :"+errorincorrectemail);																					
																										if(errorincorrectemail.contains("Please enter your valid email address.")){																					
																											System.out.println("Test Case 72 : Case for invalid email is working-Test Case Passed");																				
																										}																					
																										else {																					
																											System.out.println("Test Case 72 : Case for invalid email Not working-Test Case Failled ");																				
																										}																					
																																															
															//case 2-without Text email 																																
																			Thread.sleep(2000);																												
																			Referbyemail.clear();																												
																			Thread.sleep(1000);																												
																			VG.findElement(By.id("btn_email")).click();																												
																			Thread.sleep(1000);																												
																			String noemail=VG.findElement(By.className("error")).getText();																												
																			System.out.println("Text is :"+noemail);																												
																			if(noemail.contains("Please enter your email address.")){																												
																				System.out.println("Test Case 73 : Case 2 for the No email is working-Test Case Passed");																											
																			}																												
																			else {																												
																				System.out.println("Test Case 73 : Case 2 for the No email is Not working-Test Case Failled");																											
																				}																											
																																															
															//Correct email																																
																			Thread.sleep(2000);																												
																			Referbyemail.sendKeys("amit.doad@lemniska.com");																												
																			Thread.sleep(1000);																												
																			VG.findElement(By.id("btn_email")).click();																												
																			Thread.sleep(1000);																												
																																															
															//Refer by mobile number																																
																			String Refermedium2=VG.findElement(By.xpath("//h3[contains(text(),'Invite By Mobile')]")).getText();																												
																			System.out.println("Refermedium2 is via mobile: "+Refermedium2);																												
																																															
																			WebElement Referbymobile=VG.findElement(By.id("Phone"));																												
																																															
															//Case 1-wrong number																																
																			Thread.sleep(2000);																												
																			Referbymobile.sendKeys("1234");																												
																			Thread.sleep(1000);																												
																			VG.findElement(By.id("btn_phone")).click();																												
																			Thread.sleep(2000);																												
																			String wrongnumber=VG.findElement(By.xpath("//*[@id=\"lower-main-contain\"]/form/div[2]/div/div/div[2]/div/div[4]/div/div[2]/div/div[2]/span[2]")).getText();																												
																			System.out.println("Wrong number error text is :"+wrongnumber);																												
																			if(wrongnumber.contains("Please enter your valid phone number.")){																												
																				System.out.println("Test Case 74  : Case 1 for mobile numberis working-Test Case Passed");																											
																				}																											
																				else {																											
																					System.out.println("Test Case 74  : Case 1 for mobile number is working-Test Case Failled");																										
																					}																										
															//Case 2-No number																																
																																															
																				Thread.sleep(1000);																											
																				VG.findElement(By.id("btn_phone")).click();																											
																				Thread.sleep(2000);																											
																				String Nonumber=VG.findElement(By.xpath("//*[@id=\"lower-main-contain\"]/form/div[2]/div/div/div[2]/div/div[4]/div/div[2]/div/div[2]/span[2]")).getText();																											
																				System.out.println("Wrong number error text is :"+Nonumber);																											
																				if(Nonumber.contains("Please enter your phone number.")){																											
																				System.out.println("Test Case 75  : Case 2 for mobile number is working-Test Case Passed");																											
																				}																											
																				else {																											
																					System.out.println("Test Case 75  : Case 2 for mobile number is working-Test Case Failled");																										
																					}																										
																																															
																																															
																																															
																																															
															//To clickon the homeicon																																
																																															
															//																																
																												WebElement Homeicon1=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));																			
																												Homeicon1.click();	
																												System.out.println("Test Case 76 : Home icon is selected -Test Case Passed");
																												Thread.sleep(5000);																			
																																															
																																															
																												//To clickon the homeicon																			
																																															
																												//																			
																																									WebElement Homeicon4=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));						
																																									Homeicon4.click();	
																																									System.out.println("Test Case 77 : Home icon is selected-Test Case Passed");
																																									Thread.sleep(5000);						
																																															
																																															
																																															
																															////////////////////////////////////////////////To check the Homepageicons and titles																
																																									//To check the Top Specialities icon by clicking some and enabled check						
																																															
																																									WebElement GeneralCare=VG.findElement(By.xpath("//h6[contains(text(),'General Care')]"));						
																																									if(GeneralCare.isEnabled()) {						
																																															
																																										System.out.println("Test Case 78  : GeneralCare is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 78  : GeneralCare is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																									Thread.sleep(1000);						
																																									WebElement Dermatologists=VG.findElement(By.xpath("//h6[contains(text(),'Dermatologists')]"));						
																																									if(Dermatologists.isEnabled()) {						
																																															
																																										System.out.println("Test Case 79  : Dermatologists is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 79  : Dermatologists is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																									WebElement Dentist=VG.findElement(By.xpath("//h6[contains(text(),'Dentist')]"));						
																																									if(Dentist.isEnabled()) {						
																																															
																																										System.out.println("Test Case 80  : Dentist is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 80  : Dentist is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																									WebElement ChildCare=VG.findElement(By.xpath("//h6[contains(text(),'Child Care')]"));						
																																									if(ChildCare.isEnabled()) {						
																																															
																																										System.out.println("Test Case 81  : ChildCare is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 81  : ChildCare is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																									WebElement Eye=VG.findElement(By.xpath("//h6[contains(text(),'Eye')]"));						
																																									if(Eye.isEnabled()) {						
																																															
																																										System.out.println("Test Case 82  : Eye is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 82  : Eye is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																									WebElement ENT=VG.findElement(By.xpath("//h6[contains(text(),'ENT')]"));						
																																															
																																									if(ENT.isEnabled()) {						
																																															
																																										System.out.println("Test Case 83  : ENT is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 83  : ENT is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																									WebElement Gastroenterologist=VG.findElement(By.xpath("//h6[contains(text(),'Gastroenterologist')]"));						
																																									if(Gastroenterologist.isEnabled()) {						
																																															
																																										System.out.println("Test Case 84  : Gastroenterologist is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 84  : Gastroenterologist is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																									WebElement Gynecologists=VG.findElement(By.xpath("//h6[contains(text(),'Gynecologists')]"));						
																																															
																																									if(Gynecologists.isEnabled()) {						
																																															
																																										System.out.println("Test Case 85  : Gynecologists is Present-Test Case Passed-Test Case Passed");					
																																									}						
																																															
																																										else {					
																																										System.out.println("Test Case 85  : Gynecologists is Not Present-Test Case Failled-Test Case Failled");					
																																															
																																										}					
																																															
																//To search the City 																															
																																															
																												WebElement City=VG.findElement(By.xpath("//input[@id='Search_by_city']"));																			
																												City.click();																			
																												City.sendKeys("Texas");																			
																												Thread.sleep(3000);																			
																												System.out.println("Test Case 86 :  Texas city  is Selected -Test Case Passed");																			
											// Search icon click and Function 																																				
																																															
																											WebElement Search=	VG.findElement(By.id("btn-search"));																			
																											Search.click();																				
																											Thread.sleep(2000);																				
																											WebElement Homeiconn2=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));																				
																											Homeiconn2.click();																				
																											Thread.sleep(4000);																				
																											System.out.println("Test Case 87 :  Homeicon is clicked -Test Case Passed");																				
											// To click on the e-Appointment on the homepage																																				
																																															
																											WebElement eAppointment=VG.findElement(By.xpath("//a[contains(text(),'Book an Appointment')]"));																				
																											eAppointment.click();																				
																											Thread.sleep(4000);																				
																											WebElement Homeiconnn=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));																				
																											Homeiconnn.click();																				
																											Thread.sleep(4000);																				
																											System.out.println("Test Case 88 :  Homeicon is clicked after e appointmetn search -Test Case Passed");																				
																																															
																																															
											// To check the Find Doctor click and matching URL 																																				
																									WebElement Finddoctorimage=VG.findElement(By.xpath("//a[contains(text(),'Find Doctor Now')]"));																						
																									Finddoctorimage.click();																						
																									WebElement Homeiconnnnn=VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]"));																						
																									Homeiconnnnn.click();																						
																									Thread.sleep(4000);																						
																									System.out.println("Test Case 59 :  Homeicon is clicked -Test Case Passed");																						
																																															
											// To check the Learn about Lemniska click and reading the text																																				
																																															
																				VG.findElement(By.xpath("//*[@id=\"headingOne\"]/button/h2")).click();																											
																				Thread.sleep(2000);																											
																				VG.findElement(By.xpath("//*[@id=\"headingOne\"]/button/h2")).click();																											
																				System.out.println("Test Configuration : B-Member Module is working as expected on Chrome");																											
																				VG.quit();																											
																																															
																																														
																									
																																															
			}

	
		
	}																																												
																																															
																																															
																																															
																																														


	
