package com.ying;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {

	public static void main(String[] args) {
		//create instance of webdriver. 
		WebDriver driver = new FirefoxDriver(); 
		
		//go to web page
		driver.navigate().to("http://freelancer.geekgamer.com/webapp");
		
		//click on the about link
		driver.findElement(By.id("about_link")).click(); 
			
		
		//check the "about zoo" title on the about page,
		if (driver.getTitle().equals("About Zoo")) {
			System.out.println("found the about page");
		} else {
			System.out.println("Did not find");
		}
		
		//close the driver. 
		driver.close();
	}

}
