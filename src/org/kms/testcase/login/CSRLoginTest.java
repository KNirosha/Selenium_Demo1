package org.kms.testcase.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSRLoginTest {

	public static void main(String[] args) throws Exception {
		//initialization 
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_WS\\API\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String loginURL="https://toefl-registration-dev.ets.org/TOEFLWeb/intIMASLogonPrompt.do";
		String LoginPageTitle="Log In";
		String actualTitle="";
		boolean testStatus=true;
		String usernam="devuserespc";
		String passwrd="0okm(IJN";
		String imasHomePageTitle="Welcome to iMAS Home";
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
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys(usernam);
		
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys(passwrd);

		WebElement loginButton=driver.findElement(By.xpath("//a//input[@src='/TOEFLWeb/cbsr/images/buttons/go_button.gif']"));
		loginButton.click();
		
		//S3.1 Login success
	
		
		if(driver.getTitle().equals(imasHomePageTitle)){
			
			System.out.println("LOGIN SUCCESS!!!");
		}
		else{
			WebElement loginFail=driver.findElement(By.xpath("//div//li"));
			
			String errorMessage=loginFail.getText();
			
			System.out.println("ERROR:"+errorMessage);
		}
		
	}

}
