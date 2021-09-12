package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	 public static WebDriver driver;
	 public static Properties pro;
	 
	 public Testbase() throws IOException {
		 pro =new Properties ();
		 FileInputStream input =new FileInputStream("D:/Eclipse_workspace_2021_03/ProjectGroupd/src/main/java/com/qa/config/config.properties");
	      pro.load(input);
	      }
	 public static  void initilization1() {
		String browsername =pro.getProperty("browser");
		if (browsername.equals("chrome")) {
	  
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if (browsername.equals("FireFox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Driver not found");
		}
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	public static void initilization() {
		// TODO Auto-generated method stub
		String browsername =pro.getProperty("browser");
		if (browsername.equals("chrome")) {
	  
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if (browsername.equals("FireFox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Driver not found");
		}
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 
	 
}
