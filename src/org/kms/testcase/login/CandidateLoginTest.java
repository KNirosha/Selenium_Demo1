package org.kms.testcase.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CandidateLoginTest {
	
	public static void main(String[] args) {
		//initialization
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_WS\\API\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String loginURL="https://toefl-registration-dev.ets.org/TOEFLWeb/extISERLogonPrompt.do";
		String LoginPageTitle="Log In";
		String actualTitle="";
		boolean testStatus=true;
		String usernam="pick7";
		String passwrd="0okm(IJN";
		
		//testcases
		//S1: Get the login url
		driver.get(loginURL);
		//S2: get the page title
		actualTitle=driver.getTitle();
		//S3: compare the titles
		if(!actualTitle.equals(LoginPageTitle)){
				testStatus=false;
		}
		//S3: Login
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys(usernam);
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(passwrd);
		
		WebElement signInButton= driver.findElement(By.linkText("Sign In"));
		
		signInButton.click();
			
		
		
	}

}
