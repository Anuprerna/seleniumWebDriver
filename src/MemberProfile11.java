package seleniumWebDriver;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.openqa.selenium.interactions.Actions;
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


public class MemberProfile11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver VG=new ChromeDriver();
		VG.get("https://qa.lemniska.com/");																																												
		VG.manage().window().maximize();																																												
		Thread.sleep(5000);	
		
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
		EmailAddress.sendKeys(" 83qaqa@yopmail.com");		
		System.out.println("Test Case 4 :Email address is added  -Test Case Passed");
	    Thread.sleep(2000);		
	    
	    WebElement Password= VG.findElement(By.xpath("//input[@id='Password']"));
	    Password.sendKeys("zzzzz");	
	     System.out.println("Test Case 5 :password is added  -Test Case Passed");
	    Thread.sleep(2500);	
	    
	    //To click on eye icon
	    WebElement Eyeicon=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));
	    //old value //body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/span[1]
	    
	    Eyeicon.click();	
	     System.out.println("Test Case 6 :Eye-icon is clicked once  -Test Case Passed");

	    Thread.sleep(2000);																																													
	    Eyeicon.click();
	     System.out.println("Test Case 7 :Eye-icon is clicked again  -Test Case Passed");

	    VG.findElement(By.xpath("//input[@id='RememberMe']")).click();	
	     System.out.println("Test Case 8 :Remember Me button is clicked  -Test Case Passed");

	    WebElement Loginicon= VG.findElement(By.xpath("//input[@id='loginBttn']"));
	    Loginicon.click();			
	     System.out.println("Test Case 9 :login icon is clicked   -Test Case Passed");

	    Thread.sleep(5000);																																													
	    																																													
	    //to go to manage appointment 																																													
	  	VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/a")).click();		// old dropdownMenuLink																																									
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case 10 :Dropdown button is clicked  -Test Case Passed");

	  	VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/div/ul/li[2]/a")).click();																																											
	  	Thread.sleep(1500);
		System.out.println("Test Case 11 : My Profile is selected from dropdown  -Test Case Passed");
		     
		VG.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div/div[2]/div/div[1]/div/h2/span")).click();																																											
	  	Thread.sleep(1500);
		System.out.println("Test Case 12 : Edit is selected  -Test Case Passed");    
		///html/body/div[7]/div/div/div/section/div/div/div/div[2]/div/div[1]/div/h2/span
		
		WebElement Adr11= VG.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		Adr11.clear();
		
		
		// WebElement Adr1= VG.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		 //  Adr1.sendKeys("zzan");
		   //Thread.sleep(1000);
		VG.findElement(By.id("Address1")).click();
		VG.findElement(By.id("Address1")).sendKeys("Adalberto Tejeda Ver., Mexico");
		VG.findElement(By.id("Address1")).click();    
		
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            VG.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        Thread.sleep(3000);
		System.out.println("Test Case 13 Test Case Passed");
		Thread.sleep(3000);
		VG.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
	  	Thread.sleep(1500);
	  	System.out.println("first time Profile saved");
		Thread.sleep(5000);
		
		WebElement Adr1= VG.findElement(By.xpath("//*[@id=\"Address1\"]"));
		Adr1.clear();
		
		VG.findElement(By.id("Address1")).click();
		VG.findElement(By.id("Address1")).sendKeys("Hidalgotitlán Ver., Mexico");
		VG.findElement(By.id("Address1")).click();
		
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            VG.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        Thread.sleep(3000);
		System.out.println("Second address saved.");
		Thread.sleep(3000);
		VG.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
	  	Thread.sleep(1500);
	  	System.out.println("Profile saved");
		Thread.sleep(3000);
	

			}

	
		
	}																																												
																																															
																																															
																																															
																																														


	
