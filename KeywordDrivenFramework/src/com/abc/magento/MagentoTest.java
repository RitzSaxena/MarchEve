package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream fis = new FileInputStream("C:\\Users\\HP ENVY\\Desktop\\MarchEve\\KeywordDrivenFramework\\src\\com\\abc\\utilities\\KeywordDriven.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String nmyacct = p.getProperty("myacct");
		String nusername = p.getProperty("username");
		String npassword = p.getProperty("password");
		String nlogin = p.getProperty("login");
		String nlogout = p.getProperty("logout");
		
		System.out.println(nmyacct);
		
		String url = "https://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.linkText(nmyacct)).click();
		driver.findElement(By.id(nusername)).sendKeys("mzaidurrahman@gmail.com");
		driver.findElement(By.id(npassword)).sendKeys("Welcome123");
		driver.findElement(By.id(nlogin)).click();
		driver.findElement(By.linkText(nlogout)).click();
		
		driver.close();
		
		
		
		
		
		

	}

}
